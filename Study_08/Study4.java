package Study_8;

import java.util.Scanner;

public class Study4
{
	public static void main(String[] args)
	{
		friends a = new friends();
	}
}
class friends
{
	Scanner sc = new Scanner(System.in);
	String name[] = new String[100];
	String ph[] = new String[100];
	String region[] = new String[100];
	String gender[] = new String[100];
	String age[] = new String[100];
	int count = 0;
	
	friends()
	{
		while(true)
		{
			show_print();
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
				System.out.println("���α׷�����");
				break;
			}
		}
	}
	void input()
	{
		System.out.print("ģ���߰��� ģ���� �̸��� �Է����ּ���: ");
		name[count] = sc.next(); 
		System.out.print("ģ���߰��� ģ���� ������ �Է����ּ���: ");
		ph[count] = sc.next(); 
		System.out.print("ģ���߰��� ģ���� ������ �Է����ּ���: ");
		region[count] = sc.next(); 
		System.out.print("ģ���߰��� ģ���� ���̸� �Է����ּ���: ");
		age[count] = sc.next(); count++;
	}
	void output()
	{
		System.out.println("��ϵ� ���ģ���� ����: ");
		for(int i = 0; i < count; i++)
		{
			System.out.println(name[i] + " / " + ph[i] + " / " + region[i] + " / " + age[i]);
		}
	}
	void show_print()
	{
		System.out.println("1.ģ���߰�");
		System.out.println("2.ģ����ü����");
		System.out.println("3.����");
		System.out.print("����: ");
	}
}
