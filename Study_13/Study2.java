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
		System.out.print("서구(단위:만): ");
		sugu = sc.nextInt();
		System.out.print("중구(단위:만): ");
		junggu = sc.nextInt();
		System.out.print("동구(단위:만): ");
		donggu = sc.nextInt();
		System.out.print("유성구(단위:만): ");
		yusunggu = sc.nextInt();
		System.out.print("대덕구(단위:만): ");
		dadukgu = sc.nextInt();
		tot = sugu + junggu + donggu + yusunggu + dadukgu;
	}
	void output()
	{
		System.out.println("대전 총인구: " + tot);
		System.out.println("서구: " + sugu + "중구: " + junggu + "동구: " + donggu + "유성구: " + yusunggu + "대덕구: " + dadukgu);
	}
	void mani_show()
	{
		System.out.println("1.인구입력");
		System.out.println("2.인구보기");
		System.out.println("3.종료");
		System.out.print("선택: ");
	}
}
