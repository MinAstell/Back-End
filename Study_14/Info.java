package Study_14;

import java.util.Scanner;

public class Info
{
	int max = 100, count;
	String name[] = new String[max];
	String age[] = new String[max];
	String addr[] = new String[max];
	String ph[] = new String[max];
	Scanner sc = new Scanner(System.in);
	
	public Info()
	{
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����: ");
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
				System.out.println("�����մϴ�."); break;
			}
		}
	}
	
	public void input()
	{
		System.out.println();
		System.out.print("�̸�: ");
		name[count] = sc.next();
		System.out.print("����: ");
		age[count] = sc.next();
		System.out.print("�ּ�: ");
		addr[count] = sc.next();
		System.out.print("����ó: ");
		ph[count] = sc.next(); count++;
		System.out.println("���������� ������ ����Ǿ����ϴ�.");
		System.out.println();
	}
	
	public void output()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println();
			System.out.println("�̸�: " + name[i]);
			System.out.println("����: " + age[i]);
			System.out.println("�ּ�: " + addr[i]);
			System.out.println("����ó: " + ph[i]);
			System.out.println();
			
		}
	}
}
