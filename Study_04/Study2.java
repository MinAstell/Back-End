package Study_4;

import java.util.Scanner;

public class Study2
{
	public static void main(String[] args) 
	{
		int tot = 0, score = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i+1 + "번학생 점수입력: ");
			score = sc.nextInt();
			tot = tot + score;
		}
		System.out.println("총점: " + tot);
	}
}
