package Study_4;

import java.util.Scanner;

public class Study7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("�����ϼ���.");
			int select = sc.nextInt();
			
			if(select == 1) System.out.println("�Է±���Դϴ�.");
			else if(select == 2) System.out.println("��±���Դϴ�.");
			else if(select == 3)
			{
				System.out.println("���α׷� ����");
				break;
			}
			else 
			{
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}  
} 

