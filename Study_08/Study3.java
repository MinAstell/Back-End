package Study_8;

import java.util.Scanner;

public class Study3
{
	public static void main(String[] args)
	{
		calc a = new calc();
	}
}
class calc
{
	calc()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.����ϱ�");
			System.out.println("2.����");
			System.out.print("����: ");
			int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("���ڸ� �����ϼ���.");
				su1 = sc.nextInt();
				System.out.println("���ڸ� �����ϼ���.");
				su2 = sc.nextInt();
				System.out.println("�����ڸ� �����ϼ���.");
				System.out.println("+, -, x, /");
				yon = sc.next();
				if(yon.equals("+"))
				{
					add(su1, su2);
					System.out.println(result);
				}
				else if(yon.equals("-"))
				{
					min(su1, su2);
					System.out.println(result);
				}
				else if(yon.equals("x") | yon.equals("X"))
				{
					mul(su1, su2);
					System.out.println(result);
				}
				else if(yon.equals("/"))
				{
					div(su1, su2);
					System.out.println(result);
				}
			}
			else if(select == 2)
			{
				System.out.println("���α׷�����");
				break;
			}
		}
	}
	int su1, su2, result;
	String yon;
	void add(int su1, int su2)
	{
		result = su1 + su2;
	}
	void min(int su1, int su2)
	{
		result = su1 - su2;
	}
	void mul(int su1, int su2)
	{
		result = su1 * su2;
	}
	void div(int su1, int su2)
	{
		result = su1 / su2;
	}
}
