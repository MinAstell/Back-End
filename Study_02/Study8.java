package Study_2;
import java.util.Scanner;

public class Study8 
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
		
		int add = ko + en + math;
		int avr = add / 3;
		
		if(avr >= 90 && avr < 100)
		{
			System.out.println("�����߾��!!");
		}
		else if(avr >= 80 && avr < 90)
		{
			System.out.println("����մϴ�!");
		}
		else if(avr == 100)
		{
			System.out.println("�Ϻ��մϴ�!!!!!!");
		}
		else
		{
			System.out.println("��������!!!!");
		}
	}
}
