package Study_5;

import java.util.Scanner;

public class Study4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age[] = new int[10];
		
		for(int i = 0; i < age.length; i++)
		{
			System.out.println(i+1 + "번째 학생 나이: ");
			age[i] = sc.nextInt();
		}
		for(int k = 0; k < age.length; k++)
		{
			System.out.println(k+1 + "번째 학생 나이: " + age[k]);
		}
	}
}
