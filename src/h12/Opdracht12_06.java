package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_06 extends Applet {
    private   TextField textField;
    private  String stringValue = "";
    private  long[] numbers = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10};

    public void init() {
        setSize(250, 250);
        setLayout(null);

        textField = new TextField("", 8);
        textField.setBounds(10, 10, 100, 25);
        textField.addActionListener(new TextFieldListener());
        add(textField);
    }

    class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int intTextField = Integer.parseInt(textField.getText());
            int counter = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == intTextField) {
                    counter++;
                }
                System.out.println(i);
            }
            System.out.println("The number apears " + counter + " times");
            stringValue = "The number apears " + counter + " times";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(stringValue,10,50);
    }
}