package evBorisov.epamJava.one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by VasDA on 21.07.2016.
 */
public class ListenerTest {
    public ListenerTest() {
        final int x = 1;

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(x);
                System.err.println(x);
            }
        });
    }
}
