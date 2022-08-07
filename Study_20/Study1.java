package Study_20;

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

public class Study1 
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
	int success = 0;
	int fail = 0;
	int game_ing;
	String name = "";
	int pan = 0, hd = 0, tot = 0;
	String result = "";
	String data4 = "";
	
	Label lbplayer = new Label("축구선수 : Unknown");
	Label lbresult = new Label("결과: 대기중...");
	Label lbscore = new Label("총전적: " + tot + "게임");
	Label lbwin = new Label("슛성공: 0회");
	Label lblose = new Label("슛실패: 0회");
	Label lbplayer_list = new Label("선수리스트");
	Label lbalam = new Label("ErrorMessege");
	Label lbalam2 = new Label("총게임가능횟수: " + game_ing);

	Button btnsh = new Button("중거리슛");
	Button btnhd = new Button("헤딩");
	Button btnpan = new Button("패널티슛");
	Button btninit = new Button("전적초기화");
	Button btnsave = new Button("파일저장");
	Button btnload = new Button("게임통계");
	
	private Dialog dlg1 = new Dialog(this, "챔피언스리그 우승");
	private Label dlg1lb = new Label("챔피언스리그우승! 콩그리츄레이션~!");
	private Dialog dlg2 = new Dialog(this, "게임횟수정하기");
	private Dialog dlg3 = new Dialog(this, "통계결과");
	private Label dlg1lb2 = new Label("게임횟수:");
	private Button btnok = new Button("시작하기");
	
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
		
		this.add(lbplayer_list); lbplayer_list.setFont(font30); 
		lbplayer_list.setBounds(30, 40, 160, 30);
		
		this.add(player_list); player_list.setFont(font30); 
		player_list.setBounds(30, 80, 160, 120);
		
		this.add(lbplayer); lbplayer.setFont(font30); 
		lbplayer.setBounds(230, 55, 290, 30);
		
		this.add(btnsh); btnsh.setFont(font20); 
		btnsh.setBounds(230, 95, 130, 40);
		
		this.add(btnhd); btnhd.setFont(font20); 
		btnhd.setBounds(370, 95, 80, 40);
		
		this.add(btnpan); btnpan.setFont(font20); 
		btnpan.setBounds(462, 95, 130, 40);
		
		this.add(lbresult); lbresult.setFont(font20); 
		lbresult.setBounds(230, 155, 340, 40);
		
		this.add(lbscore); lbscore.setFont(font20); 
		lbscore.setBounds(220, 195, 180, 40);
		
		this.add(lbwin); lbwin.setFont(font20); 
		lbwin.setBounds(220, 235, 130, 40);
		
		this.add(lblose); lblose.setFont(font20); 
		lblose.setBounds(370, 235, 130, 40);
		
		this.add(lbalam); lbalam.setFont(font20); 
		lbalam.setBounds(370, 275, 230, 40);
		
		this.add(btninit); btninit.setFont(font20); 
		btninit.setBounds(230, 285, 130, 40);
		
		this.add(lbalam2); lbalam2.setFont(font20); 
		lbalam2.setBounds(190, 335, 190, 40); 
		
		this.add(btnsave); btnsave.setFont(font20); 
		btnsave.setBounds(630, 105, 100, 40);
		
		this.add(btnload); btnload.setFont(font20); 
		btnload.setBounds(630, 155, 100, 40);
		
		
		player_list.add("손흥민");
		player_list.add("메시");
		player_list.add("강날두");
	}
		
	public void start()
	{
		// Event나 쓰레드 처리할 부분
		btnsh.addMouseListener(this);
		btnhd.addMouseListener(this);
		btnpan.addMouseListener(this);
		player_list.addMouseListener(this);
		btninit.addMouseListener(this);
		btnok.addMouseListener(this);
		btnsave.addMouseListener(this);
		btnload.addMouseListener(this);
		
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
		
		if(e.getSource() == btnsh)
		{
			if(game_ing == 0) 
			{
				lbalam2.setText("시도횟수초과");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("축구선수 : Unknown"))
			{
				lbalam.setText("선수를 선택해주세요.");
				return;
			}
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("선수가 선택되었습니다.");
				
				if(rand <= 3)
				{
					lbresult.setText("중거리슛이 성공!");
					success++;
					lbwin.setText("슛성공: " + success + "회");
				}
				else
				{
					lbresult.setText("중거리슛이 실패!");
					fail++;
					lblose.setText("슛실패: " + fail + "회");
				}
				game_ing--;
				tot++;
				lbscore.setText("총전적: " + tot + "게임");
				lbalam2.setText("총게임가능횟수: " + game_ing);
		}
		if(e.getSource() == btnhd)
		{
			if(hd == 2)
			{
				lbalam.setText("헤딩슛범위초과");
				return;
			}
			
			if(game_ing == 0) 
			{
				lbalam2.setText("시도횟수초과");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("축구선수 : Unknown"))
			{
				lbalam.setText("선수를 선택해주세요.");
				return;
			}
	
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("선수가 선택되었습니다.");
				
				if(rand <= 5)
				{
					lbresult.setText("헤딩슛이 성공!");
					success++;
					lbwin.setText("슛성공: " + success + "회");
					hd++;
				}
				else
				{
					lbresult.setText("헤딩슛이 실패!");
					fail++;
					lblose.setText("슛실패: " + fail + "회");
				}
				game_ing--;
				tot++;
				lbscore.setText("총전적: " + tot + "게임");
				lbalam2.setText("총게임가능횟수: " + game_ing);
		}
		if(e.getSource() == btnpan)
		{
			if(pan == 1)
			{
				lbalam.setText("패널티슛 허용범위초과");
				return;
			}
				
			if(game_ing == 0) 
			{
				lbalam2.setText("시도횟수초과");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("축구선수 : Unknown"))
			{
				lbalam.setText("선수를 선택해주세요.");
				return;
			}
	
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("선수가 선택되었습니다.");
			
				if(rand <= 9)
				{
					lbresult.setText("패널티슛이 성공!");
					success++;
					lbwin.setText("슛성공: " + success + "회");
					pan++;
				}
				else
				{
					lbresult.setText("패널티슛이 실패!");
					fail++;
					lblose.setText("슛실패: " + fail + "회");
				}
				game_ing--;
				tot++;
				lbscore.setText("총전적: " + tot + "게임"); 
				lbalam2.setText("총게임가능횟수: " + game_ing);
		}
		
		if(e.getSource() == player_list)
		{
			name = player_list.getSelectedItem();
			lbplayer.setText("축구선수: " + name);
		}
		
		if(e.getSource() == btninit)
		{
			fail = 0;
			success = 0;
			pan = 0;
			hd = 0;
			game_ing = 20;
			
			lbscore.setText("총전적: 0회");
			lbwin.setText("슛성공: 0회");
			lblose.setText("슛실패: 0회");
			lbalam2.setText("총게임가능횟수: " + game_ing);
			
		}
		
		if(success == 8)
		{
			dlg();
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