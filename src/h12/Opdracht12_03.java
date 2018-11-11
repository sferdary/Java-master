package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_03 extends Applet {
    private TextField[] textField;
    private double[] numbers;

    public void init() {
        textField = new TextField[5];
        numbers = new double[5];

        for (int i = 0; i < textField.length; i++) {
            TextField textFieldCopy = new TextField("" + i);
            textField[i] = textFieldCopy;
        }

        for (TextField aTextField : textField) {
            add(aTextField);
        }

        Button buttonOk = new Button("Ok");
        buttonOk.addActionListener(new ButtonOkListener());
        add(buttonOk);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < textField.length; i++) {
                numbers[i] = Double.parseDouble(textField[i].getText());
            }
            Arrays.sort(numbers);
            for (int i = 0; i < textField.length; i++) {
                textField[i].setText("" + numbers[i]);
            }
        }
    }
}