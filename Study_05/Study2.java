package Study_5;

import java.util.Scanner;

public class Study2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int avg = 0;
		
		while(true)
		{
			System.out.println("1.�����Է�: ");
			System.out.println("2.�������: ");
			System.out.println("3.����");
			System.out.println("����: ");
			int select = sc.nextInt();

			if(select == 1)
			{
				while(true)
				{
					System.out.println("���������Է�: ");
					grade += sc.nextInt();
					System.out.println("���������Է�: ");
					grade += sc.nextInt();
					System.out.println("���������Է�: ");
					grade += sc.nextInt();
					break;
				}
			}
			else if(select == 2)
			{
				avg = grade / 3;
				System.out.println("����: " + grade + " / ���: " + avg);
			}
			else
			{
				System.out.println("���α׷�����");
				break;
			}
		}
	}
}
