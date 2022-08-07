package Study_8;

public class Study1
{
	public static void main(String[] args)
	{
		AAA a = new AAA();
		AAA b = new AAA(111, "개그지");
	}
}
class AAA
{
	int gold = 100000;
	String name = "홍길동";
	AAA()
	{
		System.out.println("이름: " + name + " /가진돈: " +gold);
	}
	AAA(int gold, String name)
	{
		this.gold = gold; this.name = name;
		System.out.println("이름: " + name + " /가진돈: " +gold);
	}
}

