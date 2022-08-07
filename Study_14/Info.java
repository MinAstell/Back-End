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
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.종료");
			System.out.print("선택: ");
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
				System.out.println("종료합니다."); break;
			}
		}
	}
	
	public void input()
	{
		System.out.println();
		System.out.print("이름: ");
		name[count] = sc.next();
		System.out.print("나이: ");
		age[count] = sc.next();
		System.out.print("주소: ");
		addr[count] = sc.next();
		System.out.print("연락처: ");
		ph[count] = sc.next(); count++;
		System.out.println("정상적으로 정보가 저장되었습니다.");
		System.out.println();
	}
	
	public void output()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println();
			System.out.println("이름: " + name[i]);
			System.out.println("나이: " + age[i]);
			System.out.println("주소: " + addr[i]);
			System.out.println("연락처: " + ph[i]);
			System.out.println();
			
		}
	}
}
