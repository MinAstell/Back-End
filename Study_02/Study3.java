package Study_2;
import java.util.Scanner;

public class Study3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요. ");
		String name = sc.next();
		
		System.out.println("나이를 입력해주세요. ");
		int age = sc.nextInt();
		
		System.out.println("내 키를 입력해주세요. ");
		double height = sc.nextDouble();
		
		System.out.println("내 이름은 " + name + " 입니다.");
		System.out.println("내 나이는 " + age + "살 입니다.");
		System.out.println("내 키는  " + height + "cm 입니다.");
	}
}
