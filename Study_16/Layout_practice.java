package Study_16;

import java.awt.*;

public class Layout_practice 
{
	public static void main(String[] args) 
	{
		layout_test lt = new layout_test();
	}
}

class layout_test extends Frame
{
	layout_test()
	{
		this.setVisible(true);
		
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Button bt5 = new Button("Center");
		
//		Panel pn = new Panel();
//		Checkbox ck1 = new Checkbox("First");
//		Checkbox ck2 = new Checkbox("Second");
//		Checkbox ck3 = new Checkbox("Third");
//		
		
//		this.setLayout(new BorderLayout(0, 0));
		
//		this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		this.setLayout(new GridLayout(2, 2, 10, 10));
		this.add(bt1, BorderLayout.NORTH);
		this.add(bt2, BorderLayout.SOUTH);
		this.add(bt3, BorderLayout.EAST);
		this.add(bt4, BorderLayout.WEST);
		
//		this.add(bt5, BorderLayout.CENTER);
//		this.add(pn, BorderLayout.CENTER);
		
//		pn.add(ck1);
//		pn.add(ck2);
//		pn.add(ck3);
//		bt1.setSize(50, 50);
		
		this.setSize(200, 200);
		bt1.setSize(100, 100);
	}
}
