package Study_2;
import java.util.Scanner;

public class Study6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���л��г��� �Է����ּ���.");
		int grade = sc.nextInt();
		
		if(grade == 1)
		{
			System.out.println("1�г� �Դϴ�.");
		}
		else if(grade == 2)
		{
			System.out.println("2�г� �Դϴ�.");
		}
		else if(grade == 3)
		{
			System.out.println("3�г� �Դϴ�.");
		}
		else
		{
			System.out.println("1~3�߿����� �Է����ּ���.");
		}
	}
}
