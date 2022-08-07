package Study_19;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class �ϼ���_ģ������Ʈ {
	public static void main(String[] args) {		
		Friends2 f = new Friends2();		
	}
}
class Friends2 extends Frame implements ActionListener{
	//��Ʈ�� ���ֻ���ؼ� ���� Ŭ���� ������ ��ġ�س���.
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbName = new Label("�̸�:");
	Label lbHp = new Label("����:");
	Label lbAddr = new Label("�ּ�:");
	Label lbList = new Label("ģ������Ʈ");
	Label lbMent = new Label("�˸����...");
	TextField tfName = new TextField();
	TextField tfHp = new TextField();
	TextField tfAddr = new TextField();
	Button btn = new Button("�߰��ϱ�");
	Button btnSave = new Button("��������");
	Button btnRead = new Button("�о����");
	TextArea ta = new TextArea();
	
	String result ="";
	int cnt=0;
	Friends2()
	{
		super("ģ������Ʈ");
		this.setSize(850,300);
		this.center();
		this.init();
		this.start();	
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbAddr);		this.add(lbHp);
		this.add(lbName);		this.add(lbList);
		this.add(btn);			this.add(ta);
		this.add(tfName);		this.add(tfHp);
		this.add(tfAddr); 		this.add(lbMent);
		this.add(btnSave); 		this.add(btnRead);
		
		lbName.setBounds(50, 50, 50, 30);lbName.setFont(font20);
		lbHp.setBounds(50, 100, 50, 30);lbHp.setFont(font20);
		lbAddr.setBounds(50, 150, 50, 30);lbAddr.setFont(font20);
		tfName.setBounds(120, 50, 150, 30);tfName.setFont(font20);
		tfHp.setBounds(120, 100, 150, 30);tfHp.setFont(font20);
		tfAddr.setBounds(120, 150, 150, 30);tfAddr.setFont(font20);
		lbMent.setBounds(70, 190, 300, 30);lbMent.setFont(font20);
		btn.setBounds(120, 240, 150, 30);btn.setFont(font20);
		
		lbList.setBounds(300, 50, 150, 30);lbList.setFont(font20);
		ta.setBounds(300, 100, 370, 170);ta.setFont(font20);
		
		btnSave.setBounds(700, 100, 120, 30);btnSave.setFont(font20);
		btnRead.setBounds(700, 170, 120, 30);btnRead.setFont(font20);	
		
		
	}
	void start()
	{
		btn.addActionListener(this);
		btnSave.addActionListener(this);
		btnRead.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)
		{
			String name = tfName.getText();
			String hp = tfHp.getText();
			String addr = tfAddr.getText();
			
			//����üũ...
			if(name.equals("")) {
				lbMent.setText("�̸��� �Է����ּ���!");
				return;
			}
			if(hp.equals("")) {
				lbMent.setText("������ �Է����ּ���!");
				return;
			}
			if(addr.equals("")) {
				lbMent.setText("�ּҸ� �Է����ּ���!");
				return;
			}
			cnt++;//�Ѹ�����
			//���ó��
			result += cnt+"��:"+name +" / "+ hp +" / "+ addr+"\n";
			ta.setText(result);
			
			//�ʱ�ȭ
			tfName.setText("");
			tfHp.setText("");
			tfAddr.setText("");
		}
		else if(e.getSource() == btnSave)
		{
			save();
		}
		else if(e.getSource() == btnRead)
		{
			load();
		}
		
		
	}
	void save() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\friends.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

    		
	            bufferedWriter.write(result);	                        	             
	            bufferedWriter.close();           
	            ta.setText("");
	            result="";
	        }catch (IOException e) {
	            System.out.println(e);
	        }
		   
		   
	   }//��������
	   void load() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\friends.txt");
	            //�Է� ��Ʈ�� ����
	            FileReader filereader = new FileReader(file);
	            //�Է� ���� ����
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";            
	            String data = "";
	            cnt = 0;
	            while((line = bufReader.readLine()) != null){
	            	data += line+"\n";
	            	result += line+"\n";
	            	cnt++;	            	
	            }         
	            ta.setText(data);
	            
	            bufReader.close();
	        }catch (FileNotFoundException e) { 
	        }catch(IOException e){           
	        }
		   
		   
	   }//���Ϸε�
	
	
}














