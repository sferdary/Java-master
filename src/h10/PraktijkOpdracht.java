package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PraktijkOpdracht extends Applet {
    private TextField textField;
    private String stringResult;
    private double doubleResult;
    private boolean boolClicked = false;
    private DecimalFormat Fmt;

    public void init() {
        setSize(235, 75);
        setLayout(null);

        Label label = new Label("Insert grade: ");
        label.setBounds(10, 10, 75, 25);
        add(label);

        textField = new TextField("", 4);
        textField.addActionListener(new ButtonOkListener());
        textField.setBounds(95, 10, 40, 20);
        add(textField);

        Button buttonOk = new Button("Calculate");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(150, 10, 75, 20);
        add(buttonOk);

        stringResult = "";
        Fmt = new DecimalFormat("#.#");
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolClicked = true;
            doubleResult = Double.parseDouble(textField.getText());

            if (doubleResult > 0.0) {
                stringResult = "bad.";
            }
            if (doubleResult > 3.999) {
                stringResult = "a failure.";
            }
            if (doubleResult > 4.999) {
                stringResult = "not enough.";
            }
            if (doubleResult > 5.999) {
                stringResult = "mediocre";
            }
            if (doubleResult > 7.999) {
                stringResult = "good";
            }
            if ( doubleResult < 0.0|| doubleResult > 10.0) {
                stringResult = "invalid";
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (boolClicked) {
            g.drawString("An " + Fmt.format(doubleResult) + " is " + stringResult, 10, 50);
        }
    }
}

