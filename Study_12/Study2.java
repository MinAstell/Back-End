package Study_12;
import java.util.Scanner;
public class Study2 {
	public static void main(String[] args) {
		Aircon2 a = new Aircon2();		
		}
	}
class Aircon2 extends Thread{
	Scanner sc = new Scanner(System.in);
	int nowTempo=25;//����µ�
	int setTempo=20;
	boolean runCheck = false;//�������� ��������
	Aircon2()
	{
		start();//������ ������....
		while(true)
		{
			System.out.println("[����µ�:"+nowTempo+"��/�����µ�:"+setTempo+"��]");
			System.out.println("1.����������");
			System.out.println("2.�µ�����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel ==1 ) {
				System.out.println("�������� �����˴ϴ�.");
				runCheck =true;
				
			}
			else if(sel ==2 ) {
				System.out.println();
				System.out.println("[�����µ�"+setTempo+"��]");
				System.out.print("�µ�����:"); setTempo = sc.nextInt();
				System.out.println();
			}
			else if(sel ==3 ) {break;}
		}
	}
	public void run(){		
		while(true)
		{
			//runCheck �� ������ �����ϱ� ���ؼ� ��� ������ ����
			System.out.println("������ ������");
			
			if(runCheck==true)
			{
				int rnd = (int)(Math.random()*2);
				try {
					nowTempo-= rnd;//0~1�������γ��¼�������
					sleep(1000);
					System.out.println("����µ� : "+nowTempo+"��");
				} catch (InterruptedException e) {	}
				
				if(nowTempo==setTempo)
				{
					System.out.println("�����µ� ����! �۵�����!");
					runCheck=false;
				}
			}
		}
	}
}









