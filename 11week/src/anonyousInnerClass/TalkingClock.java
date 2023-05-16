package anonyousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TalkingClock {
    /**
     * Starts the clock.
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep)
    {
        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event){
                System.out.println("At the tone, the time is "
                        + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
//        var listener = new ActionListener()
//        {
//            public void actionPerformed(ActionEvent event)
//            {
//                System.out.println("At the tone, the time is "
//                        + Instant.ofEpochMilli(event.getWhen()));
//                if (beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };
        ActionListener listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
