package h11;

import java.applet.Applet;
import java.awt.*;

public class Theorie11 extends Applet {
    //For statement
    int tellerFor;
    int yFor = 0;

    //While statement
    int tellerWhile = 0;
    int yWhile = 0;
    
    public void init() {

    }

    public void paint(Graphics g) {
        //For statement
        for (tellerFor = 0; tellerFor < 10; tellerFor++) {
            yFor += 20;
            g.drawLine(50, yFor, 300, yFor);
            g.drawString("" + tellerFor, 305, yFor);

            //While statement (keeps on going)
            while (tellerWhile < 10) {
                yWhile += 20;
                g.drawLine(50, yWhile, 300, yWhile);
                g.drawString("" + tellerWhile, 305, yWhile);
                tellerWhile++;
            }
        }
    }
}
