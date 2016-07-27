package evBorisov.epamSpring.colors;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created by VasDA on 27.07.2016.
 */
public class ColoredFrame extends JFrame {

    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @PostConstruct
    public void init() {
        setSize(400, 400);
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
