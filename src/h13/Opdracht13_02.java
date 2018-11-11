package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_02 extends Applet {

    public void init() {
        setSize(500, 300);
    }

    private void drawBrickWall(Graphics g) {
        int pattern = 0;
        setBackground(new Color(187, 187, 187));

        Color colorOne = new Color(165, 93, 68);
        Color colorTwo = new Color(124, 81, 72);
        Color colorThree = new Color(191, 117, 82);

        for (int y = 0; y < 300; y += 24) {
            for (int x = 0; x < 525; x += 74) {
                int random = (int) (Math.random() * 3 + 1);
                if (random == 1) g.setColor(colorOne);
                if (random == 2) g.setColor(colorTwo);
                if (random == 3) g.setColor(colorThree);
                if (pattern == 0) g.fillRect(x, y, 70, 20);
                else g.fillRect(x - 35, y, 70, 20);
            }
            if (pattern == 0) pattern = 1;
            else pattern = 0;
        }
    }

    public void paint(Graphics g) {
        drawBrickWall(g);
    }
}
