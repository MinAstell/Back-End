package Study_2;

import java.util.Scanner;

public class Study5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 사고싶은 사과박스 개수는?");
		int count = sc.nextInt();
		System.out.println("당신이 사고싶은 사과개수는?");
		int box_in = sc.nextInt();
		System.out.println("사과과격을 정해주세요.");
		int price = sc.nextInt();
		
		int tot = count;
		int tot_price = count * box_in * price;
		int tot_sell = tot * box_in;
		int can_sell = 200;
		int drop_count = can_sell - tot;
		
		System.out.println("사과박스당 개수: " + box_in);
		System.out.println("사과박스 개수: " + count);
		System.out.println("사과가격: " + price);
		
		System.out.println("총박스 개수: " + tot + " / 총가격: " + tot_price + "원");
		System.out.println("판매된 사과개수: " + tot_sell);
		System.out.println("남은박스 개수: " + drop_count + " / 판매금액: " + tot_price + "원");	
	}
}
