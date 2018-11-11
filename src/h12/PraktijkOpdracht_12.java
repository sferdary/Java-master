package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class PraktijkOpdracht_12 extends Applet {
    private TextField[] textFieldName = new TextField[10];
    private TextField[] textFieldNumber = new TextField[10];

    public void init() {
        setSize(820, 360);
        Color bgColor = new Color(230, 230, 230);
        setBackground(bgColor);
        setLayout(null);

        Label labelName = new Label("Name:");
        labelName.setFont(new Font("Arial", Font.BOLD, 12));
        labelName.setBounds(10, 10, 100, 25);
        add(labelName);

        Label labelNumber = new Label("Number:");
        labelNumber.setFont(new Font("Arial", Font.BOLD, 12));
        labelNumber.setBounds(220, 10, 100, 25);
        add(labelNumber);

        Button buttonOk = new Button("Enter");
        buttonOk.setBounds(10, 75 + 25 * textFieldName.length, 200, 25);
        buttonOk.addActionListener(TextFieldListener(-1, -1));
        add(buttonOk);

        for (int i = 0; i < textFieldName.length; i++) {
            textFieldName[i] = new TextField();
            textFieldName[i].setBounds(10, 50 + 25 * i, 200, 25);
            add(textFieldName[i]);

            textFieldNumber[i] = new TextField();
            textFieldNumber[i].setBounds(220, 50 + 25 * i, 200, 25);
            add(textFieldNumber[i]);

            textFieldName[i].addActionListener(TextFieldListener(i, 0));
            textFieldNumber[i].addActionListener(TextFieldListener(i, 1));
        }
    }

    private ActionListener TextFieldListener(int cur, int type) {
        return (e) -> {
            if (cur == -1) {
                for (int i = 0; i < textFieldName.length; i++) {
                    if (textFieldName[i].getText().isEmpty()) {
                        textFieldName[i].requestFocus();
                        System.out.println("1");
                        return;
                    } else if (textFieldNumber[i].getText().isEmpty()) {
                        textFieldNumber[i].requestFocus();
                        System.out.println("2");
                        return;
                    }
                }
                repaint();
                return;
            }
            if (type == 0) {
                textFieldNumber[cur].requestFocus();
            } else if (type == 1) {
                textFieldName[(cur + 1) % textFieldName.length].requestFocus();
            }
        };
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(450, 50, 350, 225);
        g.setColor(Color.black);
        g.drawRect(450, 50, 350, 225);
        g.drawLine(625, 50, 625, 275);

        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("Name:", 475, 75);
        g.drawString("Number:", 650, 75);

        g.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 0; i < textFieldName.length; i++) {
            if (!textFieldName[i].getText().isEmpty())
                g.drawString("" + textFieldName[i].getText(), 475, 110 + (g.getFontMetrics().getHeight() * i));
            g.drawString("" + textFieldNumber[i].getText(), 650, 110 + g.getFontMetrics().getHeight() * i);
        }
    }
}

