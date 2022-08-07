package Study_5;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.구구단출력");
			System.out.println("2.별표찍기");
			System.out.println("3.종료");
			System.out.println("선택: ");
			int answer = sc.nextInt();
			
			if(answer == 1)
			{
				int i = 2;
				while(i < 10)
				{
					int j = 1;
					while(j < 10)
					{
						System.out.println(i + " x " + j + " = " + i*j );
						j++;
					}
					i++;
				}
			}
			else if(answer == 2)
			{
				for(int k = 0; k < 3; k++)
				{
					for(int n = 0; n < k+1; n++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else
			{
				System.out.println("프로그램종료");
				break;
			}
		}
	}
}
