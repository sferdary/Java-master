package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;

public class Theorie12 extends Applet {
    double salaris[];
    double maximum;
    double gezocht;
    boolean gevonden;
    String[] namen = { "Valerie", "Jeroen", "Sander", "Frank"};


    public void init() {
        salaris = new double[10];

        gezocht = 400;
        gevonden = false;
        Arrays.sort(namen);

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 100 * teller + 100;
        }



        maximum = salaris[0];
        for (int teller = 0; teller < salaris.length; teller++) {
            if (salaris[teller] > maximum) {
                maximum = salaris[teller];
            }
        }



        int teller = 0;

        while (teller < salaris.length) {
            if (salaris[teller] == gezocht) {
                gevonden = true;
            }
            teller++;
        }
    }



    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }


        g.drawString("Het maximum is: " + maximum, 100, 20);


        if (gevonden == true) {
            g.drawString("De waarde is gevonden.", 100, 60);
        } else {
            g.drawString("De waarde is niet gevonden.", 100, 60);
        }


        for (int teller = 0; teller < namen.length; teller ++) {
            g.drawString("" + namen[teller], 100, 20 * teller + 100);
        }
    }


}
