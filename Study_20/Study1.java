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
	
	Label lbplayer = new Label("�౸���� : Unknown");
	Label lbresult = new Label("���: �����...");
	Label lbscore = new Label("������: " + tot + "����");
	Label lbwin = new Label("������: 0ȸ");
	Label lblose = new Label("������: 0ȸ");
	Label lbplayer_list = new Label("��������Ʈ");
	Label lbalam = new Label("ErrorMessege");
	Label lbalam2 = new Label("�Ѱ��Ӱ���Ƚ��: " + game_ing);

	Button btnsh = new Button("�߰Ÿ���");
	Button btnhd = new Button("���");
	Button btnpan = new Button("�г�Ƽ��");
	Button btninit = new Button("�����ʱ�ȭ");
	Button btnsave = new Button("��������");
	Button btnload = new Button("�������");
	
	private Dialog dlg1 = new Dialog(this, "è�Ǿ𽺸��� ���");
	private Label dlg1lb = new Label("è�Ǿ𽺸��׿��! ��׸����̼�~!");
	private Dialog dlg2 = new Dialog(this, "����Ƚ�����ϱ�");
	private Dialog dlg3 = new Dialog(this, "�����");
	private Label dlg1lb2 = new Label("����Ƚ��:");
	private Button btnok = new Button("�����ϱ�");
	
	TextField tfgame = new TextField(20);
	TextArea ta = new TextArea();
	
	private List player_list = new List();
	
	player_list()
	{
		super("��������Ʈ");	
		this.init();	
		this.start();
		this.dlg2();
		this.setSize(790,400);
		this.center();//�߾ӹ�ġ		
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
		
		
		player_list.add("�����");
		player_list.add("�޽�");
		player_list.add("������");
	}
		
	public void start()
	{
		// Event�� ������ ó���� �κ�
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
	            //���� ��ü ����
			   
			   	Date nowDate = new Date();       
	    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");      
	    		String now = simpleDateFormat.format(nowDate);
	    		
	            File file = new File("C:\\aaa\\work\\scg.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	            
	            String name2 = player_list.getSelectedItem();
	            
	            result += name2 + "/" + tot + "ȸ����/������" + success + "/������" + fail + " " + now + "\n"; 
 		
	            bufferedWriter.write(result);	                        	             
	            bufferedWriter.close();           
	    
	        }catch (IOException e) {
	            System.out.println(e);
	        }
	   }
	
	void loadDataInit()
	{		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\scg.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
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
			lbalam2.setText("�Ѱ��ɰ���Ƚ��: " + game_ing);
			
			dlg2.setVisible(false);
		}
		
		if(e.getSource() == btnsh)
		{
			if(game_ing == 0) 
			{
				lbalam2.setText("�õ�Ƚ���ʰ�");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("�౸���� : Unknown"))
			{
				lbalam.setText("������ �������ּ���.");
				return;
			}
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("������ ���õǾ����ϴ�.");
				
				if(rand <= 3)
				{
					lbresult.setText("�߰Ÿ����� ����!");
					success++;
					lbwin.setText("������: " + success + "ȸ");
				}
				else
				{
					lbresult.setText("�߰Ÿ����� ����!");
					fail++;
					lblose.setText("������: " + fail + "ȸ");
				}
				game_ing--;
				tot++;
				lbscore.setText("������: " + tot + "����");
				lbalam2.setText("�Ѱ��Ӱ���Ƚ��: " + game_ing);
		}
		if(e.getSource() == btnhd)
		{
			if(hd == 2)
			{
				lbalam.setText("����������ʰ�");
				return;
			}
			
			if(game_ing == 0) 
			{
				lbalam2.setText("�õ�Ƚ���ʰ�");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("�౸���� : Unknown"))
			{
				lbalam.setText("������ �������ּ���.");
				return;
			}
	
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("������ ���õǾ����ϴ�.");
				
				if(rand <= 5)
				{
					lbresult.setText("������� ����!");
					success++;
					lbwin.setText("������: " + success + "ȸ");
					hd++;
				}
				else
				{
					lbresult.setText("������� ����!");
					fail++;
					lblose.setText("������: " + fail + "ȸ");
				}
				game_ing--;
				tot++;
				lbscore.setText("������: " + tot + "����");
				lbalam2.setText("�Ѱ��Ӱ���Ƚ��: " + game_ing);
		}
		if(e.getSource() == btnpan)
		{
			if(pan == 1)
			{
				lbalam.setText("�г�Ƽ�� �������ʰ�");
				return;
			}
				
			if(game_ing == 0) 
			{
				lbalam2.setText("�õ�Ƚ���ʰ�");
				return;
			}
			
			name = lbplayer.getText();
			
			if(name.equals("�౸���� : Unknown"))
			{
				lbalam.setText("������ �������ּ���.");
				return;
			}
	
				int rand = (int)(Math.random()*10 +1);
				lbalam.setText("������ ���õǾ����ϴ�.");
			
				if(rand <= 9)
				{
					lbresult.setText("�г�Ƽ���� ����!");
					success++;
					lbwin.setText("������: " + success + "ȸ");
					pan++;
				}
				else
				{
					lbresult.setText("�г�Ƽ���� ����!");
					fail++;
					lblose.setText("������: " + fail + "ȸ");
				}
				game_ing--;
				tot++;
				lbscore.setText("������: " + tot + "����"); 
				lbalam2.setText("�Ѱ��Ӱ���Ƚ��: " + game_ing);
		}
		
		if(e.getSource() == player_list)
		{
			name = player_list.getSelectedItem();
			lbplayer.setText("�౸����: " + name);
		}
		
		if(e.getSource() == btninit)
		{
			fail = 0;
			success = 0;
			pan = 0;
			hd = 0;
			game_ing = 20;
			
			lbscore.setText("������: 0ȸ");
			lbwin.setText("������: 0ȸ");
			lblose.setText("������: 0ȸ");
			lbalam2.setText("�Ѱ��Ӱ���Ƚ��: " + game_ing);
			
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