package Study_6;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = 3, select;
		String serch = "";
		String name[] = new String[max];
		String ph[] = new String[max];
		String adr[] = new String[max];
		
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.println("����: ");
			select = sc.nextInt();
			
			if(select == 1)
			{
				for(int i = 0; i < name.length; i++)
				{
					System.out.print(i+1 + "�� �̸�: ");
					name[i] = sc.next();
					System.out.print(i+1 + "�� ��ȭ��ȣ: ");
					ph[i] = sc.next();
					System.out.print(i+1 + "�� �ּ�: ");
					adr[i] = sc.next();
				}
			}
			else if(select == 2)
			{
				for(int i = 0; i < name.length; i++)
				{
				System.out.println(i+1 + "�� " + name[i] + " / ��ȭ��ȣ " + ph[i] + " / �ּ�: " + adr[i]);
				}
			}
			else if(select == 3)
			{
				System.out.println("�˻��̸�: ");
				serch = sc.next();
				
				for(int i = 0; i< name.length; i++)
				{
					if(name[i].equals(serch))
					{
					System.out.println(i+1 + "��" + name[i] + " / " + ph[i] + " / " + adr[i]);
					}
				}
			}
			else if(select == 4)
			{
				System.out.println("���α׷� ����");
				break;
			}
			else
			{
				System.out.println("�ٽ��Է����ּ���.");
			}
		}
	}
}
