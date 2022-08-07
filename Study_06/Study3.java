package Study_6;

import java.util.Scanner;

public class Study3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int select;
		int MAX = 2;
		int BAN = 2;
		String search;
		String name[][] = new String[BAN][MAX];
		String hp[][] = new String[BAN][MAX];
		String adr[][] = new String[BAN][MAX];
		
//		00 01 
//		10 11 
		
//		1반 1번 이름 전번 주소
//		1반 2번 이름 전번 주소
//		2반 1번 이름 전번 주소
//		2반 2번 이름 전번 주소
		
		while(true)
		{
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.print("선택: ");
			select = sc.nextInt();
			
			if(select == 1)
			{
				
					for(int ban = 0; ban < BAN; ban++)
					{
						for(int i = 0; i < MAX; i++)
						{
							System.out.println(ban+1 + "반 " + (i+1) + "번 이름: ");
							name[ban][i] = sc.next();
							System.out.println(ban+1 + "반 " + (i+1) + "번  전번: ");
							hp[ban][i] = sc.next();
							System.out.println(ban+1 + "반 " + (i+1) + "번 주소: ");
							adr[ban][i] = sc.next();
						}
					}
			}
			else if(select == 2)
			{
				for(int ban = 0; ban < BAN; ban++)
				{
					for(int i = 0; i < MAX; i++)
					{
						System.out.println(ban+1 + "반" + (i+1) + "번" + name[ban][i] + " / " + hp[ban][i] + " / " + adr[ban][i]);
					}
				}
			}
			else if(select == 3)
			{
				System.out.println("이름검색");
				search = sc.next();
				
				for(int ban = 0; ban < BAN; ban++)
				{
					for(int i = 0; i < MAX; i++)
					{
						if(search.equals(name[ban][i]))
						{
							System.out.println(ban+1 + "반" + (i+1) + "번" + name[ban][i] + " / " + hp[ban][i] + " / " + adr[ban][i]);
						}
					}
				}
			}
			else if(select == 4)
			{
				System.out.println("프로그램종료");
				break;
			}
		}
	}
}
