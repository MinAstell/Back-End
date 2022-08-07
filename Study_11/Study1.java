package Study_11;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args)
	{
		com c = new com();
		c.start();
	}
}
class com extends Thread
{
	Scanner sc = new Scanner(System.in);
	
	public void run()
	{
		int count = 1, dice, my = 0;
		
		System.out.print("내 숫자 정하기(1~6) : ");
    	my = sc.nextInt();
    	
    	System.out.println("시작!!");
    	
		while(true)
		{
			dice = (int)(Math.random()*6+1);
			if(my != dice)
			{
				System.out.println("ㅠ.ㅠ 바보새키야!!");
				System.out.println(count + "회 시도!! 컴퓨터 수: " + dice);
				try
				{
					sleep(1000);
					
					System.out.println("다시도전!");
				} catch (InterruptedException e)
				{
		
				}
			}
			else 
			{
				System.out.println("Ok!! 운좋은 쉥키~");
				System.out.println(count + "회 시도!! 컴퓨터 수: " + dice); break;
			}
			count++;
		}
	}
}
