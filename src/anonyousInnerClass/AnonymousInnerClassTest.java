package anonyousInnerClass;

import javax.swing.*;

/**
 * This program demonstrates anonymous inner classes.
 *
 * @author Cay Horstmann
 * @version 1.12 2017-12-14
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
