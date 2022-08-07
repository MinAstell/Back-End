package Study_5;

import java.util.Scanner;

public class Study5 
{
	public static void main(String[] args) 
	{
		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int tot[] = new int[3];
		int avg[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(i+1 + "번 학생 이름: ");
			name[i] = sc.next();
			System.out.println(i+1 + "번 학생 국어: ");
			kor[i] = sc.nextInt();
			System.out.println(i+1 + "번 학생 영어: ");
			eng[i] = sc.nextInt();
			System.out.println(i+1 + "번 학생 수학: ");
			mat[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3;
		}
		for(int i = 0; i < 3; i++)
		{
			System.out.println(i+1 + "번 학생: " + name[i] + " 총점: " + tot[i] + " 평균: " + avg[i]);
		}
	}
}
