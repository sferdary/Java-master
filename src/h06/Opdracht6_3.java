package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_3 extends Applet {
    private int intOne, intTwo, Answer;

    public void init() {
        setSize(200, 150);
        setBackground(Color.white);
        intOne = 2147483647;
        intTwo = 2147483526;
        Answer = intOne + intTwo;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        int xText = 15;
        g.drawString("Negative answer:", xText, 30 );

        g.drawString("Integer one:", xText, 60 );
        int xInt = 100;
        g.drawString(intOne + "", xInt, 60 );

        g.drawString("Integer two:", xText, 80 );
        g.drawString(intTwo + " +", xInt, 80 );

        g.drawString("Answer:", xText, 100 );
        int xAns = 145;
        g.drawString(Answer + "", xAns, 100 );

        //Horizontal lines
        g.drawLine(10,85,175,85);
    }
}