package h11;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11_01 extends Applet {
    int intTextField;
    boolean booleanClicked;
    TextField textField = new TextField("");
    Button buttonOk = new Button("Ok");

    public void init() {
        setSize(300, 400);
        setLayout(null);

        textField.setBounds(125, 10, 50, 25);
        textField.addActionListener(new ButtonOkListener());
        add(textField);

        buttonOk.setBounds(200, 10, 75, 25);
        buttonOk.addActionListener(new ButtonOkListener());
        add(buttonOk);
    }

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            booleanClicked = true;
            intTextField = Integer.parseInt(textField.getText());

            repaint();
        }
    }

    public void paint(Graphics g) {
        if (booleanClicked) {
            int intY = 40;

            g.drawString("Tafel van " + intTextField + ":", 10, 25);
            for (int i = 1; i <= 10; i++) {
                intY += 20;
                g.drawString("" + i + " x " + intTextField + " = " + (i * intTextField), 10, intY);
            }
        }
    }
}