package Study_2;
import java.util.Scanner;

public class Study8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 국어점수를 입력해주세요.");
		int ko = sc.nextInt();
		System.out.println("당신의 영어점수를 입력해주세요.");
		int en = sc.nextInt();
		System.out.println("당신의 수학점수를 입력해주세요.");
		int math = sc.nextInt();
		
		int add = ko + en + math;
		int avr = add / 3;
		
		if(avr >= 90 && avr < 100)
		{
			System.out.println("참잘했어요!!");
		}
		else if(avr >= 80 && avr < 90)
		{
			System.out.println("우수합니다!");
		}
		else if(avr == 100)
		{
			System.out.println("완벽합니다!!!!!!");
		}
		else
		{
			System.out.println("힘내세요!!!!");
		}
	}
}
