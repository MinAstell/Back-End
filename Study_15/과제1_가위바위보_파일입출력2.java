package Study_15;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ����1_����������_���������2 {
	public static void main(String[] args) {
		Gbb2 gbb = new Gbb2();
		gbb.start();		
	}
}
class Gbb2 extends Thread{	
	Scanner sc = new Scanner(System.in);
	int tot, win, draw, loss;//������ �� �� �� ����
	String myChoice; //������
	String ment="";
	public void run()
	{
		
		System.out.println("<< ��������������! >>");
		while(true)
		{
			System.out.println("1.���ӽ���");
			System.out.println("2.��躸��");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1)      {
				tot++;//���ӽ��۸��ϸ� �׳� ���� ������..
				System.out.print("������:"); myChoice = sc.next();
				for(int i=3; i>0; i--)
				{
					try {	sleep(500);} catch (InterruptedException e) {}
					System.out.println(i);
				}				
				//��ǻ�� ��������
				int com = (int)(Math.random()*3);//0:���� 1:���� 2:��
				
				if(myChoice.equals("����"))
				{
					com(com);
					if(com == 0)      {System.out.println("���º�!"); draw++;ment="���";}//���
					else if(com == 1) {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
					else if(com == 2) {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�
				}
				else if(myChoice.equals("����"))
				{
					com(com);
					if(com == 0)      {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�
					else if(com == 1) {System.out.println("���º�!"); draw++;ment="���";}//���
					else if(com == 2) {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
				}
				else if(myChoice.equals("��"))
				{
					com(com);
					if(com == 0)      {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
					else if(com == 1) {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�
					else if(com == 2) {System.out.println("���º�!"); draw++;ment="���";}//���
				}
				//����ó��
				save();
			}
			else if(sel == 2) {
				loadDataInit();//ó���� ������ ��������
//				System.out.println("������:"+tot+"��");
//				System.out.println("��:"+win);
//				System.out.println("��:"+draw);
//				System.out.println("��:"+loss);	
			
			}
			else if(sel == 3) {
				//save();//����������� ����...
				break;}
		}
	}
	
	void com(int sel)
	{
		if(sel == 0){System.out.println("��ǻ�Ͱ� �������½��ϴ�!");}
		else if(sel == 1){System.out.println("��ǻ�Ͱ� �������½��ϴ�!");}
		else if(sel == 2){System.out.println("��ǻ�Ͱ� �����½��ϴ�!");}
	}
	
	void save() {
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\gbb2.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

          //���� �ð����ϱ� �ʱ���...
        	Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
    		String now = simpleDateFormat.format(nowDate);
    		
            //����
            bufferedWriter.write("���������� ���:"+ment+" ����:"+now);//������
            bufferedWriter.newLine(); 
            bufferedWriter.write("�� "+tot+"�� ��:"+win+"/ ��:"+draw+"/ ��:"+loss);//������
            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}	
	void loadDataInit()
	{		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\gbb2.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            

            while((line = bufReader.readLine()) != null){
            	 System.out.println(line);
            }            
            
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}
}















