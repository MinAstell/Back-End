package Study_17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

public class 계산기버튼 
{
	public static void main(String[] args) 
	{
		cal_btn cb = new cal_btn();
	}
}

class cal_btn extends Frame 
{
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Button[] bt = new Button[12];

	public cal_btn() 
	{
		super("계산기 버튼"); // Frame의 제목
		this.init();
		this.start();
		this.setSize(300, 400);
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	public void init() // 화면 구성 넣을 부분
	{
		CardLayout card = new CardLayout(5, 5); // 그리드레이아웃의 밖에쪽 여백
		this.setLayout(card); // 주변 둘레(가장자리) 여백 때문에 설정

		GridLayout grid = new GridLayout(4, 3, 5, 5); // GridLayout(열, 행, 그리드 안쪽여백, 그리드 안쪽여백)
		Panel p = new Panel(grid); // 그리드레이아웃 안쪽에 만들 패널

		Font font = new Font("TimesRoman", Font.BOLD, 20); // 폰트 크기 및 굵기
		Font font1 = new Font("SansSerif", Font.BOLD, 20); // 폰트 크기 및 굵기

		String[] str = { "*", "0", "#" };
		
		for (int i = 0; i < bt.length; i++) // 버튼 여러개를 한번에 만들기 위해 for문을 돌려서 만듬
		{
			if (i < 9) {
				bt[i] = new Button(String.valueOf(i + 1));
				bt[i].setFont(font);
			} else {
				bt[i] = new Button(str[i - 9]);
				bt[i].setFont(font1);
			}
			p.add(bt[i]);
		}
		this.add("view", p); // 진짜 프레임의 레이아웃에 p라는 패널을 추가시켜서 보여줌
	}

	public void start() 
	{
		// 이벤트나 쓰레드 처리할 부분
	}
}