package Study_17;
import java.awt.*;
public class �α���
{
	public static void main(String[] args)
	{
		Login f= new Login();
	}
}

class Login extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;

	Label lbTitle = new Label("�α���");
	Label lbId = new Label("���̵�: ");
	Label lbPw = new Label("��й�ȣ: ");
	TextField tfId = new TextField(20);
	TextField tfPw = new TextField(20);
	
	Button btnLogin = new Button("�α���");
	Button btnJoin = new Button("ȸ������");
	
	Login()
	{
		super("�α���");
		this.setSize(400,450);		
		this.center();//�߾ӹ�ġ
		this.init();
		this.setVisible(true);
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbTitle); lbTitle.setFont(font30);  
		lbTitle.setBounds(150, 50, 100, 30);
		
		this.add(lbId); lbId.setFont(font20);  
		lbId.setBounds(50, 150, 100, 30);
		
		this.add(tfId); tfId.setFont(font20);  
		tfId.setBounds(200, 150, 100, 30);
		
		this.add(lbPw); lbPw.setFont(font20);  
		lbPw.setBounds(50, 200, 100, 30);
		
		this.add(tfPw); tfPw.setFont(font20);  
		tfPw.setBounds(200, 200, 100, 30);
		
		this.add(btnLogin); btnLogin.setFont(font20);  
		btnLogin.setBounds(130, 300, 100, 30);
		
		this.add(btnJoin); btnJoin.setFont(font20);  
		btnJoin.setBounds(130, 350, 100, 30);
	}
	
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		
		this.setLocation(xpos, ypos);
	}	
}
