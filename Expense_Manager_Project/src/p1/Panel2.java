package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel2 extends JPanel implements ActionListener,ItemListener {
	JPanel fill_panel=new JPanel();
	
	String category []= {"food","transportation","grocery",
			"utility","medical & healthcare","entertainment"};
	JComboBox<String> cate_box=new JComboBox<String>(category);
	
	JTextField input_amount=new JTextField(15);
	
	JButton add_button=new JButton("add");
	
	JPanel category_panel=new JPanel();
	

	Food food_panel=new Food(Color.PINK);
	Transportation transport_panel=new Transportation(Color.ORANGE);
	Grocery grocery_panel=new Grocery(Color.CYAN);
	Utility utility_panel=new Utility(Color.YELLOW);
	Health health_panel=new Health(Color.GREEN);
	Entertain entertain_panel=new Entertain(Color.LIGHT_GRAY);
	
	Panel1 pn1;

	
	public Panel2(Panel1 pn1) {
		this.pn1=pn1;
		fill_panel.setLayout(new GridLayout(1,3));
		fill_panel.add(cate_box);
		fill_panel.add(input_amount);
		fill_panel.add(add_button);
		
		category_panel.setLayout(new GridLayout(3,2));
		category_panel.add(food_panel);
		category_panel.add(transport_panel);
		category_panel.add(grocery_panel);
		category_panel.add(utility_panel);
		category_panel.add(health_panel);
		category_panel.add(entertain_panel);
		
		this.setLayout(new BorderLayout());
		this.add(fill_panel,BorderLayout.NORTH);
		this.add(category_panel,BorderLayout.CENTER);
		cate_box.addItemListener(this);
		add_button.addActionListener(this);
		
		
	}
	
	//add user input's amount in each category
	public void actionPerformed(ActionEvent e) {
		if ((String)cate_box.getSelectedItem()=="food")
		{food_panel.amount=food_panel.amount+Double.parseDouble(input_amount.getText());
		(food_panel.food_amount).setText("B"+food_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		
		}
		
		if ((String)cate_box.getSelectedItem()=="transportation")
		{transport_panel.amount=transport_panel.amount+Double.parseDouble(input_amount.getText());
		(transport_panel.transport_amount).setText("B"+transport_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		}
		
		if ((String)cate_box.getSelectedItem()=="grocery")
		{grocery_panel.amount=grocery_panel.amount+Double.parseDouble(input_amount.getText());
		(grocery_panel.grocery_amount).setText("B"+grocery_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		}
		
		if ((String)cate_box.getSelectedItem()=="utility")
		{utility_panel.amount=utility_panel.amount+Double.parseDouble(input_amount.getText());
		(utility_panel.utility_amount).setText("B"+utility_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		//System.out.println(""+object.total_amount);
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		}
		
		if ((String)cate_box.getSelectedItem()=="medical & healthcare")
		{health_panel.amount=health_panel.amount+Double.parseDouble(input_amount.getText());
		(health_panel.health_amount).setText("B"+health_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		}
		
		if ((String)cate_box.getSelectedItem()=="entertainment")
		{entertain_panel.amount=entertain_panel.amount+Double.parseDouble(input_amount.getText());
		(entertain_panel.entertain_amount).setText("B"+entertain_panel.amount);
		
		object.total_amount=(int) (object.total_amount+Double.parseDouble(input_amount.getText()));
		(pn1.total_label).setText("Total Expense: B"+object.total_amount);
		}
	}
	
	//create border in each category's panel when each is selected
	public void itemStateChanged(ItemEvent e) {
		if ((String)cate_box.getSelectedItem()=="food")
		{food_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		transport_panel.setBorder(BorderFactory.createEmptyBorder());
		grocery_panel.setBorder(BorderFactory.createEmptyBorder());
		utility_panel.setBorder(BorderFactory.createEmptyBorder());
		health_panel.setBorder(BorderFactory.createEmptyBorder());
		entertain_panel.setBorder(BorderFactory.createEmptyBorder());}
		
		if ((String)cate_box.getSelectedItem()=="transportation")
		{transport_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		food_panel.setBorder(BorderFactory.createEmptyBorder());
		grocery_panel.setBorder(BorderFactory.createEmptyBorder());
		utility_panel.setBorder(BorderFactory.createEmptyBorder());
		health_panel.setBorder(BorderFactory.createEmptyBorder());
		entertain_panel.setBorder(BorderFactory.createEmptyBorder());}
		
		if ((String)cate_box.getSelectedItem()=="grocery")
		//{grocery_panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		{grocery_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		food_panel.setBorder(BorderFactory.createEmptyBorder());
		transport_panel.setBorder(BorderFactory.createEmptyBorder());
		utility_panel.setBorder(BorderFactory.createEmptyBorder());
		health_panel.setBorder(BorderFactory.createEmptyBorder());
		entertain_panel.setBorder(BorderFactory.createEmptyBorder());}
		
		if ((String)cate_box.getSelectedItem()=="utility")
		{utility_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		food_panel.setBorder(BorderFactory.createEmptyBorder());
		transport_panel.setBorder(BorderFactory.createEmptyBorder());
		grocery_panel.setBorder(BorderFactory.createEmptyBorder());
		health_panel.setBorder(BorderFactory.createEmptyBorder());
		entertain_panel.setBorder(BorderFactory.createEmptyBorder());}
		
		if ((String)cate_box.getSelectedItem()=="medical & healthcare")
		{health_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		food_panel.setBorder(BorderFactory.createEmptyBorder());
		transport_panel.setBorder(BorderFactory.createEmptyBorder());
		grocery_panel.setBorder(BorderFactory.createEmptyBorder());
		utility_panel.setBorder(BorderFactory.createEmptyBorder());
		entertain_panel.setBorder(BorderFactory.createEmptyBorder());}
		
		if ((String)cate_box.getSelectedItem()=="entertainment")
		{entertain_panel.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		food_panel.setBorder(BorderFactory.createEmptyBorder());
		transport_panel.setBorder(BorderFactory.createEmptyBorder());
		grocery_panel.setBorder(BorderFactory.createEmptyBorder());
		utility_panel.setBorder(BorderFactory.createEmptyBorder());
		health_panel.setBorder(BorderFactory.createEmptyBorder());}
			
	}

}
