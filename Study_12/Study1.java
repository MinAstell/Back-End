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
			System.out.println("����µ�: " + (temp) + "��");
			
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
			System.out.println("1.����������");
			System.out.println("2.������ �µ�����");
			System.out.println("3.������ ����");
			System.out.print("����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("�������� �����˴ϴ�.");
				System.out.println("[" + "����µ�: " + nowtmp + " / �����µ�: " + set + "]");
				
				while(true)
				{
					rand = (int)(Math.random()*2);
				
					nowtmp -= rand;
					System.out.println("[" + "����µ�: " + nowtmp + " / �����µ�: " + set + "]");
					
					try {
						sleep(1000);
					} catch (InterruptedException e) {}
					
					if(nowtmp == set)
					{
						System.out.println("�����µ��� ����!!"); break;
					}
				}
			}
			else if(select == 2)
			{
				System.out.println("���缳�� �µ�: " + set + "��");
				System.out.println("�����µ� ����: ");
				int settmp = sc.nextInt();
				set = settmp; 
			}
			else if(select == 3)
			{
				System.out.println("�����մϴ�.");
				break;
			}
			else
			{
				System.out.println("�ٽ� �Է¹ٶ��ϴ�..");
			}
		}
	}
}
