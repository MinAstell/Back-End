package Study_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study1
{
	public static void main(String[] args) 
	{
		new Soccer();
	}
}
class Soccer
{
	Scanner sc = new Scanner(System.in);
	String TeamName[] = {"��Ʈ��", "�ٸ����γ�", "���˸��帮��", ""};
	String playMent[] = {
			"�����մϴ�",
			"1���� �־����ϴ�.",
			"������ �־����� �����߽��ϴ�.",
			"���񰡳����ֳ׿�.",
			"���ݼ��� �ں����ϴ�.",
			"��Ű�۰������մϴ�.",
			"�г�Ƽ�� �����մϴ�.",
			"�г�Ƽ�� �����մϴ�.",
			"�ڻ���� �־����ϴ�.",
			"1���� ������ ���߽��ϴ�."
	};
	int win[] = new int[3];
	int draw[] = new int[3];
	int loss[] = new int[3];
	String myTeamName;
	int myWin, myDraw, myLoss;
	int lose1, lose2, lose3;
	int draw1, draw2, draw3;
	int ran2, ran3, ran4, ran5, ran6, ran7;
	int goal1, goal2;
	int rank[] = new int[4];
	int f_rank[] = new int[4];
	
	Soccer()
	{
		System.out.println("<�౸������ �����մϴ�!>");
		System.out.print("\n������ �Է�: "); myTeamName = sc.next();
		TeamName[3] = myTeamName;
		System.out.println();
		System.out.println("������ �����մϴ�.\n");
		
		while(true)
		{
			System.out.println("1.�����ϱ�");
			System.out.println("2.��ŷ����");
			System.out.println("3.����");
			System.out.print("����: "); int select = sc.nextInt();
			
			if(select == 1)
			{
				gameStart(); 
			}
			else if(select == 2)
			{
				ranking();
			}
			else if(select == 3)
			{
				System.out.println("�����մϴ�."); break;
			}
		}
	}
	
