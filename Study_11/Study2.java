package Study_11;

import java.util.Scanner;

public class Study2 
{
	public static void main(String[] args)
	{
		game g = new game();
		g.start();
	}
}
class game extends Thread
{
	Scanner sc = new Scanner(System.in);
	
	public void run()
	{
		int win = 0, lose = 0, draw = 0;
		
		while(true)
		{
			int count = 3;
			
			System.out.println("1.���ӽ���");
			System.out.println("2.��躸��");
			System.out.println("3.����");
			System.out.print("����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println();
				System.out.println("����");
				System.out.println("����");
				System.out.println("��");
				System.out.print("�� ����: ");
				String answer = sc.next(); 
				
				for(int i = 3; i > 0; i--)
				{
					System.out.println(i);
					
					try 
					{
						sleep(1000);
					} catch (InterruptedException e) 
					{
						
					}
				}
				
				int dice = (int)(Math.random()*3+1);
				
				System.out.println();
				
				if(answer.equals("����"))
				{
					if(dice == 2) 
					{
						System.out.println("��ǻ��: ����");
						System.out.println("����� �й��Դϴ�!");
						System.out.println();
						lose++;
					}
					else if(dice == 3)
					{
						System.out.println("��ǻ��: ��");
						System.out.println("����� �¸��Դϴ�!");
						System.out.println();
						win++;
					}
					else 
					{
						System.out.println("��ǻ��: ����");
						System.out.println("���º� �Դϴ�!"); 
						System.out.println();
						draw++;
					}
				}
				else if(answer.equals("����"))
				{
					if(dice == 1) 
					{
						System.out.println("��ǻ��: ����");
						System.out.println("����� �¸��Դϴ�!"); 
						System.out.println();
						win++;
					}
					else if(dice == 3)
					{
						System.out.println("��ǻ��: ��");
						System.out.println("����� �й��Դϴ�!"); 
						System.out.println();
						lose++;
					}
					else 
					{
						System.out.println("��ǻ��: ����");
						System.out.println("���º� �Դϴ�!");
						System.out.println();
						draw++;
					}
				}
				else if(answer.equals("��"))
				{
					if(dice == 1) 
					{
						System.out.println("��ǻ��: ����");
						System.out.println("�����  �й��Դϴ�!");
						System.out.println();
						lose++;
					}
					else if(dice == 2)
					{
						System.out.println("��ǻ��: ����");
						System.out.println("����� �¸��Դϴ�!"); 
						System.out.println();
						win++;
					}
					else 
					{
						System.out.println("��ǻ��: ��");
						System.out.println("���º� �Դϴ�!"); 
						System.out.println();
						draw++;
					}
				}
				else
				{
					System.out.println("�ٽ� �Է¹ٶ��ϴ�.");
					System.out.println();
				}
			}
			else if(select == 2)
			{
				int tot = win + lose + draw;
				System.out.println("������: " + tot + "��");
				System.out.println("�¸�: " + win);
				System.out.println("�й�: " + lose);
				System.out.println("���º�: " + draw);
				System.out.println();
			}
			else if(select == 3)
			{
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
