package Study_16;
import java.awt.*;
public class Study1
{
	public static void main(String[] args)
	{
		FirstWin f= new FirstWin();
	}
}

class FirstWin extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("�ڹ����α׷���");
	Label lbMent1 = new Label("���θ�");
	Label lbMent2 = new Label("�����Ϸ���");
	Label lbMent3 = new Label("��ư�� �����ÿ�");
	
	Button btnStart = new Button("����");
	
	FirstWin()
	{
		super("�����췹�̾ƿ�����");
		this.setSize(500,400);		
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
		lbTitle.setBounds(130, 50, 250, 50);
		
		this.add(lbMent1); lbMent1.setFont(font20);  
		lbMent1.setBounds(130, 100, 250, 50);
		
		this.add(lbMent2); lbMent2.setFont(font20);  
		lbMent2.setBounds(130, 150, 250, 50);
		
		this.add(lbMent3); lbMent3.setFont(font20);  
		lbMent3.setBounds(130, 200, 250, 50);
		
		this.add(btnStart); btnStart.setFont(font20);  
		btnStart.setBounds(200, 280, 100, 50);
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
