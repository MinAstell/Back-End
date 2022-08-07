package Study_8;

import java.util.Scanner;

public class Study2
{
	public static void main(String[] args)
	{
		score a = new score();
	}
}
class score
{
	int kor = 0, eng = 0, mat = 0, tot = 0, avg = 0;
	score()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택: ");
			int select = sc.nextInt();
			if(select == 1)
			{
				input();
			}
			else if(select == 2)
			{
				output();
			}
			else if(select == 3)
			{
				System.out.println("프로그램종료");
				break;
			}
			else
			{
				System.out.println("다시 입력바랍니다.");
			}
		}
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
	}
	void output()
	{
		System.out.println("국어: " + kor + "영어: " + eng + "수학: " + mat + "총점: " + tot + "평균: " + avg);
	}
}
