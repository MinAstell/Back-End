package Study_2;
import java.util.Scanner;

public class Study3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���. ");
		String name = sc.next();
		
		System.out.println("���̸� �Է����ּ���. ");
		int age = sc.nextInt();
		
		System.out.println("�� Ű�� �Է����ּ���. ");
		double height = sc.nextDouble();
		
		System.out.println("�� �̸��� " + name + " �Դϴ�.");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� Ű��  " + height + "cm �Դϴ�.");
	}
}
