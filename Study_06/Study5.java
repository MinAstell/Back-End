package Study_6;

public class Study5 
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.speak();
		System.out.println("�����̸�: " + t.name);
		Study6 t2 = new Study6();
		t2.speak();
		System.out.println("�����̸�: " + t2.name);
	}
}
class Test
{
	String name = "�ְ���";
	int age = 12;
	
	void speak() 
	{
		System.out.println("���簡 ���Ѵ�!");
	}
	void study()
	{
		System.out.println("�л��� �����Ѵ�!");
	}
}


