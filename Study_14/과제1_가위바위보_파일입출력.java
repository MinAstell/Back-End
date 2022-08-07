package Study_14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class 과제1_가위바위보_파일입출력 {
	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();		
	}
}
class Gbb extends Thread{	
	Scanner sc = new Scanner(System.in);
	int tot, win, draw, loss;//총전적 승 무 패 변수
	String myChoice; //내선택
	public void run()
	{
		loadDataInit();//처음에 전적을 가져오기
		System.out.println("<< 가위바위보게임! >>");
		while(true)
		{
			System.out.println("1.게임시작");
			System.out.println("2.통계보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1)      {
				tot++;//게임시작만하면 그냥 증가 총전적..
				System.out.print("내선택:"); myChoice = sc.next();
				for(int i=3; i>0; i--)
				{
					try {	sleep(1000);} catch (InterruptedException e) {}
					System.out.println(i);
				}				
				//컴퓨터 랜덤생성
				int com = (int)(Math.random()*3);//0:가위 1:바위 2:보
				
				if(myChoice.equals("가위"))
				{
					com(com);
					if(com == 0)      {System.out.println("무승부!"); draw++;}//비김
					else if(com == 1) {System.out.println("나의패배!"); loss++;}//패배
					else if(com == 2) {System.out.println("나의승리!"); win++;}//승리
				}
				else if(myChoice.equals("바위"))
				{
					com(com);
					if(com == 0)      {System.out.println("나의승리!"); win++;}//승리
					else if(com == 1) {System.out.println("무승부!"); draw++;}//비김
					else if(com == 2) {System.out.println("나의패배!"); loss++;}//패배
				}
				else if(myChoice.equals("보"))
				{
					com(com);
					if(com == 0)      {System.out.println("나의패배!"); loss++;}//패배
					else if(com == 1) {System.out.println("나의승리!"); win++;}//승리
					else if(com == 2) {System.out.println("무승부!"); draw++;}//비김
				}
				save();
			}
			else if(sel == 2) {
				System.out.println("총전적:"+tot+"전");
				System.out.println("승:"+win);
				System.out.println("무:"+draw);
				System.out.println("패:"+loss);	
			
			}
			else if(sel == 3) {break;}
		}
	}
	
	void com(int sel)
	{
		if(sel == 0){System.out.println("컴퓨터가 가위를냈습니다!");}
		else if(sel == 1){System.out.println("컴퓨터가 바위를냈습니다!");}
		else if(sel == 2){System.out.println("컴퓨터가 보를냈습니다!");}
	}
	
	void save() {
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\gbb.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            //쓰기
            bufferedWriter.write(tot+"");//총전적
            bufferedWriter.newLine(); 
            bufferedWriter.write(win+"");//승
            bufferedWriter.newLine(); 
            bufferedWriter.write(draw+"");//무
            bufferedWriter.newLine(); 
            bufferedWriter.write(loss+"");//패
            bufferedWriter.newLine(); 
             bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}	
	void loadDataInit()
	{		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\gbb.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
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















