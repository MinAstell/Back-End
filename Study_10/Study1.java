package Study_10;

public class Study1 {

	public static void main(String[] args) {
		
		A2 a = new A2();
		Thread myth = new Thread(a);
		myth.start();
		int count = 1;
		while(true) {
			try{
				System.out.println((count)+"�� " + "�ȳ��ϼ���.");
				Thread.sleep(1000);
			}catch(InterruptedException ie) {} count++;
		}
	}
}
class A2 implements Runnable{
	
	public void run() {
		while(true)
		{	
				try{
					System.out.println("�ڹ� ���� ���� ��ճ׿�!");
					Thread.sleep(2000);
				}catch(InterruptedException ie) {}
		}
		
	}
}


