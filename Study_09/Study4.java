package Study_9; 

public class Study4 {
	static int money = 99999;
	public static void main(String[] args) 
	{
		AAA2 a = new AAA2();
		System.out.println("a.money:"+a.money);
		System.out.println("gold:"+AAA2.gold);
		test();
		System.out.println("Study1.money:" + money);
		}
		static void test()
		{
			System.out.println("Static 메서드입니다!");
		}
}
class AAA2
{
	int money =10000;
	static int gold = 5;
	AAA2()
	{
		System.out.println("gold:"+gold);
	}
}
