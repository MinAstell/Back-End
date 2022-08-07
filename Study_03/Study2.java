package Study_3;

import java.util.Scanner;

public class Study2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 원하는 구구단의 단을 입력해주세요.: ");
		int answer = sc.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(answer + "x" + i + "=" + answer * i);
		}
		
	}
}
