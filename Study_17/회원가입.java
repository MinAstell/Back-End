package Study_17;
import java.awt.*;
public class ȸ������ {
	public static void main(String[] args) {
		Join2 l = new Join2();
	}
}
class Join2 extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("ȸ������");
	Label lbId = new Label("�� �� ��  : ");
	Label lbPw = new Label("��й�ȣ : ");
	Label lbPw2 = new Label("���Ȯ�� : ");
	Label lbName = new Label("��    �� : ");
	Label lbHp = new Label("��    ��  : ");
	
	TextField tfId = new TextField(20);
	TextField tfPw = new TextField(20);
	TextField tfPw2 = new TextField(20);
	TextField tfName = new TextField(20);
	TextField tfHp = new TextField(20);
		
	Button btnJoin = new Button("���ԿϷ�");
	Button btnCheck = new Button("�ߺ�üũ");
	
	Join2(){
		super("ȸ������");
		this.init();		
		this.setSize(500,500);
		this.center();//�߾ӹ�ġ		
		this.setVisible(true);
	}
	void init()
	{
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);	
		
		this.setLayout(null); 
		
		this.add(lbTitle); lbTitle.setFont(font30); 
		lbTitle.setBounds(170, 50, 200, 30);
		
		this.add(lbId); lbId.setFont(font20); 
		lbId.setBounds(50, 150, 100, 30);
		
		this.add(tfId); tfId.setFont(font20); 
		tfId.setBounds(200, 150, 100, 30);
		
		this.add(btnCheck); btnCheck.setFont(font20); 
		btnCheck.setBounds(320, 150, 120, 30);
		
		this.add(lbPw); lbPw.setFont(font20); 
		lbPw.setBounds(50, 200, 100, 30);
		
		this.add(tfPw); tfPw.setFont(font20); 
		tfPw.setBounds(200, 200, 100, 30);
		
		this.add(lbPw2); lbPw2.setFont(font20); 
		lbPw2.setBounds(50, 250, 100, 30);
		
		this.add(tfPw2); tfPw2.setFont(font20); 
		tfPw2.setBounds(200, 250, 100, 30);
		
		this.add(lbName); lbName.setFont(font20); 
		lbName.setBounds(50, 300, 100, 30);
		
		this.add(tfName); tfName.setFont(font20); 
		tfName.setBounds(200, 300, 100, 30);	
		
		this.add(lbHp); lbHp.setFont(font20); 
		lbHp.setBounds(50, 350, 100, 30);
		
		this.add(tfHp); tfHp.setFont(font20); 
		tfHp.setBounds(200, 350, 100, 30);	
		
		this.add(btnJoin); btnJoin.setFont(font20); 
		btnJoin.setBounds(200, 400, 150, 30);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
}



