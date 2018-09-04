package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("Eerste applet door:", 150, 50 );
        g.drawString("Samuel Ferdary", 155, 75 );
    }
}