	void gameStart()
	{
		while(true)
		{
			ran2 = (int)(Math.random()*4);
			
			System.out.println("1��: " + TeamName[ran2]);
			
			do {
				 ran3 = (int)(Math.random()*4);
			}while(ran3 == ran2);
			
			System.out.println("2��: " + TeamName[ran3]);
			
			do {
				 ran4 = (int)(Math.random()*4);
			}while(ran4 == ran3 || ran4 == ran2);
			
			System.out.println("3��: " + TeamName[ran4]);
		
			do {
				 ran5 = (int)(Math.random()*4);
			}while(ran5 == ran4 || ran5 == ran3 || ran5 == ran2);
			
			System.out.println("4��: " + TeamName[ran5]);
			
			System.out.println("1.�౸����");
			System.out.println("2.���ư���");
			System.out.print("����: "); int select = sc.nextInt();
			
			if(select == 1)
			{
				goal1 = 0; goal2 = 0;
				
				do {
					ran6 = (int)(Math.random()*4);
				}
				while(ran6 == 3);
			
				System.out.println(TeamName[ran6] + "���� " + TeamName[3] + "���� ���� ������ �����մϴ�.");
				
				for(int i = 0; i < 4; i++)
				{
					int rand = (int)(Math.random()*10);
					if(rand == 0)
					{
						ment(playMent[0]);
					}
					else if(rand == 1)
					{
						ment(playMent[1]); 
					}
					else if(rand == 2)
					{
						ment(playMent[2]);
					}
					else if(rand == 3)
					{
						ment(playMent[3]);
					}
					else if(rand == 4)
					{
						ment(playMent[4]);
					}
					else if(rand == 5)
					{
						ment(playMent[5]);
					}
					else if(rand == 6)
					{
						ment(playMent[6]);
					}
					else if(rand == 7)
					{
						ment(playMent[7]);
					}
					else if(rand == 8)
					{
						ment(playMent[8]);
					}
					else if(rand == 9)
					{
						ment(playMent[9]);
					}
					try { Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
				System.out.println("���: " + TeamName[ran6] + "�� " + goal1 + " / " + TeamName[3] + "�� " + goal2);
				
				if(goal1 > goal2)
				{
					System.out.println(TeamName[ran6] + "���� �¸�!!");
					
					if(TeamName[ran6].equals("��Ʈ��"))
					{
						win[0]++; myLoss++; rank[0] += 5; rank[3] -= 1;
					}
					else if(TeamName[ran6].equals("�ٸ����γ�"))
					{
						win[1]++; myLoss++; rank[1] += 5; rank[3] -= 1;
					}
					else if(TeamName[ran6].equals("���˸��帮��"))
					{
						win[2]++; myLoss++; rank[2] += 5; rank[3] -= 1;
					}
				}
				else if(goal1 == goal2)
				{
					System.out.println("���º�!");
					
					if(TeamName[ran6].equals("��Ʈ��"))
					{
						draw[0]++; myDraw++; rank[0] += 3; rank[3] += 3;
					}
					else if(TeamName[ran6].equals("�ٸ����γ�"))
					{
						draw[1]++; myDraw++; rank[1] += 3; rank[3] += 3;
					}
					else if(TeamName[ran6].equals("���˸��帮��"))
					{
						draw[2]++; myDraw++; rank[2] += 3; rank[3] += 3;
					}
				}
				else if(goal1 < goal2)
				{
					System.out.println(TeamName[3] + "���� �¸�!!"); myWin++; rank[3] += 5;
					
					if(TeamName[ran6].equals("��Ʈ��"))
					{
						loss[0]++; rank[0] -= 1;
					}
					else if(TeamName[ran6].equals("�ٸ����γ�"))
					{
						loss[1]++; rank[1] -= 1;
					}
					else if(TeamName[ran6].equals("���˸��帮��"))
					{
						loss[2]++; rank[2] -= 1;
					}
				}
				save();
			}
			else if(select == 2)
			{
				System.out.println("���ư��ϴ�."); break;
			}
		} 
	}
	
	void ranking()
	{
		for(int i = 0; i < f_rank.length; i++)
		{
			f_rank[i] = 1;
			for(int j = 0; j < f_rank.length; j++)
			{
				if(rank[i] < rank[j])
				{
					f_rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 1)
			{
				System.out.println("1��: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 2)
			{
				System.out.println("2��: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 3)
			{
				System.out.println("3��: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 4)
			{
				System.out.println("4��: " + TeamName[i]);
			}
		}
		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\scg.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            

            while((line = bufReader.readLine()) != null){
            	 System.out.println(line);
            }            
           
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}
	
	void save()
	{
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\scg.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            //����
            
            for(int i = 0; i < 4; i++)
            {
            	if(i != 3) 
            	{
            		bufferedWriter.write("<<<<<<<<<" + TeamName[i] + "�� ���� >>>>>>>>>");//������
                    bufferedWriter.newLine();
                  
                        bufferedWriter.write("�¸�: " + win[i] + " / ");
                        bufferedWriter.write("���º�: " + draw[i] + " / ");
                        bufferedWriter.write("�й�: " + loss[i]);  
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
            	}
                    
            	else if(i == 3)
                    {
                    	bufferedWriter.write("<<<<<<<<<" + TeamName[i] + "�� ���� >>>>>>>>>");//������
                        bufferedWriter.newLine();
                      
                            bufferedWriter.write("�¸�: " + myWin + " / ");
                            bufferedWriter.write("���º�: " + myDraw + " / ");
                            bufferedWriter.write("�й�: " + myLoss);
                            bufferedWriter.newLine();
                            bufferedWriter.newLine();
                    }
            }
      
		Date nowDate = new Date();       
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
		String now = simpleDateFormat.format(nowDate);
		
        //����
        bufferedWriter.write("������ ���� ����: " + now);
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.close();
        
		}catch (IOException e) {
            System.out.println(e);
        }
		
	}
	
	void load()
	{
		
	}
	
	void ment(String ment)
	{
		ran7 = (int)(Math.random()*2);
		
		if(ran7 == 0)
		{
			System.out.println(TeamName[ran6] + "�� " + ment); 
			
			if(ment.equals(playMent[1]))
			{
				goal1++;
			}
			else if(ment.equals(playMent[7]))
			{
				goal1 += 5;
			}
			else if(ment.equals(playMent[8]))
			{
				goal2++;
			}
		}
		else if(ran7 == 1)
		{
			System.out.println(TeamName[3] + "�� " + ment);
			
			if(ment.equals(playMent[1]))
			{
				goal2++;
			}
			else if(ment.equals(playMent[7]))
			{
				goal2 += 5;
			}
			else if(ment.equals(playMent[8]))
			{
				goal1++;
			}
		}
	}
}
