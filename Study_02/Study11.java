package Study_2;
import java.util.Scanner;

public class Study11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է����ּ���.");
		String name = sc.next();
		
		switch(name)
		{
		case "ȫ�浿" : System.out.println("������½������½ �������!");
		break;
		case "������" : System.out.println("�Ϳ�~! ��� �̻� ���̵�!!");
		break;
		case "�̺���" : System.out.println("�θ�ƽ ������! �̰� �����! ����!");
		break;
		case "������" : System.out.println("��� �����մϴ�!");
		break;
		default: System.out.println("�˼����� ����Դϴ�.");
		}
	}
}
