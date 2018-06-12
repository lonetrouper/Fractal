package fractal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class FractalDraw
  extends JPanel
{
  private Rectangle[] boxes;
  private int index;
  
  public FractalDraw(Rectangle[] aBoxes, int aIndex)
  {
    this.boxes = aBoxes;
    this.index = aIndex;
  }
  
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;
    setBackground(Color.WHITE);
    super.paintComponent(g2);
    for (int i = 0; i < this.index; i++)
    {
      g2.setColor(Color.BLACK);
      g2.setStroke(new BasicStroke(3.0F));
      g2.draw(this.boxes[i]);
    }
  }
}

