package h06;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {
    private double One, Two, Three, Answer;

    public void init() {
        setBackground(Color.white);
        One = 5.9;
        Two = 6.3;
        Three = 6.9;
        double totalNumbers = 3;

        double ansOne = (((One + Two + Three) / totalNumbers) * 10);
        int average = (int) ansOne;
        double ansTwo = average;
        Answer = (ansTwo / 10);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Average of 3 numbers:", 10, 30);

        g.drawString("Number 1:", 15, 60);
        g.drawString(One + "", 90, 60);

        g.drawString("Number 2:", 15, 80);
        g.drawString(Two + "", 90, 80);

        g.drawString("Number 3:", 15, 100);
        g.drawString(Three + "", 90, 100);

        //Horizontal lines
        g.drawLine(10, 105, 115, 105);

        g.drawString("Average:", 15, 120);
        g.drawString(Answer + "", 90, 120);
    }
}