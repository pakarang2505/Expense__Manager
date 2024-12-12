package p1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateLabel extends JLabel implements ActionListener {
	int counter;
	Timer timer=new Timer(500,this);
	
	Color bg;
	Color fg;
	
	
	public UpdateLabel(String text) {
		super(text,SwingConstants.CENTER);
		
		bg=this.getBackground();
		fg=this.getForeground();
	}
	

	public void actionPerformed(ActionEvent e) {
		if (counter%2==0)
		{this.setForeground(bg);}
		else
		{this.setForeground(fg);
		this.setText("UPDATED!");}
		if(counter==6)
		{counter=0;
		timer.stop();
		}
		counter++;
	}
}

