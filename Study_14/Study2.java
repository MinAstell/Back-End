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
			System.out.println("<파일입출력테스트>");
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			System.out.println();
			if(sel == 1) 	  { input();  }
			else if(sel == 2) { output(); }
			else if(sel == 3) { break;    }			
		}
	}	
	void input() {
		System.out.println();
		System.out.println("등록할 내용을 입력해주세요.");
		System.out.println();
		System.out.print("이름:"); name = sc.next();
		System.out.print("나이:"); age = sc.next();
		System.out.print("주소:"); addr = sc.next();
		System.out.print("연락처:"); ph = sc.next(); i++; 
		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data0711.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

                //쓰기
                bufferedWriter.write(i+"번 "+name+"/"+age+"/"+addr+"/"+ph);
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                System.out.println();
                System.out.println("한명이 추가되었습니다.\n");
           
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void output() {
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data0711.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
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
	
	
	
	
	
	
	
	
	