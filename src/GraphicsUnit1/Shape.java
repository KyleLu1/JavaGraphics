package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                                     yPos = y;
                                     width = wid;
                                     height = ht;
                                     color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      
      
      //window.fillOval(250, 250, 100, 100);
      //window.fillPolygon(new int[] {225, 375, 300}, new int[] {340, 340, 230}, 3);
      window.fillOval(xPos,yPos,width,height);
      window.fillRect(xPos, yPos+100, width, height);
      window.fillOval(xPos + 100, yPos + 100, width, height);
      window.fillOval(xPos, yPos + 200, width, height);
      window.fillOval(xPos-100, yPos+100, width, height);
      

   }

   //BONUS
   //add in set and get methods for all instance variables
   

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}