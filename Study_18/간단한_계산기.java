package Study_18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 간단한_계산기 
{
	public static void main(String[] args)
	{
		cal2 du = new cal2();
	}
}

class cal2 extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbNum1 = new Label("첫번째 수:");
	Label lbNum2 = new Label("두번째 수:");
	Label lbRs = new Label("결과:");
	Label lbAlam = new Label("입력 대기중..");
	
	TextField tfNum1 = new TextField(20);
	TextField tfNum2 = new TextField(20);
	TextField tfRs = new TextField("수를 입력해주세요.");
	
	Button btnAdd = new Button("+");
	Button btnSum = new Button("-");
	Button btnMul = new Button("*");
	Button btnDiv = new Button("/");
	
	cal2()
	{
		super("간단한 계산기");
		this.start();
		this.init();
		this.setSize(370,400);
		this.center();//중앙배치	
		this.setVisible(true);
	}
	
	public void start()
	{
		// Event나 쓰레드 처리할 부분
		btnAdd.addActionListener(this);
		btnSum.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) 
	{
//		int Num1 = Integer.parseInt(tfNum1.getText());
//		int Num2 = Integer.parseInt(tfNum2.getText());
		
		String su1 = tfNum1.getText();
		String su2 = tfNum2.getText();
		
		if(su1.equals(""))
		{
			lbAlam.setText("첫번째 수를 입력해주세요.");
			return;
		}
		
		else if(su2.equals(""))
		{
			lbAlam.setText("두번째 수를 입력해주세요.");
			return;
		}
		
		int num1 = Integer.parseInt(su1);
		int num2 = Integer.parseInt(su2);
		
		
		
		if(e.getSource() == btnAdd)
		{
//			int Result = Num1 + Num2;
//			String Result2 = String.valueOf(Result);
			
			tfRs.setText(num1 + num2 + "");
		}
		else if(e.getSource() == btnSum)
		{
//			int Result = Num1 - Num2;
//			String Result2 = String.valueOf(Result);
			
			tfRs.setText(num1 - num2 + "");
		}
		else if(e.getSource() == btnMul)
		{
//			int Result = Num1 * Num2;
//			String Result2 = String.valueOf(Result);
			
			tfRs.setText(num1 * num2 + "");
		}
		else if(e.getSource() == btnDiv)
		{
//			int Result = Num1 / Num2;
//			String Result2 = String.valueOf(Result);
			
			tfRs.setText(num1 / num2 + "");
		}
		
		lbAlam.setText("정상적으로 처리되었습니다.");
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbNum1); lbNum1.setFont(font20); 
		lbNum1.setBounds(40, 90, 100, 35);
		
		this.add(lbNum2); lbNum2.setFont(font20); 
		lbNum2.setBounds(40, 145, 100, 35);
		
		this.add(tfNum1); tfNum1.setFont(font20); 
		tfNum1.setBounds(160, 95, 140, 30);
		
		this.add(tfNum2); tfNum2.setFont(font20); 
		tfNum2.setBounds(160, 145, 140, 30);
		
		this.add(btnAdd); btnAdd.setFont(font20); 
		btnAdd.setBounds(45, 200, 50, 50);
		
		this.add(btnSum); btnSum.setFont(font20); 
		btnSum.setBounds(120, 200, 50, 50);
		
		this.add(btnMul); btnMul.setFont(font20); 
		btnMul.setBounds(195, 200, 50, 50);
		
		this.add(btnDiv); btnDiv.setFont(font20); 
		btnDiv.setBounds(270, 200, 50, 50);
		
		this.add(lbRs); lbRs.setFont(font20); 
		lbRs.setBounds(45, 280, 55, 35);
		
		this.add(tfRs); tfRs.setFont(font20); 
		tfRs.setBounds(115, 280, 195, 35);
		
		this.add(lbAlam); lbAlam.setFont(font20); 
		lbAlam.setBounds(70, 330, 255, 75);
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