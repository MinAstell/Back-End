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
			System.out.println("1.계좌생성");
			System.out.println("2.계좌조회");
			System.out.println("3.입금하기");
			System.out.println("4.출금하기");
			System.out.println("5.프로그램종료");
			System.out.println("special.관리자용(접근불가능)");
			System.out.print("선택: ");
			
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
				System.out.println("프로그램종료"); break;
			}
			else if(select == 10)
			{
				select_all();
			}
			else 
			{
				System.out.println("다시 입력바랍니다.");
			}
		}
	}
	void deposit() //입금
	{
		System.out.println("입금할 계좌의 계좌번호를 입력해주세요.");
		String acc = sc.next();
		
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]))
			{
				System.out.print("계좌에 얼마를 입금하시겠습니까?: ");
				this.money[i] += sc.nextInt();
				System.out.println();
				System.out.print("계좌에 입급이 성공적으로 완료되었습니다."); 
				System.out.println();
			}
		}
	}
	void withdraw() //출금
	{
		System.out.println("출금할 계좌의 계좌번호를 입력해주세요.");
		String acc = sc.next();
		System.out.println("출금할 계좌의 비밀번호를 입력해주세요.");
		String pw = sc.next();
		System.out.println("계좌에서 얼마를 출금하시겠습니까?");
		int money = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]) && pw.equals(this.pw[i]))
			{
				this.money[i] -= money;
				System.out.println("당신의 계좌에서 " + money + "원이 출금되었습니다.");
				System.out.println("출금 후 남은 잔액: " + this.money[i]);
				System.out.println();
			}
		}
	}
	void search()
	{
		System.out.println("조회할 계좌의 계좌번호를 입력해주세요.");
		String acc = sc.next();
		System.out.println("조회할 계좌의 비밀번호를 입력해주세요.");
		String pw = sc.next();
		for(int i = 0; i < count; i++)
		{
			if(acc.equals(this.acc[i]) && pw.equals(this.pw[i]))
			{
				System.out.println("조회하신 계좌의 정보는 다음과 같습니다.");
				System.out.println();
				System.out.println("이름: " + this.name[i] + " 계좌번호: " + this.acc[i] + " 잔액: " + this.money[i] + "원");
				System.out.println();
			}
		}
	}
	void newacc()
	{
		System.out.println("계좌를 생설할 본인의 성명을 입력해주세요.");
		name[count] = sc.next();
		System.out.println("사용할 계좌번호를 입력해주세요.");
		acc[count] = sc.next();
		System.out.println("사용할 계좌의 비밀번호를 입력해주세요.");
		pw[count] = sc.next();
		System.out.print("사용할 계좌에 얼마를 입금하시겠습니까?: ");
		money[count] = sc.nextInt(); count++;
		System.out.println("요청하신 계좌의 개설이 완료되었습니다.");
		System.out.println();
	}
	void select_all()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println("계좌번호: " + acc[i]);
			System.out.println("계좌주명: " + name[i]);
			System.out.println("잔액: " + money[i]);
			System.out.println();
		}
	}
}
