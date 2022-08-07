package Study_2;
import java.util.Scanner;

public class Study11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력해주세요.");
		String name = sc.next();
		
		switch(name)
		{
		case "홍길동" : System.out.println("동에번쩍서에번쩍 옛날사람!");
		break;
		case "에스파" : System.out.println("와우~! 요새 이쁜 아이돌!!");
		break;
		case "이병헌" : System.out.println("로맨틱 성공적! 이걸 연기로! 격파!");
		break;
		case "마동석" : System.out.println("행님 존경합니다!");
		break;
		default: System.out.println("알수없는 사람입니다.");
		}
	}
}
