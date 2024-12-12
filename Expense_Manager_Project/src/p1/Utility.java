package p1;
import javax.swing.*;
import java.awt.*;

public class Utility extends object{
	JLabel utility_label=new JLabel("utilitiy",SwingConstants.CENTER);
	JLabel utility_amount=new JLabel("B"+amount,SwingConstants.CENTER);
	
	Utility(Color color){
		super(Color.YELLOW);
		setBackground(color);
		setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(utility_label);
		this.add(utility_amount);
}

}
