package Study_22;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Join2 extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("회원가입");
	Label lbId = new Label("아 이 디  :");
	Label lbPw = new Label("비밀번호 :");
	Label lbPw2 = new Label("비번확인 :");
	Label lbName = new Label("이    름 :");
	Label lbHp = new Label("연락처 :");
	Label lbage = new Label("나이 :");
	
	TextField tfId = new TextField(20);
	TextField tfPw = new TextField(20);
	TextField tfPw2 = new TextField(20);
	TextField tfName = new TextField(20);
	TextField tfHp = new TextField(20);
	TextField tfage = new TextField(20);
		
	Button btnJoin = new Button("가입하기");
	
	private Dialog dlg = new Dialog(this, "통계결과");
	private Label dlglb = new Label("회원가입이 완료되었습니다.");
	
	Join2(){
		super("회원가입");
		this.init();
		this.start();
		this.setSize(500,500);
		this.center();//중앙배치		
		this.setVisible(true);
	}
	public void dlg()
	{
			this.setLayout(null);
			
			dlg.add(dlglb); 
			dlg.setSize(220, 300);
			dlg.setVisible(true);
			
			Dimension dimen3 = dlg.getSize();
			Dimension dimen0 = Toolkit.getDefaultToolkit().getScreenSize();
			xpos = (int) (dimen0.getWidth() / 2 - dimen3.getWidth() / 2);
			ypos = (int) (dimen0.getHeight() / 2 - dimen3.getHeight() / 2);
			dlg.setLocation(xpos, ypos);
			
			dlg.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg.setVisible(false);
				}
			});
	}
	public void start()
	{
		btnJoin.addActionListener(this);
		
		
		
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
		lbTitle.setBounds(170, 50, 200, 30);
		
		this.add(lbId); lbId.setFont(font20); 
		lbId.setBounds(50, 100, 100, 30);
		
		this.add(tfId); tfId.setFont(font20); 
		tfId.setBounds(200, 100, 150, 30);
		
		this.add(btnJoin); btnJoin.setFont(font20); 
		btnJoin.setBounds(150, 420, 120, 30);
		
		this.add(lbPw); lbPw.setFont(font20); 
		lbPw.setBounds(50, 150, 100, 30);
		
		this.add(tfPw); tfPw.setFont(font20); 
		tfPw.setBounds(200, 150, 150, 30);
		
		this.add(lbPw2); lbPw2.setFont(font20); 
		lbPw2.setBounds(50, 200, 100, 30);
		
		this.add(tfPw2); tfPw2.setFont(font20); 
		tfPw2.setBounds(200, 200, 150, 30);
		
		this.add(lbName); lbName.setFont(font20); 
		lbName.setBounds(50, 250, 100, 30);
		
		this.add(tfName); tfName.setFont(font20); 
		tfName.setBounds(200, 250, 150, 30);	
		
		this.add(lbHp); lbHp.setFont(font20); 
		lbHp.setBounds(50, 300, 100, 30);
		
		this.add(tfHp); tfHp.setFont(font20); 
		tfHp.setBounds(200, 300, 150, 30);	
		
		this.add(lbage); lbage.setFont(font20); 
		lbage.setBounds(50, 350, 100, 30);
		
		this.add(tfage); tfage.setFont(font20); 
		tfage.setBounds(200, 350, 150, 30);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == btnJoin) {
			dlg();
		}
	}
}

