package Study_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Study_File2_Read {
    public static void main(String[] args){
        try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\data.txt");
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



