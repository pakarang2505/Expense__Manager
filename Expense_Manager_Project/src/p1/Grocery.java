package p1;

import javax.swing.*;
import java.awt.*;

public class Grocery extends object {
	JLabel grocery_label=new JLabel("grocery",SwingConstants.CENTER);
	JLabel grocery_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Grocery(Color color){
		super(Color.CYAN);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(grocery_label);
		this.add(grocery_amount);
}
}
