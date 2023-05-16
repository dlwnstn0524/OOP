package innerClass;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This program demonstrates the use of inner classes.
 * @version 1.11 2017-12-14
 * @author Cay Horstmann
 */
public class InnerClassTest
{
   public static void main(String[] args)
   {
      var clock = new TalkingClock(1000, true);
//      clock.start();
      ActionListener listener = clock.new TimePrinter();
      Timer t = new Timer(1000, listener);
      t.start();

      // keep program running until the user selects "OK"
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
