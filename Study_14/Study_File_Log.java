package Study_14;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Study_File_Log {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	boolean start = false; //�αױ���� ��Ʈ���ϴ� ����
    	 

		while(true)
		{
			System.out.println("1.�αױ�� ����");			
			System.out.println("2.����");
			System.out.print("����:"); int select = sc.nextInt();
			
			if(select == 1) {				
					try{
			            while(true)
			            {
			            	try {
								Thread.sleep(1000);	
								//���� �ð����ϱ� �ʱ���...
				            	Date nowDate = new Date();       
				        		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");      
				        		String now = simpleDateFormat.format(nowDate);
							    //���� ��ü ������ ���
					            File file = new File("C:\\aaa\\work\\log.txt");
					            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
					            bufferedWriter.write(now);
					            bufferedWriter.newLine();
					            bufferedWriter.close();
					            
					            System.out.println(now);
				       
							} catch (InterruptedException e) {								
								e.printStackTrace();
							}  
			            }   
			        }catch (IOException e) {
			            System.out.println(e);
			        }
	            }		
		
			else if(select == 2) {System.out.println("���α׷�����."); break;}
		}
		
		

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        try{
            //���� ��ü ����
            File file = new File("C:\\java\\work\\data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
           System.out.print("�̸�:");String name = sc.next();
           System.out.print("����:");String hp = sc.next();
           System.out.print("�ּ�:");String addr = sc.next();
           
           String data = name +"/"+ hp+"/" + addr;
           
                //����
                bufferedWriter.write("�������� ����������  ������������ ��������");
                //���๮�ھ���
                bufferedWriter.newLine();       
                
                bufferedWriter.close();
            
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
