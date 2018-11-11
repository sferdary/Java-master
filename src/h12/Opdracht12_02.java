package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_02 extends Applet {
    private String buttonText;

    public void init() {
        setSize(900,300);
        Button[] buttonMain = new Button[25];
        for (int i = 0; i < buttonMain.length; i++) {
            Button buttonCopy = new Button("Button " + i);
            buttonMain[i] = buttonCopy;
            buttonCopy.addActionListener(new ButtonCopyListener());
        }

        for (Button aButtonMain : buttonMain) {
            add(aButtonMain);
        }
    }

    class ButtonCopyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button buttonCopy = (Button) e.getSource();
            buttonText = buttonCopy.getLabel();
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (buttonText != null) {
            g.drawString("You have pressed: " + buttonText, 375, 100);
        }

    }
}
