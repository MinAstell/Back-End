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

public class Join_Project2 extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	
	Label lbTitle = new Label("ȸ������");
	Label lbId = new Label("���̵� : ");
	Label lbPw = new Label("��� : ");
	Label lbPw2 = new Label("���2 : ");
	Label lbName = new Label("�̸� : ");
	Label lbhp = new Label("���� : ");

	TextField tfId = new TextField();
	TextField tfName = new TextField();
	TextField tfPw = new TextField();
	TextField tfPw2 = new TextField();
	TextField tfHp = new TextField();
	
	Button btn = new Button("�����ϱ�");
	
	Join_Project2()
	{
		super("ȸ������");
		this.setSize(400,550);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {		
		this.setLayout(null);
		this.add(lbTitle);this.add(lbId);this.add(lbPw);
		this.add(lbPw2);this.add(lbName);this.add(lbhp);

		this.add(tfId);this.add(tfName);this.add(tfPw);
		this.add(tfPw2);this.add(tfHp);
		this.add(btn);
		
		lbTitle.setBounds(120, 50, 200, 30);lbTitle.setFont(font30);
		
		lbId.setBounds(50, 100, 100, 30);lbId.setFont(font20);
		tfId.setBounds(150, 100, 150, 30);tfId.setFont(font20);
		
		lbPw.setBounds(50, 150, 100, 30);lbPw.setFont(font20);
		tfPw.setBounds(150, 150, 150, 30);tfPw.setFont(font20);
		
		lbPw2.setBounds(50, 200, 100, 30);lbPw2.setFont(font20);
		tfPw2.setBounds(150, 200, 150, 30);tfPw2.setFont(font20);
		
		lbName.setBounds(50, 250, 100, 30);lbName.setFont(font20);
		tfName.setBounds(150, 250, 150, 30);tfName.setFont(font20);
		
		lbhp.setBounds(50, 300, 100, 30);lbhp.setFont(font20);
		tfHp.setBounds(150, 300, 150, 30);tfHp.setFont(font20);
		
		btn.setBounds(150, 400, 100, 30);btn.setFont(font20);
	}
	void start()
	{
		btn.addActionListener(this);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void actionPerformed(ActionEvent e) {
		String id = tfId.getText();
		String pw = tfPw.getText();
		String pw2 = tfPw2.getText();
		String name = tfName.getText();
		String hp = tfHp.getText();
		
		//����üũ
		if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
		if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
		if(name.equals("")) {msg("�̸��� �Է����ּ���!");return;}
		if(hp.equals("")) {msg("����ó���Է����ּ���!");return;}
		if(!pw.equals(pw2)) {msg("��й�ȣ�� Ȯ�����ּ���!");return;}
		
	
		insert(id,pw,name,hp);
	}
	
	void insert(String id,String pw,String name,String hp)
	{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺� ����!!");
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";
		String user = "root";// ID
		String password = "qwer";// ��й�ȣ
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException ee) {
			System.err.println("���ᰴü ��������!!");
		}		
		
		String pquery = "insert into member values (null, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, hp);			
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException ee) {
			System.err.println("Query ���� Ŭ���� ���� ����~!! : " + ee.toString());
		}

		
		// 5. Close �۾�
		try {			
			pstmt.close();			
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (SQLException ee) {
			System.err.println("�ݱ� ����~!!");
		}
		
		msg("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		this.setVisible(false);
		
	}
	
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(100, 100, 450, 30);
		
		dlg.setSize(650, 250);
		dlg.setLocation(800, 400);
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		dlg.setVisible(true);
	}

}

