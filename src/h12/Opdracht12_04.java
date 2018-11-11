package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_04 extends Applet {
    private TextField textField;
    private boolean found = false;
    private int index = 0;
    private int[] numbers = {100, 200, 300, 400};

    public void init() {
        setSize(200, 175);
        setLayout(null);

        ButtonOkListener n = new ButtonOkListener();

        textField = new TextField("", 8);
        textField.setBounds(10, 10, 100, 25);
        textField.addActionListener(n);
        add(textField);

        Button buttonOk = new Button("Ok");
        buttonOk.setBounds(125, 10, 50, 25);
        buttonOk.addActionListener(n);
        add(buttonOk);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int search = Integer.parseInt(textField.getText());
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == search) {
                    found = true;
                    index = i;
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (found) {
            g.drawString("The value is " + index, 10, 160);
            found = true;
        } else {
            g.drawString("The value is not found.", 10, 160);
        }

        g.drawString("Index:", 10, 50);
        g.drawString("0", 15, 70);
        g.drawString("" + numbers[0], 60, 70);
        g.drawString("1", 15, 90);
        g.drawString("" + numbers[1], 60, 90);
        g.drawString("2", 15, 110);
        g.drawString("" + numbers[2], 60, 110);
        g.drawString("3", 15, 130);
        g.drawString("" + numbers[3], 60, 130);

        //Vertical lines
        g.drawLine(10, 55, 10, 135);
        g.drawLine(50, 55, 50, 135);
        g.drawLine(90, 55, 90, 135);

        //Horizontal lines
        g.drawLine(10, 55, 90, 55);
        g.drawLine(10, 75, 90, 75);
        g.drawLine(10, 95, 90, 95);
        g.drawLine(10, 115, 90, 115);
        g.drawLine(10, 135, 90, 135);
    }
}
