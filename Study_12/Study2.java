package Study_12;
import java.util.Scanner;
public class Study2 {
	public static void main(String[] args) {
		Aircon2 a = new Aircon2();		
		}
	}
class Aircon2 extends Thread{
	Scanner sc = new Scanner(System.in);
	int nowTempo=25;//현재온도
	int setTempo=20;
	boolean runCheck = false;//에어컨의 동작제어
	Aircon2()
	{
		start();//에어컨 동작중....
		while(true)
		{
			System.out.println("[현재온도:"+nowTempo+"도/설정온도:"+setTempo+"도]");
			System.out.println("1.에어컨가동");
			System.out.println("2.온도설정");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel ==1 ) {
				System.out.println("에어컨이 가동됩니다.");
				runCheck =true;
				
			}
			else if(sel ==2 ) {
				System.out.println();
				System.out.println("[설정온도"+setTempo+"도]");
				System.out.print("온도변경:"); setTempo = sc.nextInt();
				System.out.println();
			}
			else if(sel ==3 ) {break;}
		}
	}
	public void run(){		
		while(true)
		{
			//runCheck 이 변수로 제어하기 위해서 잠시 렉으로 제어
			System.out.println("쓰레드 동작중");
			
			if(runCheck==true)
			{
				int rnd = (int)(Math.random()*2);
				try {
					nowTempo-= rnd;//0~1랜덤으로나온수를누적
					sleep(1000);
					System.out.println("현재온도 : "+nowTempo+"도");
				} catch (InterruptedException e) {	}
				
				if(nowTempo==setTempo)
				{
					System.out.println("설정온도 도달! 작동중지!");
					runCheck=false;
				}
			}
		}
	}
}









