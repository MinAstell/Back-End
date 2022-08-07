package Study_19;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Study1 {
	public static void main(String[] args) {		
		Up_score f = new Up_score();		
	}
}
class Up_score extends Frame implements MouseListener{
	//폰트를 자주사용해서 위에 클래스 변수로 배치해놓음.
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	int score = 0;
	
	Button btn1 = new Button("+1점");
	Button btn2 = new Button("+2점");
	Button btn3 = new Button("+3점");
	
	private TextArea ta = new TextArea();

	
	Up_score()
	{
		super("Up_score");
		this.setSize(400,500);
		this.center();
		this.init();
		this.start();	
		this.setVisible(true);
	}
	
	public void init() 
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(btn1); btn1.setFont(font20); 
		btn1.setBounds(30, 40, 80, 60);
		
		this.add(btn2); btn2.setFont(font20); 
		btn2.setBounds(130, 40, 80, 60);
		
		this.add(btn3); btn3.setFont(font20); 
		btn3.setBounds(230, 40, 80, 60);
		
		this.add(ta); ta.setFont(font20); 
		ta.setBounds(30, 150, 280, 250);
		
	}

	public void start()
	{
		// Event나 쓰레드 처리할 부분
		
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	

	public void mouseEntered(MouseEvent e) {
		
		if(e.getSource() == btn1)
		{
			score++;
			ta.setText("현재점수 : " + score + "점");
		}
		if(e.getSource() == btn2)
		{
			score += 2;
			ta.setText("현재점수 : " + score + "점");
		}
		if(e.getSource() == btn3)
		{
			score += 3;
			ta.setText("현재점수 : " + score + "점");
		}
		
		}

	public void mouseExited(MouseEvent e) {
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}














