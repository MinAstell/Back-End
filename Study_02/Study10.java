package Study_2;
import java.util.Scanner;

public class Study10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է����ּ���.");
		String grade = sc.next();
		
		switch(grade) 
		{
		case "a" : System.out.println("90��~100�� �Դϴ�.");
		break;
		
		case "b" : System.out.println("80��~90�� �Դϴ�.");
		break;
		
		case "c" : System.out.println("70��~80�� �Դϴ�.");
		break;
		
		case "d" : System.out.println("60��~70�� �Դϴ�.");
		break;
		
		default: System.out.println("50�� �̸� �Դϴ�.");
		}
	}
}
