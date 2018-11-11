package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht14_01 extends Applet {
    private Label label = new Label("Press the button to hustle the cards"), output = new Label();
    private Button buttonHustle = new Button("Hustle");
    private String[] stringKind = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private Random random = new Random();

    public void init() {
        int width = 400;
        setSize(width, 300);
        setLayout(null);
        setBackground(Color.white);

        label.setBounds(40, 20, 400, 25);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.black);
        add(label);

        buttonHustle.addActionListener(new ButtonHustleListener());
        buttonHustle.setFont(new Font("Arial", Font.BOLD, 15));
        buttonHustle.setBackground(Color.gray);
        buttonHustle.setForeground(Color.white);
        buttonHustle.setBounds(0, 80, width, 50);
        add(buttonHustle);

        output.setBounds(150, 200, 400, 25);
        output.setFont(new Font("Arial", Font.PLAIN, 20));
        output.setForeground(Color.white);
        add(output);
    }

    class ButtonHustleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int randomKind = random.nextInt(stringKind.length);
            int randomSuit = random.nextInt(4);
            switch (randomSuit) {
                case 0:
                    output.setText("Diamonds " + stringKind[randomKind]);
                    output.setForeground(Color.red);
                    break;
                case 1:
                    output.setText("Hearts " + stringKind[randomKind]);
                    output.setForeground(Color.red);
                    break;
                case 2:
                    output.setText("Spades " + stringKind[randomKind]);
                    output.setForeground(Color.black);
                    break;
                case 3:
                    output.setText("Clubs " + stringKind[randomKind]);
                    output.setForeground(Color.black);
                    break;
                default:
                    output.setText("Error");
                    output.setForeground(Color.black);
                    break;
            }
        }
    }
}