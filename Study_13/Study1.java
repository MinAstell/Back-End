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
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print("선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.print("아이디: ");
				checkId = sc.next();
				System.out.print("비밀번호: ");
				checkPw = sc.next();
				
				login(checkId, checkPw);
			}
			else if(select == 2)
			{
				join();
			}
			else if(select == 3)
			{
				System.out.println("종료합니다.");
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
				System.out.println("일반 사용자로 로그인 되었습니다.");
			}
		}
		if(id.equals(this.id) && pw.equals(this.pw))
		{
			System.out.println("관리자로 로그인 되었습니다.");
			System.out.println();
			System.out.println("1.메인메뉴");
			System.out.println("2.로그아웃");
			System.out.println("3.종료");
			System.out.println("4.회원정보 모두 보기");
			System.out.print("선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("메인메뉴로 돌아갑니다.");
			}
			else if(select == 2)
			{
				System.out.println("로그아웃 되었습니다.");
			}
			else if(select == 3)
			{
				System.out.println("종료합니다."); 
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
					System.out.println("회원정보가 없습니다.");
				}
			}
		}
		else
		{
			System.out.println("다시 시도하세요. ");
		}
	}
	void join() 
	{
		System.out.println("----회원가입 페이지----");
		System.out.println();
		System.out.println("사용하실 아이디를 입력해주세요.");
		id2[count] = sc.next();
		System.out.println("사용하실 비밀번호를 입력해주세요.");
		pw2[count] = sc.next(); 
		System.out.println("본인의 성명을 기입하세요.");
		name[count] = sc.next();
		System.out.println("본인의 전화번호를 기입하세요.");
		ph[count] = sc.next(); 
		System.out.println("회원가입이 완료되었습니다."); count++; 
		check = true;
	}
}