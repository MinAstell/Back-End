package Study_4;

import java.util.Scanner;

public class Study7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택하세요.");
			int select = sc.nextInt();
			
			if(select == 1) System.out.println("입력기능입니다.");
			else if(select == 2) System.out.println("출력기능입니다.");
			else if(select == 3)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else 
			{
				System.out.println("다시 입력해주세요.");
			}
		}
	}  
} 

