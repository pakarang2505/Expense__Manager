package p1;

import javax.swing.*;
import java.awt.*;

public class Food extends object {
	JLabel food_label=new JLabel("food",SwingConstants.CENTER);
	JLabel food_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Food(Color color){
		super(Color.PINK);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(food_label);
		this.add(food_amount);
	}

}


