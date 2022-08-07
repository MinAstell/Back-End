package Study_2;
import java.util.Scanner;

public class Study6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("중학생학년을 입력해주세요.");
		int grade = sc.nextInt();
		
		if(grade == 1)
		{
			System.out.println("1학년 입니다.");
		}
		else if(grade == 2)
		{
			System.out.println("2학년 입니다.");
		}
		else if(grade == 3)
		{
			System.out.println("3학년 입니다.");
		}
		else
		{
			System.out.println("1~3중에서만 입력해주세요.");
		}
	}
}
