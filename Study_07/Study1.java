package Study_7;

import java.util.Scanner;

public class Study1
{
	public static void main(String[] args) 
	{
		fan f = new fan();
		f.name_change("������ ��ǳ��");
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String power = "����";
		String rotate = "����";
		int speed = 0;
		String speed2 = "����";
		String head = "�Ʒ�";
		
		while(true)
		{
			System.out.println("------ ��ǳ�� ��������-------");
			System.out.println("��ǳ���: ����̵� ��ǳ��");
			System.out.println("����: " + power + " / " + "ȸ��: " + rotate);
			System.out.println("�ӵ�: " + speed2 + " / " + "����: " + head);
			System.out.println("1.�����ѱ�");
			System.out.println("2.��������");
			System.out.println("3.���α׷�����");
			System.out.println("����: ");
			
			select = sc.nextInt();
		
			if(select == 1)
			{
				while(true)
				{
					System.out.println("------ ��ǳ�� ��������-------");
					System.out.println("��ǳ���: ����̵� ��ǳ��");
					System.out.println("����: " + power + " / " + "ȸ��: " + rotate);
					System.out.println("�ӵ�: " + speed + " / " + "����: " + head);
					System.out.println("1.ȸ������");
					System.out.println("2.�ӵ�����");
					System.out.println("3.��������");
					System.out.println("4.����ȭ������");
					System.out.println("����: ");
					
					int select2 = sc.nextInt();
					
					if(select2 == 1)
					{
						if(rotate == "����")
						{
							System.out.println("���� ȸ���� �����ֽ��ϴ�.");
							System.out.println("��ǳ�⸦ ȸ���Ͻðڽ��ϱ�?");
							System.out.println("y or n: ");
							String select3 = sc.next();
							
							if(select3.equals("y"))
							{
								rotate = "����";
								System.out.println("��ǳ�� ȸ���� �����մϴ�.");
							}
							else if(select3.equals("n"))
							{
								System.out.println("��ǳ�� ȸ���� �������� �ʽ��ϴ�.");
							}
						}
						else if(rotate == "����")
						{
							rotate = "����";
							System.out.println("����ȸ���� �����ֽ��ϴ�.");
							System.out.println("��ǳ�⸦ ȸ���� �����Ͻðڽ��ϱ�?");
							System.out.println("y or n: ");
							String select4 = sc.next();
							
							if(select4.equals("y"))
							{
								rotate = "����";
								System.out.println("��ǳ�� ȸ���� �����մϴ�.");
							}
							else if(select4.equals("n"))
							{
								System.out.println("��ǳ�� ȸ���� �������� �ʽ��ϴ�.");
							}
						}
					}
					else if(select2 == 2)
					{
						System.out.println("����ӵ��� " + speed2 + "�Դϴ�.");
						System.out.println("ǳ�Ӽ���(0.���� 1.��ǳ, 2.��ǳ, 3.��ǳ): ");
						System.out.println("����: ");
						
						int select5 = sc.nextInt();
						
						if(select5 == 0)
						{
							speed = 0;
							speed2 = "����";
						}
						else if(select5 == 1)
						{
							speed = 1;
							speed2 = "����";
						}
						else if(select5 == 2)
						{
							speed = 2;
							speed2 = "����";
						}
						else if(select5 == 3)
						{
							speed = 3;
							speed2 = "����";
						}
					}
					else if(select2 == 3)
					{
						System.out.println("���� �Ʒ� �����Դϴ�.");
						System.out.println("��带 �ø��ðڽ��ϱ�?(y,n): ");
						System.out.println("����: ");
						
						String select6 = sc.next();
						
						if(select6.equals("y"))
						{
							System.out.println("��ǳ�� ��尡 ���� �ö󰩴ϴ�.");
						}
						else if(select6.equals("n"))
						{
							System.out.println("���� ���¸� �����մϴ�.");
						}
					}
					else if(select2 == 4)
					{
						break;
					}
				}
			}
			else if(select == 2)
			{
				System.out.println("��ǳ���� ������ ����");
				power = "����";
			}
			else if(select == 3)
			{
				System.out.println("���α׷�����");
				break;
			}
		}
	}
}
class fan
{
	boolean rotation = false;
	boolean power_mode = false;
	boolean head_control = false;
	String model_name = "����̵� ��ǳ��";
	int fan_speed = 0;
	int mode_type = 0;
	
	
	void power_mode(int data)
	{
		if(data == 0)
		{
			System.out.println("���� OFF");
		}
		else if(data == 1)
		{
			System.out.println("���� ON");
		}
	}
	void rotation(int data)
	{
		if(data == 0)
		{
			System.out.println("ȸ�� OFF");
		}
		else if(data == 1)
		{
			System.out.println("ȸ�� ON");
		}
	}
	void fan_speed(int data)
	{
		if(data == 0)
		{
			System.out.println("��ǳ");
		}
		else if(data == 1)
		{
			System.out.println("��ǳ");
		}
		else if(data == 2)
		{
			System.out.println("��ǳ");
		}
	}
	void head_control(int data)
	{
		if(data == 0)
		{
			System.out.println("����");
		}
		else if(data == 1)
		{
			System.out.println("����");
		}
	}
	void name_change(String data)
	{
		System.out.println("��ǳ����� " + data + "(��)�� �������ϴ�.");
	}
}


