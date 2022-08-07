package Study_18;

import java.awt.*;
import java.awt.event.*;

public class 버튼리스너_출력테스트 
{
	public static void main(String[] ar) {
		Event round = new Event();
	}
}

class Event extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	private Label lbName = new Label("이름:");
	private Label lbRs1 = new Label("결과:");
	private Label lbRs2 = new Label("결과:");
	private Label lbWait = new Label("대기중..");
	
	TextField tfName = new TextField(20);
	TextField tfRs2 = new TextField(20);

	private Button btPrint = new Button("출력");

	public Event() 
	{
		super("출력테스트");
		this.init();
		this.start();
		this.setSize(290, 345);
		this.center();
		this.setVisible(true);
	}

	public void init() 
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbName); lbName.setFont(font20); 
		lbName.setBounds(20, 60, 70, 60);
		
		this.add(tfName); tfName.setFont(font20); 
		tfName.setBounds(120, 70, 130, 35);
		
		this.add(btPrint); btPrint.setFont(font20); 
		btPrint.setBounds(100, 135, 90, 35);
		
		this.add(lbRs1); lbRs1.setFont(font20); 
		lbRs1.setBounds(30, 185, 70, 60);
		
		this.add(lbWait); lbWait.setFont(font20); 
		lbWait.setBounds(120, 185, 120, 60);
		
		this.add(lbRs2); lbRs2.setFont(font20); 
		lbRs2.setBounds(30, 245, 70, 60);
		
		this.add(tfRs2); tfRs2.setFont(font20); 
		tfRs2.setBounds(120, 255, 130, 35);
	}

	public void start()
	{
		// Event나 쓰레드 처리할 부분
		btPrint.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) 
	{
		String data = tfName.getText();
		tfRs2.setText(data);
		lbWait.setText(data);
		System.out.println("가져온 데이터: " + data);
	}
	
	public void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
}
