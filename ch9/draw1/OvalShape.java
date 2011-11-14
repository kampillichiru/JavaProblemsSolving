

package draw1; 

import java.awt.*; 

public class OvalShape extends TwoEndsShape {

  public void draw(Graphics g) {
    super.beforDraw(g);
    Graphics2D g2 = (Graphics2D)g;

    int x = Math.min(x1, x2); 
    int y = Math.min(y1, y2); 
    int w = Math.abs(x1 - x2) + 1; 
    int h = Math.abs(y1 - y2) + 1;     

    g2.drawOval(x, y, w, h);
  }

  public void drawOutline(Graphics g, int x1, int y1, int x2, int y2) {
    int x = Math.min(x1, x2); 
    int y = Math.min(y1, y2); 
    int w = Math.abs(x1 - x2) + 1; 
    int h = Math.abs(y1 - y2) + 1;     
    g.drawOval(x, y, w, h);
  }

}
