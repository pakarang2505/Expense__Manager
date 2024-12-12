package p1;
import javax.swing.*;
import java.awt.*;

public class Transportation extends object{
	JLabel transport_label=new JLabel("transportation",SwingConstants.CENTER);
	JLabel transport_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Transportation(Color color){
		super(Color.ORANGE);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(transport_label);
		this.add(transport_amount);
}
}
