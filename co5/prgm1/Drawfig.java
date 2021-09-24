// Program to draw Circle, Rectangle, Line in Applet.

import java.awt.*;
import java.applet.*;
/*
<applet code="Drawfig" width=300 height=200>
</applet>
*/
public class Drawfig extends Applet
{
   public void paint(Graphics g)
   {
     g.fillOval(10,10,200,200);
     g.fillRect(300,10,200,200);
     g.drawLine(800,10,700,300);
   }
}