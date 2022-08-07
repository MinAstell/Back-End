package Study_14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ����1_����������_��������� {
	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();		
	}
}
class Gbb extends Thread{	
	Scanner sc = new Scanner(System.in);
	int tot, win, draw, loss;//������ �� �� �� ����
	String myChoice; //������
	public void run()
	{
		loadDataInit();//ó���� ������ ��������
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
					try {	sleep(1000);} catch (InterruptedException e) {}
					System.out.println(i);
				}				
				//��ǻ�� ��������
				int com = (int)(Math.random()*3);//0:���� 1:���� 2:��
				
				if(myChoice.equals("����"))
				{
					com(com);
					if(com == 0)      {System.out.println("���º�!"); draw++;}//���
					else if(com == 1) {System.out.println("�����й�!"); loss++;}//�й�
					else if(com == 2) {System.out.println("���ǽ¸�!"); win++;}//�¸�
				}
				else if(myChoice.equals("����"))
				{
					com(com);
					if(com == 0)      {System.out.println("���ǽ¸�!"); win++;}//�¸�
					else if(com == 1) {System.out.println("���º�!"); draw++;}//���
					else if(com == 2) {System.out.println("�����й�!"); loss++;}//�й�
				}
				else if(myChoice.equals("��"))
				{
					com(com);
					if(com == 0)      {System.out.println("�����й�!"); loss++;}//�й�
					else if(com == 1) {System.out.println("���ǽ¸�!"); win++;}//�¸�
					else if(com == 2) {System.out.println("���º�!"); draw++;}//���
				}
				save();
			}
			else if(sel == 2) {
				System.out.println("������:"+tot+"��");
				System.out.println("��:"+win);
				System.out.println("��:"+draw);
				System.out.println("��:"+loss);	
			
			}
			else if(sel == 3) {break;}
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
            File file = new File("C:\\aaa\\work\\gbb.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            //����
            bufferedWriter.write(tot+"");//������
            bufferedWriter.newLine(); 
            bufferedWriter.write(win+"");//��
            bufferedWriter.newLine(); 
            bufferedWriter.write(draw+"");//��
            bufferedWriter.newLine(); 
            bufferedWriter.write(loss+"");//��
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
            File file = new File("C:\\aaa\\work\\gbb.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            
            int getData[] = new int[4];
            int cnt=0;
            while((line = bufReader.readLine()) != null){
            	getData[cnt] = Integer.parseInt(line);
            	cnt++;
            }            
            tot = getData[0];
            win = getData[1];
            draw = getData[2];
            loss = getData[3];
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}
}















