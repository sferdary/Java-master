package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setSize(175,100);
        Color dark_blue = new Color(10, 30, 71);
        setBackground(dark_blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("First applet by:", 50, 40 );
        g.drawString("Samuel Ferdary", 45, 65 );
    }
}