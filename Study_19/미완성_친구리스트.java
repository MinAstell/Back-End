package Study_19;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 미완성_친구리스트 
{
	public static void main(String[] ar) {
		User_list ul = new User_list();
	}
}

class User_list extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	int i = 0;
	
	private Label lbName = new Label("이름:");
	private Label lbhp = new Label("전번:");
	private Label lbaddr = new Label("주소:");
	private Label lbul = new Label("친구리스트");
	private Label lbalam = new Label("알림대기..");
	
	TextField tfName = new TextField(20);
	TextField tfhp = new TextField(20);
	TextField tfaddr = new TextField(20);

	private Button btadd = new Button("추가하기");
	private Button btsave = new Button("파일저장");
	private Button btload = new Button("읽어오기");
	
//	private TextArea ta = new TextArea("1번/둘리/012831283/남극\n");
	private TextArea ta = new TextArea();
	
	String Result = "";

	public User_list() 
	{
		super("친구리스트");
		this.setSize(700, 400);
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
		
		this.add(lbName); lbName.setFont(font20); 
		lbName.setBounds(40, 60, 50, 30);
		
		this.add(tfName); tfName.setFont(font20); 
		tfName.setBounds(100, 60, 130, 30);
		
		this.add(lbhp); lbhp.setFont(font20); 
		lbhp.setBounds(40, 100, 50, 30);
		
		this.add(tfhp); tfhp.setFont(font20); 
		tfhp.setBounds(100, 100, 130, 30);
		
		this.add(lbaddr); lbaddr.setFont(font20); 
		lbaddr.setBounds(40, 140, 50, 30);
		
		this.add(tfaddr); tfaddr.setFont(font20); 
		tfaddr.setBounds(100, 140, 130, 30);
		
		this.add(btadd); btadd.setFont(font20); 
		btadd.setBounds(80, 210, 100, 30);
		
		this.add(lbul); lbul.setFont(font20); 
		lbul.setBounds(320, 40, 120, 30);
		
		this.add(ta); ta.setFont(font20); 
		ta.setBounds(320, 80, 350, 250);
		
		this.add(lbalam); lbalam.setFont(font20); 
		lbalam.setBounds(70, 180, 220, 30);
		
		this.add(btsave); btsave.setFont(font20); 
		btsave.setBounds(80, 270, 100, 30);
		
		this.add(btload); btload.setFont(font20); 
		btload.setBounds(80, 320, 100, 30);
	}

	public void start()
	{
		// Event나 쓰레드 처리할 부분
		btadd.addActionListener(this);
		btsave.addActionListener(this);
		btload.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) 
	{
		String name = tfName.getText();
		String hp = tfhp.getText();
		String addr = tfaddr.getText();
		
		
		
		if(e.getSource() == btadd)
		{
			String data = tfName.getText();
			String data1 = tfhp.getText();
			String data2 = tfaddr.getText(); i++;
			
			if(name.equals(""))
			{
				lbalam.setText("이름을 입력해주세요!");
				return;
			}
			if(hp.equals(""))
			{
				lbalam.setText("전번을 입력해주세요!");
				return;
			}
			if(addr.equals(""))
			{
				lbalam.setText("주소를 입력해주세요!");
				return;
			}
			Result += i + "번" + "/" + data + "/" + data1 + "/" + data2 + "\n";
			
//			ta.append(data_all);
			
//			ta.setText(ta.getText() + data_all);
			
			ta.setText(Result);
			
			tfName.setText("");
			tfhp.setText("");
			tfaddr.setText("");
		}
		if(e.getSource() == btsave)
		{
			save();
		}
		if(e.getSource() == btload)
		{
			loadDataInit();
		}
	}
	
	public void center()
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
            File file = new File("C:\\aaa\\work\\friends.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            //쓰기
            bufferedWriter.write(Result);
//            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}	
	void loadDataInit()
	{		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\friends.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            
            String data = "";
            
            while((line = bufReader.readLine()) != null){
            	data += line + "\n";
            	Result += line + "\n";
            }            
            
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}
}
