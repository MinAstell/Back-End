package Study_2;
import java.util.Scanner;

public class Study7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100������ ���� �Է����ּ���.");
		int score = sc.nextInt();
		
		if(score < 100 && score >= 90)
		{
			System.out.println("90�� �̻��Դϴ�.");
		}
		else if(score == 100) 
		{
			System.out.println("�����մϴ�! �����Դϴ�.");
		}
		else if(score < 90 && score >= 80)
		{
			System.out.println("80�� �̻� 90�� �̸� �Դϴ�.");
		}
		else if(score < 80 && score >= 70)
		{
			System.out.println("70�� �̻� 80�� �̸� �Դϴ�.");
		}
		else
		{
			System.out.println("70�� �̸��Դϴ�.");
		}
	}
}
