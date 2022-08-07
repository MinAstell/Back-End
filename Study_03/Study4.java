package Study_3;

import java.util.Scanner;

//nnnn*
//nnn***
//nn*****
//n*******
public class Study4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 층수를 입력해주세요.");
		int str = sc.nextInt();
		
		for(int i = 0; i < str; i++)
		{
			for(int j = i; j < str - 1; j++)
			{
				System.out.print(" ");
			}
				
			for(int k = 0; k < i * 2 + 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}