package Study_6;

public class Study4 
{
	public static void main(String[] args)
	{
		chulsu1();
		chulsu2(10000);
		int boxCount = chulsu3();
		System.out.println("ö���� ������ �ù��: " + boxCount);
		int bbq = chulsu4(20000);
		System.out.println("ö���� ������ ġŲ ����: " + bbq);
	}
	static void chulsu1()
	{
		System.out.println("ö���� ��ٿͶ�!");
	}
	static void chulsu2(int money)
	{
		System.out.println("ö���� ���� ��: " + money);
	}
	static int chulsu3()
	{
		System.out.println("ö���� ���� �� �ù� 2���� ��������!");
		return 2;
	}
	static int chulsu4(int money)
	{
		System.out.println("ö���� 20000�� ���״� ġŲ 1���� �����");
		return 1;
	}
}
