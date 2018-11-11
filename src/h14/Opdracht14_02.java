package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Opdracht14_02 extends Applet {
    private Label label = new Label("Press the button to hustle the cards");
    private String[] numbers = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private String[] symbols = {"Diamonds", "Hearts", "Clubs", "Spades"};
    private String[] deck;
    private String[] playerOne = new String[13], playerTwo = new String[13], playerThree = new String[13], playerFour = new String[13];

    private AudioClip sound;

    public void init() {
        int width = 500;
        setSize(width, 475);
        setLayout(null);
        setBackground(Color.MAGENTA);
        setForeground(Color.white);

        URL urlSound = Opdracht14_02.class.getResource("/H14/Audio/");
        sound = getAudioClip(urlSound, "cardSound.wav");

        label.setBounds(10, 10, width, 25);
        label.setFont(new Font("Arial", Font.BOLD, 25));
        add(label);

        Button buttonHustle = new Button("Hustle");
        buttonHustle.setBounds(10, 50, (width - 20), 50);
        buttonHustle.setBackground(Color.black);
        buttonHustle.setForeground(Color.white);
        buttonHustle.setFont(new Font("Arial", Font.BOLD, 15));
        buttonHustle.addActionListener(new ButtonActionListener());
        add(buttonHustle);
        hustler();
    }

    private void hustler() {
        deck = new String[52];
        int deckIndex = 0;

        for (String symbol : symbols) {
            for (String number : numbers) {
                String s = symbol + " " + number;
                deck[deckIndex] = s;
                deckIndex++;
            }
        }
    }

    private String shareCard() {
        int random = new Random().nextInt(deck.length);
        String card = deck[random];
        String[] temp = new String[deck.length - 1];
        int tempIndex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                temp[tempIndex] = deck[i];
                tempIndex++;
            }
        }
        deck = temp;
        return card;
    }

    class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hustler();

            for (int i = 0; i < 13; i++) {
                playerOne[i] = shareCard();
                playerTwo[i] = shareCard();
                playerThree[i] = shareCard();
                playerFour[i] = shareCard();
            }
            sound.play();
            try {
                Thread.sleep(700);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        int x = 25, y = 150;

        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("Player 1 ", (x), y);
        g.drawString("Player 2 ", (x + 125), y);
        g.drawString("Player 3 ", (x + 250), y);
        g.drawString("Player 4 ", (x + 375), y);

        g.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 0; i < 13; i++) {
            y += 20;
            g.drawString(playerOne[i], (x), (y + 10));
            g.drawString(playerTwo[i], (x + 125), (y + 10));
            g.drawString(playerThree[i], (x + 250), (y + 10));
            g.drawString(playerFour[i], (x + 375), (y + 10));
        }
    }
}