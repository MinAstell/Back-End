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
		
		System.out.print("�� ���� ���ϱ�(1~6) : ");
    	my = sc.nextInt();
    	
    	System.out.println("����!!");
    	
		while(true)
		{
			dice = (int)(Math.random()*6+1);
			if(my != dice)
			{
				System.out.println("��.�� �ٺ���Ű��!!");
				System.out.println(count + "ȸ �õ�!! ��ǻ�� ��: " + dice);
				try
				{
					sleep(1000);
					
					System.out.println("�ٽõ���!");
				} catch (InterruptedException e)
				{
		
				}
			}
			else 
			{
				System.out.println("Ok!! ������ ��Ű~");
				System.out.println(count + "ȸ �õ�!! ��ǻ�� ��: " + dice); break;
			}
			count++;
		}
	}
}
