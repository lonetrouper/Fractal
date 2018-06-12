package fractal;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FractalCalc
{
  public static void main(String[] args)
  {
    String temp_X = JOptionPane.showInputDialog("Enter x:");
    int aX = Integer.parseInt(temp_X);
    
    String temp_Y = JOptionPane.showInputDialog("Enter y:");
    int aY = Integer.parseInt(temp_Y);
    
    String temp_length = JOptionPane.showInputDialog("Enter length:");
    int aLength = Integer.parseInt(temp_length);
    
    JFrame frame = new JFrame();
    frame.setSize(750, 750);
    Container contentPane = frame.getContentPane();
    Fractal sample = new Fractal();
    sample.calc(aX, aY, aLength);
    FractalDraw hope = new FractalDraw(sample.boxes, sample.arraySize);
    contentPane.add(hope);
    
    frame.setVisible(true);
  }
}
