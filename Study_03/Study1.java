package Study_3;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է����ּ���.");
		String name = sc.next();
		System.out.println("����� Ű�� �Է����ּ���.");
		double height = sc.nextDouble();
		System.out.println("����� �����Ը� �Է����ּ���.");
		double weight = sc.nextDouble();
		System.out.println("����� ���̸� �Է����ּ���.");
		int age = sc.nextInt();
		   
		if(age>=20 && age<=30)
		{
			if(height>=180.0 && height<=190.0)
			{
				if(weight>=70.0 && weight<=80.0)
				{
					System.out.println("����� �Ƴ��Դϴ�!!");
				}
			}
		}
		else if(age>=31 && age<=38)
		{
			if(height>=175.0 && height<=185.0)
			{
				if(weight>=75.0 && weight<=89.0)
				{
					System.out.println("����� �Ƴ��Դϴ�!!");
				}
			}
		}
		else 
		{
			System.out.println("����� �����Դϴ�!!");
		}
	}
}