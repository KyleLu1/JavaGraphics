package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -lol
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.GRAY);
      window.fillRect(350, 100, 100, 100);
      window.drawLine(400, 100, 350, 50);
      window.drawLine(400, 100, 450, 50);
      
      window.setColor(Color.YELLOW);
      window.fillOval(370, 125, 15, 30);
      window.fillOval(415, 125, 15, 30);
      window.fillRect(374, 170, 50, 15);
      
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(300, 200, 200,200);
       window.drawLine(200, 275, 300, 275);
       window.drawLine(500, 275, 600, 275);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(310, 400, 50, 100);
       window.fillRect(440, 400, 50, 100);

   }
}
