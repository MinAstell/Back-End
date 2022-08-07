package Study_16;

import java.awt.*;

public class 윈도우_프레임_가운데_정렬 
{
	public static void main(String[] args)
	{
		win_cen wc = new win_cen();
	}
}

class win_cen extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;

	public win_cen() 
	{
		super(); // 부모가 상속받은 Frame을 쓰기위해 부모를 호출하여 윈도우 프레임을 띄움
		this.init();
		this.start();
		this.setSize(300, 200);
		dimen = Toolkit.getDefaultToolkit().getScreenSize(); // 화면전체 크기
		dimen1 = this.getSize(); // 만들 화면 크기
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true); // 화면 띄우기 여부
	}

	public void init()
	{
		// 화면 구성 넣을 부분
	}

	public void start() 
	{
		// 이벤트나 Thread 처리할 부분
	}
}
