package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    private TextField textField;
    private String stringMonth;

    public void init() {
        setSize(210, 100);
        Label label = new Label("Insert month number: ");
        add(label);

        textField = new TextField("", 5);
        textField.addActionListener(new ButtonOkListener());
        add(textField);

        Button buttonOk = new Button();
        buttonOk.setLabel("Ok");
        buttonOk.addActionListener(new ButtonOkListener());
        add(buttonOk);

        stringMonth = "";
    }

    public void paint(Graphics g) {
        g.drawString("Month:", 15, 75);
        g.drawString(stringMonth, 15, 95);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringMonth = textField.getText();
            int intMonth = Integer.parseInt(stringMonth);
            switch (intMonth) {
                case 1:
                    stringMonth = "January";

                    break;
                case 2:
                    stringMonth = "February";

                    break;
                case 3:
                    stringMonth = "March";

                    break;
                case 4:
                    stringMonth = "April";

                    break;
                case 5:
                    stringMonth = "May";

                    break;
                case 6:
                    stringMonth = "June";

                    break;
                case 7:
                    stringMonth = "July";

                    break;
                case 8:
                    stringMonth = "August";

                    break;
                case 9:
                    stringMonth = "September";

                    break;
                case 10:
                    stringMonth = "October";

                    break;
                case 11:
                    stringMonth = "November";

                    break;
                case 12:
                    stringMonth = "December";

                    break;
                default:
                    stringMonth = "Insert a number between 1 and 12.";

                    break;
            }
            repaint();
        }
    }
}






