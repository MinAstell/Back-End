package Study_10;

public class Study2 {

	public static void main(String[] args) {
		A3 b = new A3();
		b.start();
		int count = 1;
		while(true)
		{
			try{
				System.out.println((count)+"�� " + "�ȳ��ϼ���.");
				Thread.sleep(1000);
			}catch(InterruptedException ie) {} count++;
		}
	}
}
class A3 extends Thread{
	
	public void run() {
		while(true)
		{	
				try{
					System.out.println("�ڹ� ���� ���� ��̾��׿�!");
					sleep(2000);
				}catch(InterruptedException ie) {}
		}
		
	}
}


