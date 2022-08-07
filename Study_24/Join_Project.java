package test_project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Join_Project extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	
	Label lbTitle = new Label("Login Page");
	Label lbId = new Label("아이디 : ");
	Label lbPw = new Label("비번 : ");
	
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	
	Button btn = new Button("로그인");
	Button btn2 = new Button("회원가입");
	
	Join_Project()
	{
		super("로그인");
		this.setSize(400,550);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {		
		this.setLayout(null);
		this.add(lbTitle);this.add(lbId);this.add(lbPw);
		this.add(tfId);this.add(tfPw);
		this.add(btn); this.add(btn2);
		
		lbTitle.setBounds(120, 50, 200, 30);lbTitle.setFont(font30);
		lbId.setBounds(50, 100, 100, 30);lbId.setFont(font20);
		tfId.setBounds(150, 100, 150, 30);tfId.setFont(font20);
		
		lbPw.setBounds(50, 150, 100, 30);lbPw.setFont(font20);
		tfPw.setBounds(150, 150, 150, 30);tfPw.setFont(font20);
		
		btn.setBounds(150, 200, 100, 30);btn.setFont(font20);
		btn2.setBounds(150, 240, 100, 30);btn2.setFont(font20);
	}
	void start()
	{
		btn.addActionListener(this);
		btn2.addActionListener(this);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		String id = tfId.getText();
		String pw = tfPw.getText();
		
		if(e.getSource() == btn2) {
			
			Join_Project2 j2 = new Join_Project2();
		}
	
		//공백체크
		if(e.getSource() != btn2) {
			
			if(id.equals("")) {msg("아이디를 입력해주세요!"); return;}
			if(pw.equals("")) {msg("비밀번호를 입력하세요.");return;}
		}
		
		if(e.getSource() == btn) searchAll(id,pw);
	}
	
	void searchAll(String id, String pw)
	{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브가 연결안됨.");
			System.exit(0);
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";				
		String user = "root";
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, user, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			String result="";
			while (rs.next()) {
				
				if(rs.getString(2).equals(id)) {
					
					if(rs.getString(3).equals(pw)) {
						
						msg("로그인 성공! " + rs.getString(4) + "님 환영합니다.");
						Member2 m = new Member2();
						this.setVisible(false);
					}
				}		
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	
	
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(100, 100, 450, 30);
		
		dlg.setSize(450, 200);
		dlg.setLocation(735, 440);
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		dlg.setVisible(true);
	}
}

