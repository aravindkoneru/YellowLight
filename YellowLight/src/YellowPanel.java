import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class YellowPanel extends JPanel {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.black);
		Color grassGreen = new Color(18, 161, 39);
		
		//Draw the top road (30mph 7mi wide)
		g2.drawLine(215, 0, 215, 205);
		g2.drawLine(285, 0, 285, 205);

		//Draw the bottom road (30mph 7mi wide)
		g2.drawLine(215, 500, 215, 295);
		g2.drawLine(285, 500, 285, 295);
		
		//Draw the left road (50mph 9mi wide)
		g2.drawLine(0, 205, 215, 205);
		g2.drawLine(0, 295, 215, 295);
		
		//Draw the right road (50mph 9mi wide)
		g2.drawLine(500, 205, 285, 205);
		g2.drawLine(500, 295, 285, 295);
		
		g2.setColor(grassGreen);
		//Draw the green rectangle (top Left)
		g2.fillRect(0, 0, 215, 205);
		
		//Draw the green rectangle (top right)
		g2.fillRect(286, 1, 215, 204);
		
		//Draw the green rectangle (bottom left)
		g2.fillRect(0,296,215,205);
		
		//Draw the green rectangle (bottom right)
		g2.fillRect(286, 296, 215, 205);
		
		//Calibration lines
		//g2.drawLine(250, 500, 250, 0);
		//g2.drawLine(0, 250, 500, 250);	
	}
	
	public void drawCar(Graphics g){
		
	}

}
