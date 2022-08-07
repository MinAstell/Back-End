package Study_3;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력해주세요.");
		String name = sc.next();
		System.out.println("당신의 키를 입력해주세요.");
		double height = sc.nextDouble();
		System.out.println("당신의 몸무게를 입력해주세요.");
		double weight = sc.nextDouble();
		System.out.println("당신의 나이를 입력해주세요.");
		int age = sc.nextInt();
		   
		if(age>=20 && age<=30)
		{
			if(height>=180.0 && height<=190.0)
			{
				if(weight>=70.0 && weight<=80.0)
				{
					System.out.println("당신은 훈남입니다!!");
				}
			}
		}
		else if(age>=31 && age<=38)
		{
			if(height>=175.0 && height<=185.0)
			{
				if(weight>=75.0 && weight<=89.0)
				{
					System.out.println("당신은 훈남입니다!!");
				}
			}
		}
		else 
		{
			System.out.println("당신은 루저입니다!!");
		}
	}
}