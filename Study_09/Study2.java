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
	String myname = "ȫ�浿";
	int money = 10000;
	aaa()
	{
		System.out.println("aaa Ŭ������ �����Ǿ����ϴ�.");
		System.out.println("aaa Ŭ������ ��: " + money);
		System.out.println("aaa Ŭ������ ��: " + super.money);
		System.out.println("���̸�: " + myname);
		System.out.println("�θ���̸�: " + name);
	}
}
class bbb
{
	String name = "�θ��";
	int money = 10000000;
	bbb()
	{
		System.out.println("bbb Ŭ������ �����Ǿ����ϴ�.");
		System.out.println("bbb Ŭ������ ��: " + money);
	}
}
