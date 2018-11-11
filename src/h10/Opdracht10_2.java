package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_2 extends Applet {
    private TextField textField;
    private Boolean boolClicked = false;
    private int intHighestNumber = Integer.MIN_VALUE;
    private int intLowestNumber = Integer.MAX_VALUE;

    public void init() {
        setSize(350, 150);
        Label label = new Label("Insert a number and press enter");
        add(label);
        textField = new TextField("", 5);
        textField.addActionListener(new TekstVakListener());
        add(textField);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolClicked = true;
            String stringNumber = textField.getText();
            int intInput = Integer.parseInt(stringNumber);
            if (intInput > intHighestNumber) {
                intHighestNumber = intInput;
            }
            if (intInput < intLowestNumber) {
                intLowestNumber = intInput;
            }

            repaint();
        }
    }

    public void paint(Graphics g) {
        if (boolClicked) {
            g.drawString("Hoogste getal: " + intHighestNumber, 10, 50);
            g.drawString("Laagste getal: " + intLowestNumber, 10, 75);
        }
    }
}