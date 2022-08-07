package Study_2;
import java.util.Scanner;

public class Study4 
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
		
		int result = ko + en + math; 
		int avr = result / 3;
		
		System.out.println("국어점수: " + ko);
		System.out.println("영어점수: " + en);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + result + " / 평균: " + avr);
	}
}
