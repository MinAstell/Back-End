package Study_17;
import java.awt.*;
public class Study1
{
	public static void main(String[] args)
	{
		join f= new join();
	}
}

class join extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;

	Label lbTitle = new Label("ȸ������");
	Label lbId = new Label("���̵�: ");
	Label lbPw = new Label("��й�ȣ: ");
	Label lbPwCk = new Label("��й�ȣ Ȯ��: ");
	Label lbName = new Label("�̸�: ");
	Label lbPh = new Label("��ȭ��ȣ: ");
	TextField tfId = new TextField(20);
	TextField tfPw = new TextField(20);
	TextField tfPwCk = new TextField(20);
	TextField tfName = new TextField(20);
	TextField tfPh = new TextField(20);
	
	Button btnJoin = new Button("�����ϱ�");
	Button btnCk = new Button("�ߺ�üũ");
	
	join()
	{
		super("ȸ������");
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
		lbTitle.setBounds(134, 70, 126, 30);
		
		this.add(lbId); lbId.setFont(font20);  
		lbId.setBounds(30, 130, 80, 30);
		
		this.add(tfId); tfId.setFont(font20);  
		tfId.setBounds(110, 130, 100, 30);
		
		this.add(btnCk); btnCk.setFont(font20);  
		btnCk.setBounds(230, 128, 100, 30);
		
		this.add(lbPw); lbPw.setFont(font20);  
		lbPw.setBounds(30, 170, 100, 30);
		
		this.add(tfPw); tfPw.setFont(font20);  
		tfPw.setBounds(130, 170, 100, 30);
		
		this.add(lbPwCk); lbPwCk.setFont(font20);  
		lbPwCk.setBounds(30, 210, 150, 30);
		
		this.add(tfPwCk); tfPwCk.setFont(font20);  
		tfPwCk.setBounds(180, 210, 100, 30);
		
		this.add(lbName); lbName.setFont(font20);  
		lbName.setBounds(30, 250, 60, 30);
		
		this.add(tfName); tfName.setFont(font20);  
		tfName.setBounds(90, 250, 100, 30);
		
		this.add(lbPh); lbPh.setFont(font20);  
		lbPh.setBounds(30, 290, 100, 30);
		
		this.add(tfPh); tfPh.setFont(font20);  
		tfPh.setBounds(130, 290, 100, 30);
		
		this.add(btnJoin); btnJoin.setFont(font20);  
		btnJoin.setBounds(150, 360, 100, 40);
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
