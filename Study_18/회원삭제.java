package Study_18;

import java.awt.*;

public class ȸ������ 
{
	public static void main(String[] args)
	{
		Delete_user du = new Delete_user();
	}
}

class Delete_user extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("ȸ������ ȭ��");
	Label lbId = new Label("���̵� :");
	Label lbList = new Label("ȸ������Ʈ");
	
	TextField tfList = new TextField(20);
	
	Button btnSearch = new Button("���˻�");
	Button btnAll = new Button("��ü����");
	
	private TextArea ta = new TextArea("��ϵ� ȸ�������� �����ϴ�..");
	
	Delete_user()
	{
		super("ȸ������");
		this.init();		
		this.setSize(500,500);
		this.center();//�߾ӹ�ġ		
		this.setVisible(true);
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbTitle); lbTitle.setFont(font30); 
		lbTitle.setBounds(150, 50, 200, 30);
		
		this.add(lbId); lbId.setFont(font20); 
		lbId.setBounds(50, 130, 100, 30);
		
		this.add(tfList); tfList.setFont(font20); 
		tfList.setBounds(200, 130, 130, 30);
		
		this.add(btnSearch); btnSearch.setFont(font20); 
		btnSearch.setBounds(350, 130, 100, 30);
		
		this.add(btnAll); btnAll.setFont(font20); 
		btnAll.setBounds(350, 180, 100, 30);
		
		this.add(lbList); lbList.setFont(font20); 
		lbList.setBounds(50, 250, 130, 30);
		
		this.add(ta); ta.setFont(font20); 
		ta.setBounds(50, 290, 405, 150);
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