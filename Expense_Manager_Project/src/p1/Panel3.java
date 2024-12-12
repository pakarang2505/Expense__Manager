package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel3 extends JPanel implements ActionListener {
	JButton calculate_button=new JButton("calculate %");
	private JLabel reminder_label=new JLabel("Please spend money carefully",
			SwingConstants.CENTER);	
	
	
	Panel1 pn1;
	Panel2 pn2;
	Panel3 pn3;
	
	UpdateLabel update_label=new UpdateLabel(" ");
	
	
	
	public Panel3(Panel1 pn1,Panel2 pn2) {
		this.pn1=pn1;
		this.pn2=pn2;
		this.setLayout(new BorderLayout());
		this.add(calculate_button,BorderLayout.CENTER);
		this.add(reminder_label,BorderLayout.SOUTH);
		
		pn1.add(update_label,BorderLayout.SOUTH);
		
		calculate_button.addActionListener(this);
	}

	//calculate each category percent and put in each label
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==calculate_button)
		{ (pn2.food_panel).percent=((pn2.food_panel).amount/object.total_amount)*100;
		(pn2.food_panel).percent=Math.round((pn2.food_panel).percent);
		(pn1.food_sum).setText("food = "+(pn2.food_panel).percent+"%");
		/*System.out.println(""+(pn2.food_panel).amount);
		System.out.println(""+object.total_amount);
		System.out.println(""+(pn2.food_panel).percent);*/
		
		(pn2.transport_panel).percent=((pn2.transport_panel).amount/object.total_amount)*100;
		(pn2.transport_panel).percent=Math.round((pn2.transport_panel).percent);
		(pn1.transport_sum).setText("transportation = "+(pn2.transport_panel).percent+"%");
		
		(pn2.grocery_panel).percent=((pn2.grocery_panel).amount/object.total_amount)*100;
		(pn2.grocery_panel).percent=Math.round((pn2.grocery_panel).percent);
		(pn1.grocery_sum).setText("grocery = "+(pn2.grocery_panel).percent+"%");
		
		(pn2.utility_panel).percent=((pn2.utility_panel).amount/object.total_amount)*100;
		(pn2.utility_panel).percent=Math.round((pn2.utility_panel).percent);
		(pn1.utility_sum).setText("utility= "+(pn2.utility_panel).percent+"%");
		
		(pn2.health_panel).percent=((pn2.health_panel).amount/object.total_amount)*100;
		(pn2.health_panel).percent=Math.round((pn2.health_panel).percent);
		(pn1.health_sum).setText("medical & healthcare = "+(pn2.health_panel).percent+"%");
		
		(pn2.entertain_panel).percent=((pn2.entertain_panel).amount/object.total_amount)*100;
		(pn2.entertain_panel).percent=Math.round((pn2.entertain_panel).percent);
		(pn1.entertain_sum).setText("entertainment = "+(pn2.entertain_panel).percent+"%");
		
		Panel4 pn4=new Panel4(pn1,pn2,pn3);
		pn1.add(pn4);
		
		//UpdateLabel update_label=new UpdateLabel("UPDATED!");
		(update_label).timer.start();
	}
}
}
