package Study_16;

import java.awt.*;

public class ������_������_���_���� 
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
		super(); // �θ� ��ӹ��� Frame�� �������� �θ� ȣ���Ͽ� ������ �������� ���
		this.init();
		this.start();
		this.setSize(300, 200);
		dimen = Toolkit.getDefaultToolkit().getScreenSize(); // ȭ����ü ũ��
		dimen1 = this.getSize(); // ���� ȭ�� ũ��
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true); // ȭ�� ���� ����
	}

	public void init()
	{
		// ȭ�� ���� ���� �κ�
	}

	public void start() 
	{
		// �̺�Ʈ�� Thread ó���� �κ�
	}
}
