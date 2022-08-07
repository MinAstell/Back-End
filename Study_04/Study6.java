package Study_4;

import java.util.Scanner;

public class Study6
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
			
			if(select == 3)
			{
				System.out.println("종료됩니다.");
				break;
			}
		}
	}
} 

