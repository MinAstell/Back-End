package Study_13;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args)
	{
		Login l = new Login();
	}
}
class Login
{
	private String id = "admin";
	private String pw = "1004";
	private String id2[] = new String[100];
	private String pw2[] = new String[100];
	private String name[] = new String[100];
	private String ph[] = new String[100];
	String checkId;
	String checkPw;
	Scanner sc = new Scanner(System.in);
	int count = 0;
	boolean check = false;
	
	Login()
	{
		while(true)
		{
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.����");
			System.out.print("����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.print("���̵�: ");
				checkId = sc.next();
				System.out.print("��й�ȣ: ");
				checkPw = sc.next();
				
				login(checkId, checkPw);
			}
			else if(select == 2)
			{
				join();
			}
			else if(select == 3)
			{
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
	void login(String id, String pw)
	{
		for(int i = 0; i < count; i++)
		{
			if(id.equals(id2[i]) && pw.equals(pw2[i]))
			{
				System.out.println("�Ϲ� ����ڷ� �α��� �Ǿ����ϴ�.");
			}
		}
		if(id.equals(this.id) && pw.equals(this.pw))
		{
			System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
			System.out.println();
			System.out.println("1.���θ޴�");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.����");
			System.out.println("4.ȸ������ ��� ����");
			System.out.print("����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("���θ޴��� ���ư��ϴ�.");
			}
			else if(select == 2)
			{
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			}
			else if(select == 3)
			{
				System.out.println("�����մϴ�."); 
				System.exit(-1);
			}
			else if(select == 4)
			{
				if(check == true)
				{
					for(int i = 0; i < count; i++)
					{
						System.out.println(name[i] + " / " + ph[i] + " / " + id2[i]);
					}
				}
				else if(check == false)
				{
					System.out.println("ȸ�������� �����ϴ�.");
				}
			}
		}
		else
		{
			System.out.println("�ٽ� �õ��ϼ���. ");
		}
	}
	void join() 
	{
		System.out.println("----ȸ������ ������----");
		System.out.println();
		System.out.println("����Ͻ� ���̵� �Է����ּ���.");
		id2[count] = sc.next();
		System.out.println("����Ͻ� ��й�ȣ�� �Է����ּ���.");
		pw2[count] = sc.next(); 
		System.out.println("������ ������ �����ϼ���.");
		name[count] = sc.next();
		System.out.println("������ ��ȭ��ȣ�� �����ϼ���.");
		ph[count] = sc.next(); 
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�."); count++; 
		check = true;
	}
}