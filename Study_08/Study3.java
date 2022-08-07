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
			System.out.println("1.계산하기");
			System.out.println("2.종료");
			System.out.print("선택: ");
			int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("숫자를 선택하세요.");
				su1 = sc.nextInt();
				System.out.println("숫자를 선택하세요.");
				su2 = sc.nextInt();
				System.out.println("연산자를 선택하세요.");
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
				System.out.println("프로그램종료");
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
