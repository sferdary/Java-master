package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        int x = 50, y = 50, breedte = 50, hoogte = 50;

        for (int rij = 0; rij < 4; rij++) {
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            y += hoogte;
            x = breedte;
        }
    }
}

