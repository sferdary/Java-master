package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PraktijkOpdracht extends Applet {
    Label labelHeader;
    TextField textFieldNumber;
    Button buttonOk;
    String stringResult;
    double doubleResult;
    boolean clicked;
    DecimalFormat Fmt;


    public void init() {
        setSize(235, 75);
        setLayout(null);

        labelHeader = new Label("Voer cijfer in: ");
        labelHeader.setBounds(10, 10, 75, 25);
        add(labelHeader);

        textFieldNumber = new TextField("", 4);
        textFieldNumber.addActionListener(new ButtonOkListener());
        textFieldNumber.setBounds(95, 10, 40, 20);
        add(textFieldNumber);

        buttonOk = new Button("Bereken");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(150, 10, 75, 20);
        add(buttonOk);

        stringResult = "";
        Fmt = new DecimalFormat("#.#");
    }


    public void paint(Graphics g) {
        if (clicked) {
            g.drawString("Cijfer " + Fmt.format(doubleResult) + " is " + stringResult, 10, 50);
        }
    }


    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clicked = true;
            doubleResult = Double.parseDouble(textFieldNumber.getText());

            if (doubleResult > 0.0) {
                stringResult = "slecht.";
            }
            if (doubleResult > 3.999) {
                stringResult = "onvoldoende.";
            }
            if (doubleResult > 4.999) {
                stringResult = "matig.";
            }
            if (doubleResult > 5.999) {
                stringResult = "voldoende";
            }
            if (doubleResult > 7.999) {
                stringResult = "goed";
            }
            if (doubleResult > 10.0) {
                stringResult = "ongeldig";
            }
            if (doubleResult < 0.0) {
                stringResult = "ongeldig";
            }
            repaint();
        }
    }

}

