package Study_6;

import java.util.Scanner;

public class Study3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int select;
		int MAX = 2;
		int BAN = 2;
		String search;
		String name[][] = new String[BAN][MAX];
		String hp[][] = new String[BAN][MAX];
		String adr[][] = new String[BAN][MAX];
		
//		00 01 
//		10 11 
		
//		1�� 1�� �̸� ���� �ּ�
//		1�� 2�� �̸� ���� �ּ�
//		2�� 1�� �̸� ���� �ּ�
//		2�� 2�� �̸� ���� �ּ�
		
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("����: ");
			select = sc.nextInt();
			
			if(select == 1)
			{
				
					for(int ban = 0; ban < BAN; ban++)
					{
						for(int i = 0; i < MAX; i++)
						{
							System.out.println(ban+1 + "�� " + (i+1) + "�� �̸�: ");
							name[ban][i] = sc.next();
							System.out.println(ban+1 + "�� " + (i+1) + "��  ����: ");
							hp[ban][i] = sc.next();
							System.out.println(ban+1 + "�� " + (i+1) + "�� �ּ�: ");
							adr[ban][i] = sc.next();
						}
					}
			}
			else if(select == 2)
			{
				for(int ban = 0; ban < BAN; ban++)
				{
					for(int i = 0; i < MAX; i++)
					{
						System.out.println(ban+1 + "��" + (i+1) + "��" + name[ban][i] + " / " + hp[ban][i] + " / " + adr[ban][i]);
					}
				}
			}
			else if(select == 3)
			{
				System.out.println("�̸��˻�");
				search = sc.next();
				
				for(int ban = 0; ban < BAN; ban++)
				{
					for(int i = 0; i < MAX; i++)
					{
						if(search.equals(name[ban][i]))
						{
							System.out.println(ban+1 + "��" + (i+1) + "��" + name[ban][i] + " / " + hp[ban][i] + " / " + adr[ban][i]);
						}
					}
				}
			}
			else if(select == 4)
			{
				System.out.println("���α׷�����");
				break;
			}
		}
	}
}
