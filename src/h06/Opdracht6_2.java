package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_2 extends Applet {
    int Seconds, Hour, Day, Year;

    public void init() {
        setBackground(Color.white);
        Seconds = 1;
        Hour = Seconds * 3600;
        Day = Hour * 24;
        Year = Day *365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Time units in Seconds :", 10, 30);

        //Vertical lines
        g.drawLine(10, 45, 10, 105);
        g.drawLine(70, 45, 70, 105);
        g.drawLine(210, 45, 210, 105);

        //Horizontal lines
        g.drawLine(10, 45, 210, 45);
        g.drawLine(10, 65, 210, 65);
        g.drawLine(10, 85, 210, 85);
        g.drawLine(10, 105, 210, 105);

        g.drawString("Hour", 15, 60);
        g.drawString(Hour + "", 80, 60);
        g.drawString("Seconds", 150, 60);

        g.drawString("Day", 15, 80);
        g.drawString(Day + "", 80, 80);
        g.drawString("Seconds", 150, 80);

        g.drawString("Year", 15, 100);
        g.drawString(Year + "", 80, 100);
        g.drawString("Seconds", 150, 100);
    }
}