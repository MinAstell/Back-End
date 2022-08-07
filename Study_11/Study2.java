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
			
			System.out.println("1.게임시작");
			System.out.println("2.통계보기");
			System.out.println("3.종료");
			System.out.print("선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println();
				System.out.println("가위");
				System.out.println("바위");
				System.out.println("보");
				System.out.print("내 선택: ");
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
				
				if(answer.equals("가위"))
				{
					if(dice == 2) 
					{
						System.out.println("컴퓨터: 바위");
						System.out.println("당신의 패배입니다!");
						System.out.println();
						lose++;
					}
					else if(dice == 3)
					{
						System.out.println("컴퓨터: 보");
						System.out.println("당신의 승리입니다!");
						System.out.println();
						win++;
					}
					else 
					{
						System.out.println("컴퓨터: 가위");
						System.out.println("무승부 입니다!"); 
						System.out.println();
						draw++;
					}
				}
				else if(answer.equals("바위"))
				{
					if(dice == 1) 
					{
						System.out.println("컴퓨터: 가위");
						System.out.println("당신의 승리입니다!"); 
						System.out.println();
						win++;
					}
					else if(dice == 3)
					{
						System.out.println("컴퓨터: 보");
						System.out.println("당신의 패배입니다!"); 
						System.out.println();
						lose++;
					}
					else 
					{
						System.out.println("컴퓨터: 바위");
						System.out.println("무승부 입니다!");
						System.out.println();
						draw++;
					}
				}
				else if(answer.equals("보"))
				{
					if(dice == 1) 
					{
						System.out.println("컴퓨터: 가위");
						System.out.println("당신의  패배입니다!");
						System.out.println();
						lose++;
					}
					else if(dice == 2)
					{
						System.out.println("컴퓨터: 바위");
						System.out.println("당신의 승리입니다!"); 
						System.out.println();
						win++;
					}
					else 
					{
						System.out.println("컴퓨터: 보");
						System.out.println("무승부 입니다!"); 
						System.out.println();
						draw++;
					}
				}
				else
				{
					System.out.println("다시 입력바랍니다.");
					System.out.println();
				}
			}
			else if(select == 2)
			{
				int tot = win + lose + draw;
				System.out.println("총전적: " + tot + "전");
				System.out.println("승리: " + win);
				System.out.println("패배: " + lose);
				System.out.println("무승부: " + draw);
				System.out.println();
			}
			else if(select == 3)
			{
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
