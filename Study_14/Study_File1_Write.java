package Study_14;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class Study_File1_Write {
    public static void main(String[] args){
        try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
                String name = "ȫ�浿";
                int age = 22;
                //����
                bufferedWriter.write("�̸�:"+name + "/ ����:"+age);
                //���๮�ھ���
                bufferedWriter.newLine();
                bufferedWriter.write("���ڿ� �߰�2");
                
                bufferedWriter.close();
           
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
