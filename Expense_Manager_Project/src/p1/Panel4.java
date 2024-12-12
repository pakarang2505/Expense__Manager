package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Panel4 extends JPanel implements MouseMotionListener{
	Panel1 pn1;
	Panel2 pn2;
	Panel3 pn3;
	
	int food_angle;
	int transport_angle;
	int grocery_angle;
	int utility_angle;
	int health_angle;
	int entertain_angle;
	
	Color oval_color=Color.white;
	

	Panel4(Panel1 pn1,Panel2 pn2,Panel3 pn3){
		this.pn1=pn1;
		this.pn2=pn2;
		this.pn3=pn3;
		
		this.addMouseMotionListener(this);
		
		repaint();
		
	}

protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	
	food_angle=(int)(Math.round(((pn2.food_panel).percent/100)*360));
	transport_angle=(int)(Math.round(((pn2.transport_panel).percent/100)*360));
	grocery_angle=(int)(Math.round(((pn2.grocery_panel).percent/100)*360));
	utility_angle=(int)(Math.round(((pn2.utility_panel).percent/100)*360));
	health_angle=(int)(Math.round(((pn2.health_panel).percent/100)*360));
	entertain_angle=(int)(Math.round(((pn2.entertain_panel).percent/100)*360));
	
	//pie chart's border that appears when mouse moved in pie chart's area
	g.setColor(oval_color);
	g.fillOval(295, 5, 110, 110);
	
	//pie chart
	g.setColor(Color.PINK);
	g.fillArc(300,10,100,100,0,food_angle);
	
	g.setColor(Color.ORANGE);
	g.fillArc(300,10,100,100,food_angle
			,transport_angle);
	
	g.setColor(Color.CYAN);
	g.fillArc(300,10,100,100,food_angle+transport_angle
			,grocery_angle);
	
	g.setColor(Color.YELLOW);
	g.fillArc(300,10,100,100,food_angle+transport_angle+grocery_angle
			,utility_angle);
	
	g.setColor(Color.GREEN);
	g.fillArc(300,10,100,100,food_angle+transport_angle+grocery_angle+utility_angle
			,health_angle);
	
	g.setColor(Color.LIGHT_GRAY);
	g.fillArc(300,10,100,100,food_angle+transport_angle+grocery_angle+utility_angle+health_angle
			,entertain_angle);
	

	
}

public void mouseDragged(MouseEvent e) {}
public void mouseMoved(MouseEvent e) {
	//pie chart's area
	if ((e.getX()>300)&&(e.getX()<300+100)
		&& (e.getY()>10)&&(e.getY()<10+100))
	{	oval_color=Color.BLUE;
		repaint();}
	else
	{ 	oval_color=this.getBackground();
		repaint();}
}

}