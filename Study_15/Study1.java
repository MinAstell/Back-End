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
	String TeamName[] = {"토트넘", "바르셀로나", "레알마드리드", ""};
	String playMent[] = {
			"공격합니다",
			"1골을 넣었습니다.",
			"슈팅을 넣었지만 실패했습니다.",
			"수비가끝내주네요.",
			"공격수가 자빠집니다.",
			"골키퍼가선방합니다.",
			"패널티에 실패합니다.",
			"패널티를 성공합니다.",
			"자살골을 넣었습니다.",
			"1명이 퇴장을 당했습니다."
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
		System.out.println("<축구게임을 시작합니다!>");
		System.out.print("\n내팀명 입력: "); myTeamName = sc.next();
		TeamName[3] = myTeamName;
		System.out.println();
		System.out.println("게임을 시작합니다.\n");
		
		while(true)
		{
			System.out.println("1.게임하기");
			System.out.println("2.랭킹보기");
			System.out.println("3.종료");
			System.out.print("선택: "); int select = sc.nextInt();
			
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
				System.out.println("종료합니다."); break;
			}
		}
	}
	
	void gameStart()
	{
		while(true)
		{
			ran2 = (int)(Math.random()*4);
			
			System.out.println("1팀: " + TeamName[ran2]);
			
			do {
				 ran3 = (int)(Math.random()*4);
			}while(ran3 == ran2);
			
			System.out.println("2팀: " + TeamName[ran3]);
			
			do {
				 ran4 = (int)(Math.random()*4);
			}while(ran4 == ran3 || ran4 == ran2);
			
			System.out.println("3팀: " + TeamName[ran4]);
		
			do {
				 ran5 = (int)(Math.random()*4);
			}while(ran5 == ran4 || ran5 == ran3 || ran5 == ran2);
			
			System.out.println("4팀: " + TeamName[ran5]);
			
			System.out.println("1.축구시작");
			System.out.println("2.돌아가기");
			System.out.print("선택: "); int select = sc.nextInt();
			
			if(select == 1)
			{
				goal1 = 0; goal2 = 0;
				
				do {
					ran6 = (int)(Math.random()*4);
				}
				while(ran6 == 3);
			
				System.out.println(TeamName[ran6] + "팀과 " + TeamName[3] + "팀이 서로 시합을 시작합니다.");
				
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
				System.out.println("결과: " + TeamName[ran6] + "팀 " + goal1 + " / " + TeamName[3] + "팀 " + goal2);
				
				if(goal1 > goal2)
				{
					System.out.println(TeamName[ran6] + "팀이 승리!!");
					
					if(TeamName[ran6].equals("토트넘"))
					{
						win[0]++; myLoss++; rank[0] += 5; rank[3] -= 1;
					}
					else if(TeamName[ran6].equals("바르셀로나"))
					{
						win[1]++; myLoss++; rank[1] += 5; rank[3] -= 1;
					}
					else if(TeamName[ran6].equals("레알마드리드"))
					{
						win[2]++; myLoss++; rank[2] += 5; rank[3] -= 1;
					}
				}
				else if(goal1 == goal2)
				{
					System.out.println("무승부!");
					
					if(TeamName[ran6].equals("토트넘"))
					{
						draw[0]++; myDraw++; rank[0] += 3; rank[3] += 3;
					}
					else if(TeamName[ran6].equals("바르셀로나"))
					{
						draw[1]++; myDraw++; rank[1] += 3; rank[3] += 3;
					}
					else if(TeamName[ran6].equals("레알마드리드"))
					{
						draw[2]++; myDraw++; rank[2] += 3; rank[3] += 3;
					}
				}
				else if(goal1 < goal2)
				{
					System.out.println(TeamName[3] + "팀이 승리!!"); myWin++; rank[3] += 5;
					
					if(TeamName[ran6].equals("토트넘"))
					{
						loss[0]++; rank[0] -= 1;
					}
					else if(TeamName[ran6].equals("바르셀로나"))
					{
						loss[1]++; rank[1] -= 1;
					}
					else if(TeamName[ran6].equals("레알마드리드"))
					{
						loss[2]++; rank[2] -= 1;
					}
				}
				save();
			}
			else if(select == 2)
			{
				System.out.println("돌아갑니다."); break;
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
				System.out.println("1등: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 2)
			{
				System.out.println("2등: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 3)
			{
				System.out.println("3등: " + TeamName[i]);
			}
		}
		for(int i = 0; i < 4; i++)
		{
			if(f_rank[i] == 4)
			{
				System.out.println("4등: " + TeamName[i]);
			}
		}
		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\scg.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
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
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\scg.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            //쓰기
            
            for(int i = 0; i < 4; i++)
            {
            	if(i != 3) 
            	{
            		bufferedWriter.write("<<<<<<<<<" + TeamName[i] + "팀 전적 >>>>>>>>>");//총전적
                    bufferedWriter.newLine();
                  
                        bufferedWriter.write("승리: " + win[i] + " / ");
                        bufferedWriter.write("무승부: " + draw[i] + " / ");
                        bufferedWriter.write("패배: " + loss[i]);  
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
            	}
                    
            	else if(i == 3)
                    {
                    	bufferedWriter.write("<<<<<<<<<" + TeamName[i] + "팀 전적 >>>>>>>>>");//총전적
                        bufferedWriter.newLine();
                      
                            bufferedWriter.write("승리: " + myWin + " / ");
                            bufferedWriter.write("무승부: " + myDraw + " / ");
                            bufferedWriter.write("패배: " + myLoss);
                            bufferedWriter.newLine();
                            bufferedWriter.newLine();
                    }
            }
      
		Date nowDate = new Date();       
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");      
		String now = simpleDateFormat.format(nowDate);
		
        //쓰기
        bufferedWriter.write("마지막 게임 시점: " + now);
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
			System.out.println(TeamName[ran6] + "팀 " + ment); 
			
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
			System.out.println(TeamName[3] + "팀 " + ment);
			
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
