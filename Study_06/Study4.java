package Study_6;

public class Study4 
{
	public static void main(String[] args)
	{
		chulsu1();
		chulsu2(10000);
		int boxCount = chulsu3();
		System.out.println("철수가 가져온 택배수: " + boxCount);
		int bbq = chulsu4(20000);
		System.out.println("철수가 가져온 치킨 수량: " + bbq);
	}
	static void chulsu1()
	{
		System.out.println("철수야 놀다와라!");
	}
	static void chulsu2(int money)
	{
		System.out.println("철수가 받은 돈: " + money);
	}
	static int chulsu3()
	{
		System.out.println("철수야 들어올 때 택배 2개만 가져다줘!");
		return 2;
	}
	static int chulsu4(int money)
	{
		System.out.println("철수야 20000원 줄테니 치킨 1개좀 사다줘");
		return 1;
	}
}
