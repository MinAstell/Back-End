package Study_14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Study2 {
	public static void main(String[] args) {
		Info2 info = new Info2();	}}
class Info2{
	Scanner sc = new Scanner(System.in);
	int max = 100, i;
	String name, age, ph, addr;
	Info2()	{
		while(true)	{
			System.out.println("<����������׽�Ʈ>");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			System.out.println();
			if(sel == 1) 	  { input();  }
			else if(sel == 2) { output(); }
			else if(sel == 3) { break;    }			
		}
	}	
	void input() {
		System.out.println();
		System.out.println("����� ������ �Է����ּ���.");
		System.out.println();
		System.out.print("�̸�:"); name = sc.next();
		System.out.print("����:"); age = sc.next();
		System.out.print("�ּ�:"); addr = sc.next();
		System.out.print("����ó:"); ph = sc.next(); i++; 
		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\data0711.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

                //����
                bufferedWriter.write(i+"�� "+name+"/"+age+"/"+addr+"/"+ph);
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                System.out.println();
                System.out.println("�Ѹ��� �߰��Ǿ����ϴ�.\n");
           
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void output() {
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\data0711.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }   
            System.out.println();
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
		
	} 
}
	
	
	
	
	
	
	
	
	