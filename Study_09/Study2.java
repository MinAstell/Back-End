package Study_9;

import java.util.Scanner;

public class Study2
{
	public static void main(String[] args)
	{
		aaa a = new aaa();
	}
}
class aaa extends bbb
{
	String myname = "홍길동";
	int money = 10000;
	aaa()
	{
		System.out.println("aaa 클래스가 생성되었습니다.");
		System.out.println("aaa 클래스의 돈: " + money);
		System.out.println("aaa 클래스의 돈: " + super.money);
		System.out.println("내이름: " + myname);
		System.out.println("부모님이름: " + name);
	}
}
class bbb
{
	String name = "부모님";
	int money = 10000000;
	bbb()
	{
		System.out.println("bbb 클래스가 생성되었습니다.");
		System.out.println("bbb 클래스의 돈: " + money);
	}
}
