package Study_2;
import java.util.Scanner;

public class Study12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է����ּ���.");
		int number1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է����ּ���.");
		int number2 = sc.nextInt();
		
		System.out.println("������(+,-,*,/)�� �Է����ּ���.");
		String cir = sc.next();
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		
		switch(cir)
		{
			case "+" : System.out.println("���: " + add);
			break;
			case "-" : System.out.println("���: " + sub);
			break;
			case "*" : System.out.println("���: " + mul);
			break;
			case "/" : System.out.println("���: " + div);
			break;
			default: System.out.println("Error");
		}
	}
}
