package Study_23;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Select_Info extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("조회화면");
	Label lbName = new Label("이름 :");
	
	TextField tfName = new TextField(20);
	
	Button btnSearch = new Button("검색");
	Button btnSearch_All = new Button("전체검색");
	Button btnadd = new Button("추가하기");
	
	TextArea ta = new TextArea();
	
	String name, data = "";
	
	Select_Info(){
		super("회원가입");
		this.init();
		this.start();
		this.setSize(700,500);
		this.center();//중앙배치		
		this.setVisible(true);
	}
	
	public void start()
	{
		btnSearch.addActionListener(this);
		btnSearch_All.addActionListener(this);
		btnadd.addActionListener(this);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbTitle); lbTitle.setFont(font30); 
		lbTitle.setBounds(60, 50, 200, 30);
		
		this.add(lbName); lbName.setFont(font30); 
		lbName.setBounds(60, 100, 80, 30);
		
		this.add(tfName); tfName.setFont(font30); 
		tfName.setBounds(160, 100, 120, 30);
		
		this.add(btnSearch); btnSearch.setFont(font30); 
		btnSearch.setBounds(300, 100, 70, 30);
		
		this.add(btnadd); btnadd.setFont(font30); 
		btnadd.setBounds(380, 100, 126, 30);
		
		this.add(btnSearch_All); btnSearch_All.setFont(font30); 
		btnSearch_All.setBounds(288, 164, 130, 30);
		
		this.add(ta); ta.setFont(font20); 
		ta.setBounds(60, 217, 405, 250);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	void dbConn() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.exit(0);
		}
		
		
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String id = "root";
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member where name=" + "\"" + name + "\"";
		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				data += rs.getInt(1) + " | " + rs.getString(2)
				+ " | " + rs.getString(3)
				+ " | " + rs.getString(4)
				+ " | " + rs.getString(5) + "\n";
			}
			ta.setText(data);
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void dbConn2() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.exit(0);
		}
		
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String id = "root";
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		data = "";
		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				data += rs.getInt(1) + " | " + rs.getString(2)
				+ " | " + rs.getString(3)
				+ " | " + rs.getString(4)
				+ " | " + rs.getString(5) + "\n";
			}
			ta.setText(data);
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == btnSearch) {
			
			name = tfName.getText();
			
			if(name.equals("")) {
				return;
			}
			
			dbConn();
		}
		
		if(arg0.getSource() == btnSearch_All) {
			
			dbConn2();
		}
	}
}

