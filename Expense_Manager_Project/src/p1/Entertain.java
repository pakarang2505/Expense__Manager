package p1;

import javax.swing.*;
import java.awt.*;

public class Entertain extends object{
	JLabel entertain_label=new JLabel("Entertainment",SwingConstants.CENTER);
	JLabel entertain_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Entertain(Color color){
		super(Color.LIGHT_GRAY);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(entertain_label);
		this.add(entertain_amount);
}

}

