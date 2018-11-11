package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht10_4 extends Applet {
    private TextField textFieldMonth, textFieldYear;
    private String stringMonth="", stringLeap="";

    public void init() {
        setSize(300, 150);
        setLayout(null);

        Label labelMonth = new Label("Insert month number: ");
        labelMonth.setBounds(10, 10, 100, 25);
        add(labelMonth);
        textFieldMonth = new TextField("", 5);
        textFieldMonth.addActionListener(new ButtonOkListener());
        textFieldMonth.setBounds(150, 10, 100, 25);
        add(textFieldMonth);
        stringMonth = "";

        Label labelYear = new Label("Insert Year: ");
        labelYear.setBounds(10, 50, 100, 25);
        add(labelYear);
        textFieldYear = new TextField("", 5);
        textFieldYear.addActionListener(new ButtonOkListener());
        textFieldYear.setBounds(150, 50, 100, 25);
        add(textFieldYear);

        Button buttonOk = new Button();
        buttonOk.setLabel("Ok");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(10, 75, 100, 25);
        add(buttonOk);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringMonth = textFieldMonth.getText();
            int intMonth = Integer.parseInt(stringMonth);
            if (intMonth == 1) {
                stringMonth = "January";

            } else if (intMonth == 2) {
                stringMonth = "February";

            } else if (intMonth == 3) {
                stringMonth = "March";

            } else if (intMonth == 4) {
                stringMonth = "April";

            } else if (intMonth == 5) {
                stringMonth = "May";

            } else if (intMonth == 6) {
                stringMonth = "June";

            } else if (intMonth == 7) {
                stringMonth = "July";

            } else if (intMonth == 8) {
                stringMonth = "August";

            } else if (intMonth == 9) {
                stringMonth = "September";

            } else if (intMonth == 10) {
                stringMonth = "October";

            } else if (intMonth == 11) {
                stringMonth = "November";

            } else if (intMonth == 12) {
                stringMonth = "December";

            } else {
                stringMonth = "Insert a number between 1 and 12.";
            }
            stringLeap = textFieldYear.getText();
            int intYear = Integer.parseInt(stringLeap);
            if ((intYear % 4 == 0 && !(intYear % 100 == 0)) || intYear % 400 == 0) {
                stringLeap = (intYear + " is a leap year");
            } else {
                stringLeap = (intYear + " is not a leap year");
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Month: " + stringMonth, 15, 125);
        g.drawString(stringLeap, 15, 145);
    }
}
