package Study_9;

import java.util.Scanner;

public class BBan extends Score {
	Scanner sc = new Scanner(System.in);
	int mus, art, tot, avg;	

	BBan()
	{
		System.out.println("<���������� ���ϱ�>");
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
		System.out.print("����:"); mus = sc.nextInt();
		System.out.print("�̼�:"); art = sc.nextInt();
		tot = kor+eng+mat+mus+art;
		avg = tot/5;	
		
	}
	void output() {
		System.out.println("����:"+tot+" / ���:"+avg);
	}
}
