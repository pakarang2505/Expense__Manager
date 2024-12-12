package p1;

import javax.swing.*;
import java.awt.*;

public class Health extends object {
	JLabel health_label=new JLabel("medical & healthcare",SwingConstants.CENTER);
	JLabel health_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Health(Color color){
		super(Color.GREEN);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(health_label);
		this.add(health_amount);
}

}
