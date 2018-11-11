package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_01 extends Applet {
    private double numbers[];
    private double average;
    private int y = 20;

    public void init() {
        numbers = new double[10];
        double total = 0;

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
            int x = 65;
            g.drawString("" + number, x, y);
            y += 20;
        }
        int xString = 10;
        g.drawString("average :  " + average, xString, (y + 20));
    }
}