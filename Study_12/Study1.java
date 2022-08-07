package Study_12;

import java.util.Scanner;

public class Study1
{
	public static void main(String[] args) 
	{
		air a = new air();
		a.start();
	}
}
class TMP extends Thread
{
	int temp = 20; int rand = 0;
	
	public void run()
	{
		while(true)
		{
			rand = (int)(Math.random()*2);
			temp += rand;
			System.out.println("현재온도: " + (temp) + "도");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class air extends Thread
{
	Scanner sc = new Scanner(System.in);
	int rand, set = 25, nowtmp = 30;
	
	public void run()
	{
		while(true)
		{
			System.out.println("1.에어컨가동");
			System.out.println("2.에어컨 온도설정");
			System.out.println("3.에어컨 종료");
			System.out.print("선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("에어컨이 가동됩니다.");
				System.out.println("[" + "현재온도: " + nowtmp + " / 설정온도: " + set + "]");
				
				while(true)
				{
					rand = (int)(Math.random()*2);
				
					nowtmp -= rand;
					System.out.println("[" + "현재온도: " + nowtmp + " / 설정온도: " + set + "]");
					
					try {
						sleep(1000);
					} catch (InterruptedException e) {}
					
					if(nowtmp == set)
					{
						System.out.println("설정온도에 도달!!"); break;
					}
				}
			}
			else if(select == 2)
			{
				System.out.println("현재설정 온도: " + set + "도");
				System.out.println("설정온도 변경: ");
				int settmp = sc.nextInt();
				set = settmp; 
			}
			else if(select == 3)
			{
				System.out.println("종료합니다.");
				break;
			}
			else
			{
				System.out.println("다시 입력바랍니다..");
			}
		}
	}
}
