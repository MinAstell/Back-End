package Study_2;
import java.util.Scanner;

public class Study12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요.");
		int number1 = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요.");
		int number2 = sc.nextInt();
		
		System.out.println("연산자(+,-,*,/)를 입력해주세요.");
		String cir = sc.next();
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		
		switch(cir)
		{
			case "+" : System.out.println("결과: " + add);
			break;
			case "-" : System.out.println("결과: " + sub);
			break;
			case "*" : System.out.println("결과: " + mul);
			break;
			case "/" : System.out.println("결과: " + div);
			break;
			default: System.out.println("Error");
		}
	}
}
