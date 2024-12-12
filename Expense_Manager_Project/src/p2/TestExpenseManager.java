package p2;
import javax.swing.*;

import p1.Panel1;
import p1.Panel2;
import p1.Panel3;

import java.awt.*;

public class TestExpenseManager {

	public static void main(String[] args) {
		Color color;
		Font font=new Font("Verdana",Font.PLAIN,22);
		JFrame frame=new JFrame();
		frame.setTitle("expense manager");
		ImageIcon img=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\logoicon.PNG");
		frame.setIconImage(img.getImage());
		frame.setVisible(true);
		frame.setSize(700,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel1 pn1=new Panel1();
		Panel2 pn2=new Panel2(pn1);
		Panel3 pn3=new Panel3(pn1,pn2);

		frame.add(pn1,BorderLayout.NORTH);
		frame.add(pn2,BorderLayout.CENTER);
		frame.add(pn3,BorderLayout.SOUTH);
		
		
		

	}

}

