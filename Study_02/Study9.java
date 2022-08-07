package Study_2;
import java.util.Scanner;

public class Study9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 학년을 입력해주세요.");
		int grade = sc.nextInt();
		
		switch(grade)
		{
			case 1: System.out.println("1학년 입니다.");
			break;
		
			case 2: System.out.println("2학년 입니다.");
			break;
		
			case 3: System.out.println("3학년 입니다.");
			break;
			
			default: System.out.println("1~3만 입력해주세요.");
		}
	}
}
