package Study_13;

import java.util.Scanner;

public class Study2 
{
	public static void main(String[] args)
	{
		People p = new People();
	}
}
class People 
{
	Scanner sc = new Scanner(System.in);
	int tot = 0;
	int sugu, junggu, donggu, yusunggu, dadukgu;
	
	People()
	{
		while(true)
		{
			mani_show();
			
			int select = sc.nextInt();
			
			if(select == 1)
			{
				input();
			}
			else if(select == 2)
			{
				output();
			}
			else if(select == 3)
			{
				break;
			}
		}
	}
	void input()
	{
		System.out.print("����(����:��): ");
		sugu = sc.nextInt();
		System.out.print("�߱�(����:��): ");
		junggu = sc.nextInt();
		System.out.print("����(����:��): ");
		donggu = sc.nextInt();
		System.out.print("������(����:��): ");
		yusunggu = sc.nextInt();
		System.out.print("�����(����:��): ");
		dadukgu = sc.nextInt();
		tot = sugu + junggu + donggu + yusunggu + dadukgu;
	}
	void output()
	{
		System.out.println("���� ���α�: " + tot);
		System.out.println("����: " + sugu + "�߱�: " + junggu + "����: " + donggu + "������: " + yusunggu + "�����: " + dadukgu);
	}
	void mani_show()
	{
		System.out.println("1.�α��Է�");
		System.out.println("2.�α�����");
		System.out.println("3.����");
		System.out.print("����: ");
	}
}
