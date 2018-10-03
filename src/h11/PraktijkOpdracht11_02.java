package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11_02 extends Applet {
    int intMultiplication;
    boolean booleanClicked;
    Button buttonNext;

    public void init() {
        setSize(200, 250);
        setLayout(null);

        buttonNext = new Button("Volgende");
        buttonNext.setBounds(100, 10, 75 , 25);
        buttonNext.addActionListener(new ButtonNextListener());
        add(buttonNext);
    }

    class ButtonNextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            booleanClicked = true;
            intMultiplication++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        int intY = 40;
        g.drawString("Tafel van ", 10, 25);
        if (booleanClicked) {
            g.drawString(intMultiplication + ":", 65, 25);
            for (int i = 1; i <= 10; i++) {
                intY += 20;
                g.drawString("" + i + " x " + intMultiplication + " = " + (i * intMultiplication), 10, intY);
            }
        }
    }
}
