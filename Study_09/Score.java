package Study_9;

import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	int kor,eng, mat;
	
	void input() {
		System.out.print("����:"); kor = sc.nextInt();
		System.out.print("����:"); eng = sc.nextInt();
		System.out.print("����:"); mat = sc.nextInt();		
	}
}
