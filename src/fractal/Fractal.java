package fractal;

import java.awt.Rectangle;

public class Fractal
{
  private static int index = 0;
  public Rectangle[] boxes;
  public int arraySize = 0;
  
  public Fractal()
  {
    this.boxes = new Rectangle[100000];
  }
  
  public void calc(int x, int y, int length)
  {
    if (length > 2)
    {
      calc(x - length, y - length, length / 2);
      calc(x + length, y - length, length / 2);
      calc(x - length, y + length, length / 2);
      calc(x + length, y + length, length / 2);
      storage(x, y, length);
    }
  }
  
  public void storage(int x, int y, int length)
  {
    this.boxes[index] = new Rectangle(x - length, y - length, 2 * length, 2 * length);
    index += 1;
    this.arraySize = index;
  }
}
