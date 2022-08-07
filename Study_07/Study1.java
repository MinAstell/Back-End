package Study_7;

import java.util.Scanner;

public class Study1
{
	public static void main(String[] args) 
	{
		fan f = new fan();
		f.name_change("레전드 선풍기");
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String power = "꺼짐";
		String rotate = "꺼짐";
		int speed = 0;
		String speed2 = "꺼짐";
		String head = "아래";
		
		while(true)
		{
			System.out.println("------ 선풍기 상태정보-------");
			System.out.println("선풍기명: 토네이도 선풍기");
			System.out.println("전원: " + power + " / " + "회전: " + rotate);
			System.out.println("속도: " + speed2 + " / " + "높이: " + head);
			System.out.println("1.전원켜기");
			System.out.println("2.전원끄기");
			System.out.println("3.프로그램종료");
			System.out.println("선택: ");
			
			select = sc.nextInt();
		
			if(select == 1)
			{
				while(true)
				{
					System.out.println("------ 선풍기 상태정보-------");
					System.out.println("선풍기명: 토네이도 선풍기");
					System.out.println("전원: " + power + " / " + "회전: " + rotate);
					System.out.println("속도: " + speed + " / " + "높이: " + head);
					System.out.println("1.회전설정");
					System.out.println("2.속도조정");
					System.out.println("3.높이조정");
					System.out.println("4.메인화면으로");
					System.out.println("선택: ");
					
					int select2 = sc.nextInt();
					
					if(select2 == 1)
					{
						if(rotate == "꺼짐")
						{
							System.out.println("현재 회전이 꺼져있습니다.");
							System.out.println("선풍기를 회전하시겠습니까?");
							System.out.println("y or n: ");
							String select3 = sc.next();
							
							if(select3.equals("y"))
							{
								rotate = "켜짐";
								System.out.println("선풍기 회전이 시작합니다.");
							}
							else if(select3.equals("n"))
							{
								System.out.println("선풍기 회전을 진행하지 않습니다.");
							}
						}
						else if(rotate == "켜짐")
						{
							rotate = "꺼짐";
							System.out.println("현재회전이 켜저있습니다.");
							System.out.println("선풍기를 회전을 종료하시겠습니까?");
							System.out.println("y or n: ");
							String select4 = sc.next();
							
							if(select4.equals("y"))
							{
								rotate = "꺼짐";
								System.out.println("선풍기 회전을 종료합니다.");
							}
							else if(select4.equals("n"))
							{
								System.out.println("선풍기 회전을 종료하지 않습니다.");
							}
						}
					}
					else if(select2 == 2)
					{
						System.out.println("현재속도가 " + speed2 + "입니다.");
						System.out.println("풍속설정(0.꺼짐 1.약풍, 2.중풍, 3.강풍): ");
						System.out.println("선택: ");
						
						int select5 = sc.nextInt();
						
						if(select5 == 0)
						{
							speed = 0;
							speed2 = "꺼짐";
						}
						else if(select5 == 1)
						{
							speed = 1;
							speed2 = "켜짐";
						}
						else if(select5 == 2)
						{
							speed = 2;
							speed2 = "켜짐";
						}
						else if(select5 == 3)
						{
							speed = 3;
							speed2 = "켜짐";
						}
					}
					else if(select2 == 3)
					{
						System.out.println("현재 아래 고정입니다.");
						System.out.println("헤드를 올리시겠습니까?(y,n): ");
						System.out.println("선택: ");
						
						String select6 = sc.next();
						
						if(select6.equals("y"))
						{
							System.out.println("선풍기 헤드가 위로 올라갑니다.");
						}
						else if(select6.equals("n"))
						{
							System.out.println("현재 상태를 유지합니다.");
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
				System.out.println("선풍기의 전원이 꺼짐");
				power = "꺼짐";
			}
			else if(select == 3)
			{
				System.out.println("프로그램종료");
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
	String model_name = "토네이도 선풍기";
	int fan_speed = 0;
	int mode_type = 0;
	
	
	void power_mode(int data)
	{
		if(data == 0)
		{
			System.out.println("전원 OFF");
		}
		else if(data == 1)
		{
			System.out.println("전원 ON");
		}
	}
	void rotation(int data)
	{
		if(data == 0)
		{
			System.out.println("회전 OFF");
		}
		else if(data == 1)
		{
			System.out.println("회전 ON");
		}
	}
	void fan_speed(int data)
	{
		if(data == 0)
		{
			System.out.println("약풍");
		}
		else if(data == 1)
		{
			System.out.println("중풍");
		}
		else if(data == 2)
		{
			System.out.println("강풍");
		}
	}
	void head_control(int data)
	{
		if(data == 0)
		{
			System.out.println("낮음");
		}
		else if(data == 1)
		{
			System.out.println("높음");
		}
	}
	void name_change(String data)
	{
		System.out.println("선풍기명이 " + data + "(으)로 변경됬습니다.");
	}
}


