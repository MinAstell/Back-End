package Study_9;

import java.util.Scanner;

public class ABan extends Score {
	Scanner sc = new Scanner(System.in);
	int soc, sie, tot, avg;	

	ABan()
	{
		System.out.println("<��������� ���ϱ�>");
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) 	  {input();}
			else if(sel == 2) {output();}
			else if(sel == 3) {break;}
		}
	}
	void input() {
		super.input();
		System.out.print("��ȸ:"); soc = sc.nextInt();
		System.out.print("����:"); sie = sc.nextInt();
		tot = kor+eng+mat+soc+sie;
		avg = tot/5;	
		
	}
	void output() {
		System.out.println("����:"+tot+" / ���:"+avg);
	}
}
