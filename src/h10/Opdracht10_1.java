package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_1 extends Applet {
    private TextField textField;
    private int intHighestNumber;

    public void init() {
        setSize(350, 100);

        Label label = new Label("Voer getal in en druk op enter");
        add(label);

        textField = new TextField("", 5);
        textField.addActionListener(new TekstVakListener());
        add(textField);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String stringNumber = textField.getText();
            int intOne = Integer.parseInt(stringNumber);
            int intTwo = intHighestNumber;
            if (intOne >= intTwo) {
                intHighestNumber = intOne;
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Highest number: " + intHighestNumber, 60, 50);
    }
}