package Study_9;

import java.util.Scanner;

public class Study1
{
	public static void main(String[] args)
	{
		account a = new account();
	}
}
class account
{
	Scanner sc = new Scanner(System.in);
	String name[] = new String[100];
	String pw[] = new String[100];
	int money[] = new int[100];
	String acc[] = new String[100];
	int count;
	
	account()
	{
		while(true)
		{
			System.out.println("1.���»���");
			System.out.println("2.������ȸ");
			System.out.println("3.�Ա��ϱ�");
			System.out.println("4.����ϱ�");
			System.out.println("5.���α׷�����");
			System.out.println("special.�����ڿ�(���ٺҰ���)");
			System.out.print("����: ");
			
			int select = sc.nextInt();
			System.out.println();
			
			if(select == 1)
			{
				newacc();
			}
			else if(select == 2)
			{
				search();
			}
			else if(select == 3)
			{
				deposit();
			}
			else if(select == 4)
			{
				withdraw();
			}
			else if(select == 5)
			{
				System.out.println("���α׷�����"); break;
			}
			else if(select == 10)
			{
				select_all();
			}
			else 
			{
				System.out.println("�ٽ� �Է¹ٶ��ϴ�.");
			}
		}
	}
	void deposit() //�Ա�
	{
		System.out.println("�Ա��� ������ ���¹�ȣ�� �Է����ּ���.");
		String acc = sc.next();
		
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]))
			{
				System.out.print("���¿� �󸶸� �Ա��Ͻðڽ��ϱ�?: ");
				this.money[i] += sc.nextInt();
				System.out.println();
				System.out.print("���¿� �Ա��� ���������� �Ϸ�Ǿ����ϴ�."); 
				System.out.println();
			}
		}
	}
	void withdraw() //���
	{
		System.out.println("����� ������ ���¹�ȣ�� �Է����ּ���.");
		String acc = sc.next();
		System.out.println("����� ������ ��й�ȣ�� �Է����ּ���.");
		String pw = sc.next();
		System.out.println("���¿��� �󸶸� ����Ͻðڽ��ϱ�?");
		int money = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]) && pw.equals(this.pw[i]))
			{
				this.money[i] -= money;
				System.out.println("����� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
				System.out.println("��� �� ���� �ܾ�: " + this.money[i]);
				System.out.println();
			}
		}
	}
	void search()
	{
		System.out.println("��ȸ�� ������ ���¹�ȣ�� �Է����ּ���.");
		String acc = sc.next();
		System.out.println("��ȸ�� ������ ��й�ȣ�� �Է����ּ���.");
		String pw = sc.next();
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]) && pw.equals(this.pw[i]))
			{
				System.out.println("��ȸ�Ͻ� ������ ������ ������ �����ϴ�.");
				System.out.println();
				System.out.println("�̸�: " + this.name[i] + " ���¹�ȣ: " + this.acc[i] + " �ܾ�: " + this.money[i] + "��");
				System.out.println();
			}
		}
	}
	void newacc()
	{
		System.out.println("���¸� ������ ������ ������ �Է����ּ���.");
		name[count] = sc.next();
		System.out.println("����� ���¹�ȣ�� �Է����ּ���.");
		acc[count] = sc.next();
		System.out.println("����� ������ ��й�ȣ�� �Է����ּ���.");
		pw[count] = sc.next();
		System.out.print("����� ���¿� �󸶸� �Ա��Ͻðڽ��ϱ�?: ");
		money[count] = sc.nextInt(); count++;
		System.out.println("��û�Ͻ� ������ ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
	}
	void select_all()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println("���¹�ȣ: " + acc[i]);
			System.out.println("�����ָ�: " + name[i]);
			System.out.println("�ܾ�: " + money[i]);
			System.out.println();
		}
	}
}
