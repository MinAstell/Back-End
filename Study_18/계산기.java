package Study_18;

import java.awt.*;

public class 계산기 
{
	public static void main(String[] args)
	{
		Cal du = new Cal();
	}
}

class Cal extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btnAdd = new Button("+");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btnMin = new Button("-");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btnMul = new Button("*");
	Button btnc = new Button("c");
	Button btn0 = new Button("0");
	Button btnRc = new Button("=");
	Button btnDiv = new Button("/");

	Label lbRs = new Label("결과:");
	
	TextField tfRs = new TextField(20);
	
	Cal()
	{
		super("계산기");
		this.init();		
		this.setSize(310,420);
		this.center();//중앙배치		
		this.setVisible(true);
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(btn1); btn1.setFont(font30); 
		btn1.setBounds(20, 40, 60, 60);
		
		this.add(btn2); btn2.setFont(font30); 
		btn2.setBounds(90, 40, 60, 60);
		
		this.add(btn3); btn3.setFont(font30); 
		btn3.setBounds(160, 40, 60, 60);
		
		this.add(btnAdd); btnAdd.setFont(font30); 
		btnAdd.setBounds(230, 40, 60, 60);
		
		this.add(btn4); btn4.setFont(font30); 
		btn4.setBounds(20, 110, 60, 60);
		
		this.add(btn5); btn5.setFont(font30); 
		btn5.setBounds(90, 110, 60, 60);
		
		this.add(btn6); btn6.setFont(font30); 
		btn6.setBounds(160, 110, 60, 60);
		
		this.add(btnMin); btnMin.setFont(font30); 
		btnMin.setBounds(230, 110, 60, 60);
		
		this.add(btn7); btn7.setFont(font30); 
		btn7.setBounds(20, 180, 60, 60);

		this.add(btn8); btn8.setFont(font30); 
		btn8.setBounds(90, 180, 60, 60);
		
		this.add(btn9); btn9.setFont(font30); 
		btn9.setBounds(160, 180, 60, 60);
		
		this.add(btnMul); btnMul.setFont(font30); 
		btnMul.setBounds(230, 180, 60, 60);
		
		this.add(btnc); btnc.setFont(font30); 
		btnc.setBounds(20, 250, 60, 60);
		
		this.add(btn0); btn0.setFont(font30); 
		btn0.setBounds(90, 250, 60, 60);
		
		this.add(btnRc); btnRc.setFont(font30); 
		btnRc.setBounds(160, 250, 60, 60);
		
		this.add(btnDiv); btnDiv.setFont(font30); 
		btnDiv.setBounds(230, 250, 60, 60);
		
		this.add(lbRs); lbRs.setFont(font20); 
		lbRs.setBounds(45, 330, 60, 60);
		
		this.add(tfRs); tfRs.setFont(font30); 
		tfRs.setBounds(115, 341, 150, 35);
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