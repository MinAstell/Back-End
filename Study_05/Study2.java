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
			System.out.println("1.점수입력: ");
			System.out.println("2.점수출력: ");
			System.out.println("3.종료");
			System.out.println("선택: ");
			int select = sc.nextInt();

			if(select == 1)
			{
				while(true)
				{
					System.out.println("국어점수입력: ");
					grade += sc.nextInt();
					System.out.println("영어점수입력: ");
					grade += sc.nextInt();
					System.out.println("수학점수입력: ");
					grade += sc.nextInt();
					break;
				}
			}
			else if(select == 2)
			{
				avg = grade / 3;
				System.out.println("총점: " + grade + " / 평균: " + avg);
			}
			else
			{
				System.out.println("프로그램종료");
				break;
			}
		}
	}
}
