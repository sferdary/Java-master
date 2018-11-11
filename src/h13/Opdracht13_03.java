package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13_03 extends Applet {
    private Boolean boolBrick = false, boolClicked = false;

    public void init() {
        setSize(500, 300);

        Button buttonBrick = new Button("Brick wall");
        buttonBrick.addActionListener(new ButtonBrickListener());
        add(buttonBrick);

        Button buttonConcrete = new Button("Concrete wall");
        buttonConcrete.addActionListener(new ButtonConcreteListener());
        add(buttonConcrete);
    }

    class ButtonBrickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolBrick = true;
            boolClicked = true;
            repaint();
        }
    }
    private void drawBrick(Graphics g) {
        int pattern = 0;
        setBackground(new Color(150, 150, 150));

        Color ColorB1 = new Color(165, 93, 68);
        Color ColorB2 = new Color(124, 81, 72);
        Color ColorB3 = new Color(191, 117, 82);

        int y = 0;
        while (y < 325) {
            int x = 0;
            while (x < 525) {
                int randomBrick = (int) (Math.random() * 3 + 1);
                if (randomBrick == 1) g.setColor(ColorB1);
                if (randomBrick == 2) g.setColor(ColorB2);
                if (randomBrick == 3) g.setColor(ColorB3);
                if (pattern == 0) g.fillRect(x, y, 70, 20);
                else g.fillRect(x - 35, y, 70, 20);
                x += 74;
            }
            if (pattern == 0) pattern = 1;
            else pattern = 0;
            y += 24;
        }
    }

    class ButtonConcreteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolBrick = false;
            boolClicked = true;
            repaint();
        }
    }

    private void drawConcrete(Graphics g) {
        int pattern = 0;
        setBackground(new Color(0, 0, 0));

        Color ColorC1 = new Color(150, 150, 150);
        Color ColorC2 = new Color(100, 100, 100);
        Color ColorC3 = new Color(120, 120, 120);

        for (int y = 0; y < 325; y += 40) {
            for (int x = 0; x < 525; x += 90) {
                int randomConcrete = (int) (Math.random() * 3 + 1);
                if (randomConcrete == 1) g.setColor(ColorC1);
                if (randomConcrete == 2) g.setColor(ColorC2);
                if (randomConcrete == 3) g.setColor(ColorC3);

                if (pattern == 0) g.fillRect(x, y, 87, 37);

                else g.fillRect(x - 35, y, 87, 37);
            }
            if (pattern == 0) pattern = 1;
            else pattern = 0;
        }
    }

    public void paint(Graphics g) {
        if (boolClicked) {
            if (boolBrick) {
                drawBrick(g);
            } else {
                drawConcrete(g);
            }
        }
    }
}