package Study_3;

import java.util.Scanner;

public class Study2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���ϴ� �������� ���� �Է����ּ���.: ");
		int answer = sc.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(answer + "x" + i + "=" + answer * i);
		}
		
	}
}
