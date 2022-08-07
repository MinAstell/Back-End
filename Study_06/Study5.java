package Study_6;

public class Study5 
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.speak();
		System.out.println("강사이름: " + t.name);
		Study6 t2 = new Study6();
		t2.speak();
		System.out.println("강사이름: " + t2.name);
	}
}
class Test
{
	String name = "최강사";
	int age = 12;
	
	void speak() 
	{
		System.out.println("강사가 말한다!");
	}
	void study()
	{
		System.out.println("학생이 공부한다!");
	}
}


