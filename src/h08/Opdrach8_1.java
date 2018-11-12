package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdrach8_1 extends Applet {
    private TextField textField;
    private String stringInput;

    public void init() {
        setSize(400, 300);
        setLayout(null);

        Label label = new Label("Insert text and press 'enter'");
        label.setBounds(10, 10, 200, 25);
        add(label);

        textField = new TextField("", 50);
        textField.setBounds(10, 40, 200, 25);
        textField.addActionListener(new TextFieldListener());
        add(textField);

        Button buttonOk = new Button("Insert");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(250, 40, 50, 25);
        add(buttonOk);
        stringInput = "The answer wil be displayed here";

        Button buttonReset = new Button("Reset");
        buttonReset.setBounds(325, 40, 50, 25);
        buttonReset.addActionListener(new ButtonCancelListener());
        add(buttonReset);
    }

    class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringInput = textField.getText();
            repaint();
        }
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringInput = textField.getText();
            repaint();
        }
    }

    class ButtonCancelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            stringInput = "";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawLine(10, 80, 390, 80);
        g.drawString(stringInput, 10, 115);
    }
}