package Study_17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

public class �����ư 
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
		super("���� ��ư"); // Frame�� ����
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

	public void init() // ȭ�� ���� ���� �κ�
	{
		CardLayout card = new CardLayout(5, 5); // �׸��巹�̾ƿ��� �ۿ��� ����
		this.setLayout(card); // �ֺ� �ѷ�(�����ڸ�) ���� ������ ����

		GridLayout grid = new GridLayout(4, 3, 5, 5); // GridLayout(��, ��, �׸��� ���ʿ���, �׸��� ���ʿ���)
		Panel p = new Panel(grid); // �׸��巹�̾ƿ� ���ʿ� ���� �г�

		Font font = new Font("TimesRoman", Font.BOLD, 20); // ��Ʈ ũ�� �� ����
		Font font1 = new Font("SansSerif", Font.BOLD, 20); // ��Ʈ ũ�� �� ����

		String[] str = { "*", "0", "#" };
		
		for (int i = 0; i < bt.length; i++) // ��ư �������� �ѹ��� ����� ���� for���� ������ ����
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
		this.add("view", p); // ��¥ �������� ���̾ƿ��� p��� �г��� �߰����Ѽ� ������
	}

	public void start() 
	{
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}