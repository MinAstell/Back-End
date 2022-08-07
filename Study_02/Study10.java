package Study_2;
import java.util.Scanner;

public class Study10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 학점을 입력해주세요.");
		String grade = sc.next();
		
		switch(grade) 
		{
		case "a" : System.out.println("90점~100점 입니다.");
		break;
		
		case "b" : System.out.println("80점~90점 입니다.");
		break;
		
		case "c" : System.out.println("70점~80점 입니다.");
		break;
		
		case "d" : System.out.println("60점~70점 입니다.");
		break;
		
		default: System.out.println("50점 미만 입니다.");
		}
	}
}
