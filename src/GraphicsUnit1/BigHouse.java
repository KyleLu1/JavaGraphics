package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.RED);
      window.fillPolygon(new int[] {700, 100, 400}, new int[] {200, 200, 100}, 3);
      
      window.setColor(Color.YELLOW);
      window.fillRect( 250, 250, 100, 100);
      window.fillRect( 450, 250, 100,100);
      
      window.setColor(Color.BLACK);
      window.fillRect(350, 400, 100, 300);
      
      window.setColor(Color.GRAY);
      window.fillRect(675, 400, 50, 200);
      
      window.setColor(Color.GREEN);
      window.fillOval(625, 300, 150, 150);
      
      window.setColor(Color.DARK_GRAY);
      window.fillPolygon(new int[] {70, 95, 120}, new int[] {560, 510, 560}, 3);
      
      window.setColor(Color.YELLOW);
      window.fillRect(25, 465, 150, 50);
   }
}