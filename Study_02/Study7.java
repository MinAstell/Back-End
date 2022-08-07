package Study_2;
import java.util.Scanner;

public class Study7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100사이의 수를 입력해주세요.");
		int score = sc.nextInt();
		
		if(score < 100 && score >= 90)
		{
			System.out.println("90점 이상입니다.");
		}
		else if(score == 100) 
		{
			System.out.println("축하합니다! 만점입니다.");
		}
		else if(score < 90 && score >= 80)
		{
			System.out.println("80점 이상 90점 미만 입니다.");
		}
		else if(score < 80 && score >= 70)
		{
			System.out.println("70점 이상 80점 미만 입니다.");
		}
		else
		{
			System.out.println("70점 미만입니다.");
		}
	}
}
