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
				System.out.println("프로그램종료");
				break;
			}
		}
	}
	void input()
	{
		System.out.print("친구추가할 친구의 이름을 입력해주세요: ");
		name[count] = sc.next(); 
		System.out.print("친구추가할 친구의 전번을 입력해주세요: ");
		ph[count] = sc.next(); 
		System.out.print("친구추가할 친구의 지역을 입력해주세요: ");
		region[count] = sc.next(); 
		System.out.print("친구추가할 친구의 나이를 입력해주세요: ");
		age[count] = sc.next(); count++;
	}
	void output()
	{
		System.out.println("등록된 모든친구의 정보: ");
		for(int i = 0; i < count; i++)
		{
			System.out.println(name[i] + " / " + ph[i] + " / " + region[i] + " / " + age[i]);
		}
	}
	void show_print()
	{
		System.out.println("1.친구추가");
		System.out.println("2.친구전체보기");
		System.out.println("3.종료");
		System.out.print("선택: ");
	}
}
