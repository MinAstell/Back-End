package Study_2;

import java.util.Scanner;

public class Study5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ ����ڽ� ������?");
		int count = sc.nextInt();
		System.out.println("����� ������ ���������?");
		int box_in = sc.nextInt();
		System.out.println("��������� �����ּ���.");
		int price = sc.nextInt();
		
		int tot = count;
		int tot_price = count * box_in * price;
		int tot_sell = tot * box_in;
		int can_sell = 200;
		int drop_count = can_sell - tot;
		
		System.out.println("����ڽ��� ����: " + box_in);
		System.out.println("����ڽ� ����: " + count);
		System.out.println("�������: " + price);
		
		System.out.println("�ѹڽ� ����: " + tot + " / �Ѱ���: " + tot_price + "��");
		System.out.println("�Ǹŵ� �������: " + tot_sell);
		System.out.println("�����ڽ� ����: " + drop_count + " / �Ǹűݾ�: " + tot_price + "��");	
	}
}
