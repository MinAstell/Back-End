package Study_6;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = 3, select;
		String serch = "";
		String name[] = new String[max];
		String ph[] = new String[max];
		String adr[] = new String[max];
		
		while(true)
		{
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.println("선택: ");
			select = sc.nextInt();
			
			if(select == 1)
			{
				for(int i = 0; i < name.length; i++)
				{
					System.out.print(i+1 + "번 이름: ");
					name[i] = sc.next();
					System.out.print(i+1 + "번 전화번호: ");
					ph[i] = sc.next();
					System.out.print(i+1 + "번 주소: ");
					adr[i] = sc.next();
				}
			}
			else if(select == 2)
			{
				for(int i = 0; i < name.length; i++)
				{
				System.out.println(i+1 + "번 " + name[i] + " / 전화번호 " + ph[i] + " / 주소: " + adr[i]);
				}
			}
			else if(select == 3)
			{
				System.out.println("검색이름: ");
				serch = sc.next();
				
				for(int i = 0; i< name.length; i++)
				{
					if(name[i].equals(serch))
					{
					System.out.println(i+1 + "번" + name[i] + " / " + ph[i] + " / " + adr[i]);
					}
				}
			}
			else if(select == 4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else
			{
				System.out.println("다시입력해주세요.");
			}
		}
	}
}
