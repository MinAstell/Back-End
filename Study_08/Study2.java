package Study_8;

import java.util.Scanner;

public class Study2
{
	public static void main(String[] args)
	{
		score a = new score();
	}
}
class score
{
	int kor = 0, eng = 0, mat = 0, tot = 0, avg = 0;
	score()
	{
		Scanner sc = new Scanner(System.in);
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
				System.out.println("���α׷�����");
				break;
			}
			else
			{
				System.out.println("�ٽ� �Է¹ٶ��ϴ�.");
			}
		}
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
	}
	void output()
	{
		System.out.println("����: " + kor + "����: " + eng + "����: " + mat + "����: " + tot + "���: " + avg);
	}
}
