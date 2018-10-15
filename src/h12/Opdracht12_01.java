package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_01 extends Applet {
    double numbers[], total, average;
    int y = 20;
    int x = 65;
    int xString = 10;


    public void init() {
        numbers = new double[10];
        total = 0;

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = 100 * counter + 100;
        }

        for (double number : numbers) {
            total = total + number;
        }
        average = total / numbers.length;
    }


    public void paint(Graphics g) {

        for (double number : numbers) {
            g.drawString("" + number, x, y);
            y += 20;
        }
        g.drawString("average :  " + average, xString, (y + 20));
    }
}