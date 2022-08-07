package Study_18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ÿ�ڸ�Ʈ���� 
{
	public static void main(String[] args)
	{
		Ment_game mg = new Ment_game();
	}
}

class Ment_game extends Frame implements ActionListener 
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	int anta = 0;
	int hr = 0;
	int pw = 0;
	
	Label lbPlayer = new Label("Ÿ��:");
	Label lbScore = new Label("������");
	Label lbAnta = new Label("��Ÿ: " + anta);
	Label lbHr = new Label("Ȩ��: " + hr);
	Label lbPw = new Label("�Ŀ�: " + pw);
	Label lbNum = new Label("ī��Ʈ �����..");
	Label lbMent = new Label("��Ʈ �����..");
	
	String Num[] = {"3...", "2...", "1..."};
	String Ment[] = {"��Ÿ�� �ƽ��ϴ�.", "Ȩ���� �ƽ��ϴ�.", "�Ŀ��� �ƽ��ϴ�."};
	
	TextField tfPlayer = new TextField(20);
	
	Button btnStart = new Button("���� ��ŸƮ!");
	
	Ment_game()
	{
		super("������ ����");
		this.start();
		this.init();
		this.setSize(370,450);
		this.center();//�߾ӹ�ġ	
		this.setVisible(true);
	}
	
	public void start()
	{
		// Event�� ������ ó���� �κ�
		btnStart.addActionListener(this);
	
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) 
	{
		String name = tfPlayer.getText();
		
		if(name.equals(""))
		{
			lbMent.setText("�÷��̾� �̸��� �Է����ּ���.");
			return;
		}
		
		int dice = (int)(Math.random()*3);
		
		System.out.println(dice);
		
		if(e.getSource() == btnStart)
		{
			lbMent.setText("��Ʈ �����..");
			
			lbNum.setText(Num[0]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			
			lbNum.setText(Num[1]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			
			lbNum.setText(Num[2]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
	
			lbMent.setText(Ment[dice]);
			
			lbNum.setText("ī��Ʈ �Ϸ�");
			
			if(dice == 0)
			{
				anta++;
				lbAnta.setText("��Ÿ: " + anta);
			}
			else if(dice == 1)
			{
				hr++;
				lbHr.setText("Ȩ��: " + hr);
			}
			else if(dice == 2)
			{
				pw++;
				lbPw.setText("�Ŀ�: " + pw);
			}
		}
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbPlayer); lbPlayer.setFont(font20); 
		lbPlayer.setBounds(30, 50, 60, 35);
		
		this.add(tfPlayer); tfPlayer.setFont(font20); 
		tfPlayer.setBounds(110, 50, 130, 35);
		
		this.add(btnStart); btnStart.setFont(font20); 
		btnStart.setBounds(90, 100, 140, 35);
		
		this.add(lbScore); lbScore.setFont(font20); 
		lbScore.setBounds(30, 270, 140, 35);
		
		this.add(lbAnta); lbAnta.setFont(font20); 
		lbAnta.setBounds(45, 310, 90, 35);
		
		this.add(lbHr); lbHr.setFont(font20); 
		lbHr.setBounds(45, 345, 90, 35);
		
		this.add(lbPw); lbPw.setFont(font20); 
		lbPw.setBounds(45, 380, 90, 35);
		
		this.add(lbNum); lbNum.setFont(font20); 
		lbNum.setBounds(45, 170, 200, 35);
		
		this.add(lbMent); lbMent.setFont(font20); 
		lbMent.setBounds(25, 205, 200, 35);
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