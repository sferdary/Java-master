package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11_01 extends Applet {
    private int intTextField;
    private boolean boolClicked;
    private TextField textField = new TextField("");
    private Button buttonOk = new Button("Ok");

    public void init() {
        setSize(300, 400);
        setLayout(null);

        textField.setBounds(125, 10, 50, 25);
        textField.addActionListener(new ButtonOkListener());
        add(textField);

        buttonOk.setBounds(200, 10, 75, 25);
        buttonOk.addActionListener(new ButtonOkListener());
        add(buttonOk);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolClicked = true;
            intTextField = Integer.parseInt(textField.getText());

            repaint();
        }
    }

    public void paint(Graphics g) {
        if (boolClicked) {
            int intY = 40;

            g.drawString("Table of " + intTextField + ":", 10, 25);
            for (int i = 1; i <= 10; i++) {
                intY += 20;
                g.drawString("" + i + " x " + intTextField + " = " + (i * intTextField), 10, intY);
            }
        }
    }
}