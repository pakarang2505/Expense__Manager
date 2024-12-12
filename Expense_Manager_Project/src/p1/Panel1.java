package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel1 extends JPanel {
	JLabel total_label=new JLabel("Total Expense: B"+object.total_amount,SwingConstants.CENTER);
	
	JPanel sum_panel=new JPanel();
	JLabel blank_label1=new JLabel(" ");
	JLabel blank_label2=new JLabel(" ");
	JLabel food_sum=new JLabel("food = 0.0 %");
	JLabel transport_sum=new JLabel("transportation = 0.0 %");
	JLabel grocery_sum=new JLabel("grocery = 0.0 %");
	JLabel utility_sum=new JLabel("utility = 0.0 %");
	JLabel health_sum=new JLabel("medical & healthcare = 0.0 %");
	JLabel entertain_sum=new JLabel("entertainment = 0.0 %");
	
	
	
	
	public Panel1(){
		this.setLayout(new BorderLayout());		
		this.add(total_label,BorderLayout.NORTH);
		this.add(sum_panel,BorderLayout.EAST);

		sum_panel.setLayout(new GridLayout(8,1));
		sum_panel.add(blank_label1);
		sum_panel.add(food_sum);
		sum_panel.add(transport_sum);
		sum_panel.add(grocery_sum);
		sum_panel.add(utility_sum);
		sum_panel.add(health_sum);
		sum_panel.add(entertain_sum);
		sum_panel.add(blank_label2);

		
		
	}
}
