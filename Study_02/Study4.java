package Study_2;
import java.util.Scanner;

public class Study4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���������� �Է����ּ���.");
		int ko = sc.nextInt();
		System.out.println("����� ���������� �Է����ּ���.");
		int en = sc.nextInt();
		System.out.println("����� ���������� �Է����ּ���.");
		int math = sc.nextInt();
		
		int result = ko + en + math; 
		int avr = result / 3;
		
		System.out.println("��������: " + ko);
		System.out.println("��������: " + en);
		System.out.println("��������: " + math);
		System.out.println("����: " + result + " / ���: " + avr);
	}
}
