package Study_21;

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

public class 코드모음 
{
	public static void main(String[] args)
	{
		player_list du = new player_list();
	}
}

class player_list extends Frame implements ActionListener, MouseListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	
	Label lbplayer = new Label("축구선수 : Unknown");
	private Label dlg1lb = new Label("챔피언스리그우승! 콩그리츄레이션~!");
	
	Button btnsh = new Button("중거리슛");
	
	private Dialog dlg1 = new Dialog(this, "챔피언스리그 우승");
	
	TextField tfgame = new TextField(20);
	TextArea ta = new TextArea();
	
	private List player_list = new List();
	
	player_list()
	{
		super("선수리스트");	
		this.init();	
		this.start();
		this.dlg2();
		this.setSize(790,400);
		this.center();//중앙배치		
		this.setVisible(true);
	}
	
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(player_list); player_list.setFont(font30); 
		player_list.setBounds(30, 80, 160, 120);
	
		player_list.add("손흥민");
		player_list.add("메시");
		player_list.add("강날두");
	}
		
	public void start()
	{
		// Event나 쓰레드 처리할 부분
		btnsh.addMouseListener(this);
		player_list.addMouseListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void dlg()
	{
			this.setLayout(null);
			
			dlg1.add(dlg1lb); 
			dlg1.setSize(220, 300);
			dlg1.setVisible(true);
			
			Dimension dimen3 = dlg1.getSize();
			Dimension dimen0 = Toolkit.getDefaultToolkit().getScreenSize();
			xpos = (int) (dimen0.getWidth() / 2 - dimen3.getWidth() / 2);
			ypos = (int) (dimen0.getHeight() / 2 - dimen3.getHeight() / 2);
			dlg1.setLocation(xpos, ypos);
			
			dlg1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg1.setVisible(false);
				}
			});
	}
	
	public void dlg2()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
			dlg2.setLayout(null);
			
			dlg2.add(dlg1lb2); dlg1lb2.setFont(font20); 
			dlg1lb2.setBounds(50, 55, 120, 40);
			
			dlg2.add(tfgame); tfgame.setFont(font20); 
			tfgame.setBounds(170, 55, 40, 38);
			
			dlg2.add(btnok); btnok.setFont(font20); 
			btnok.setBounds(140, 100, 90, 33);
			
			dlg2.setSize(350, 150);
			dlg2.setVisible(true);
			
			Dimension dimen4 = dlg2.getSize();
			Dimension dimen5 = Toolkit.getDefaultToolkit().getScreenSize();
			xpos = (int) (dimen5.getWidth() / 2 - dimen4.getWidth() / 2);
			ypos = (int) (dimen5.getHeight() / 2 - dimen4.getHeight() / 2);
			dlg2.setLocation(xpos, ypos);
			
			dlg2.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg2.setVisible(false);
				}
			});
	}
	
	public void dlg3()
	{
		loadDataInit();
		
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
			dlg3.setLayout(null);
			
			dlg3.add(ta); ta.setFont(font20); 
			ta.setBounds(50, 35, 580, 480);
			
			dlg3.setSize(700, 550);
			dlg3.setVisible(true);
			
			Dimension dimen4 = dlg3.getSize();
			Dimension dimen5 = Toolkit.getDefaultToolkit().getScreenSize();
			xpos = (int) (dimen5.getWidth() / 2 - dimen4.getWidth() / 2);
			ypos = (int) (dimen5.getHeight() / 2 - dimen4.getHeight() / 2);
			dlg3.setLocation(xpos, ypos);
			
			dlg3.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg3.setVisible(false);
				}
			});
	}
	

	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	void center() 
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	
	void save() {
		   try{
	            //파일 객체 생성
			   
			   	Date nowDate = new Date();       
	    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");      
	    		String now = simpleDateFormat.format(nowDate);
	    		
	            File file = new File("C:\\aaa\\work\\scg.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	            
	            String name2 = player_list.getSelectedItem();
	            
	            result += name2 + "/" + tot + "회도전/슛성공" + success + "/슛실패" + fail + " " + now + "\n"; 
 		
	            bufferedWriter.write(result);	                        	             
	            bufferedWriter.close();           
	    
	        }catch (IOException e) {
	            System.out.println(e);
	        }
	   }
	
	void loadDataInit()
	{		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\scg.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            

            while((line = bufReader.readLine()) != null){
            	 data4 += line + "\n";
            	 ta.setText(data4);
            }            
            
            bufReader.close(); data4 = "";
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btnsave)
		{
			save();
		}
		
		if(e.getSource() == btnload)
		{
			dlg3();
		}
		
		if(e.getSource() == btnok)
		{
			String game_num = tfgame.getText();
			int score2 = Integer.parseInt(game_num);
			
			game_ing = score2;
			lbalam2.setText("총가능게임횟수: " + game_ing);
			
			dlg2.setVisible(false);
		}
		
		if(e.getSource() == player_list)
		{
			name = player_list.getSelectedItem();
			lbplayer.setText("축구선수: " + name);
		}
		
		if (e.getSource() == bt) {
			bt.setEnabled(false);
			bt1.setEnabled(true);
			bt1.requestFocus();
			w = h = 200;
			this.repaint();
		}
	} 

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
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