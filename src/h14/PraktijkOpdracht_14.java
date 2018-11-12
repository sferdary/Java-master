package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class PraktijkOpdracht_14 extends Applet {
    private Image imgToken, imgWinner, imgLoser;
    private AudioClip soundApplause, soundBoo;
    private boolean boolUserTurn = true;
    private int input, intTokens, intX;
    private int[] arrayNumbers = {1, 5, 9, 13, 17, 21};
    private TextField textField;
    private String stringNumberOfTokens, stringPlayerTurn, stringWordTokens;

    public void init() {
        setSize(325, 450);
        setLayout(null);

        URL urlImages = PraktijkOpdracht_14.class.getResource("/h14/Images/");
        imgToken = getImage(urlImages, "imgToken.png");
        imgWinner = getImage(urlImages, "imgWinner.png");
        imgLoser = getImage(urlImages, "imgLoser.png");

        URL urlAudio = PraktijkOpdracht_14.class.getResource("/h14/Audio/");
        soundApplause = getAudioClip(urlAudio, "applause.wav");
        soundBoo = getAudioClip(urlAudio, "boo.wav");

        Label label = new Label("Enter 1, 2 or 3 to play the game:");
        label.setBounds(80, 10, 200, 25);
        add(label);

        NumberListener n = new NumberListener();

        textField = new TextField("", 8);
        textField.setBounds(112, 50, 100, 25);
        textField.addActionListener(n);
        add(textField);

        Button buttonReset = new Button("Reset");
        buttonReset.setBounds(112, 380, 100, 25);
        buttonReset.addActionListener(new ButtonResetActionListener());
        add(buttonReset);

        intTokens = 23;

        stringNumberOfTokens = "";
        stringPlayerTurn = "There are ";
        stringWordTokens = " tokens ";

    }

    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!boolUserTurn) {
                return;
            }
            input = Integer.parseInt(textField.getText());
            if (input < 24 && input > 0) {
                intTokens = intTokens - input;
                repaint();
            }

            boolUserTurn = false;
            new java.util.Timer().schedule(new java.util.TimerTask() {
                public void run() {
                    for (int i : arrayNumbers)
                        if (intTokens - 1 == i) {
                            input = 1;
                        } else if (intTokens - 2 == i) {
                            input = 2;
                        } else if (intTokens - 3 == i) {
                            input = 3;
                        } else if (intTokens == 1) {
                            return;
                        }
                    Random random = new Random();
                    if (input == 0) {
                        if (intTokens >= 4) {
                            input = random.nextInt(3) + 1;
                        }
                    }
                    repaint();
                    intTokens -= input;
                    boolUserTurn = true;
                }
            }, 1000);
        }
    }

    private void tokens(Graphics g) {
        int x = 0, y = 50;
        for (int i = 0; i < intTokens; i++) {
            if (i % 5 == 0) {
                x = 50;
                y += 50;
            }
            g.drawImage(imgToken, x, y, 25, 25, this);
            x += 50;
        }
    }

    public void paint(Graphics g) {
        if (intTokens == 1 && !boolUserTurn) {
            soundApplause.play();
            g.drawImage(imgWinner, 10, 125, 300, 200, this);
        } else if (intTokens == 1) {
            soundBoo.play();
            g.drawImage(imgLoser, 110, 175, 100, 100, this);
        }

        stringNumberOfTokens = Integer.toString(intTokens);
        if (intTokens <= 0) {
            stringNumberOfTokens = "1";
        } else if (intTokens == 1) {
            stringWordTokens = " token ";
        } else if (boolUserTurn) {
            stringPlayerTurn = "The robot left ";
            intX = 100;
        } else {
            stringPlayerTurn = "You left ";
            intX = 115;
        }
        g.drawString(stringPlayerTurn + stringNumberOfTokens + stringWordTokens, intX, 360);
        g.drawString("Rules:", 30, 420);
        g.drawString("You win when the robot has one token left.", 30, 440);
        tokens(g);
    }

    class ButtonResetActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intX = 90;
            intTokens = 23;
            stringWordTokens = " tokens ";
            boolUserTurn = true;
            repaint();
        }
    }
}