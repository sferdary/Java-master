package h14;

import java.applet.Applet;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class SoundCheck extends Applet {
    private Button button = new Button("test");
    private Boolean bool = false;
    private URL path;
    private AudioClip soundApplause;

    public void init() {
        path = PraktijkOpdracht_14.class.getResource("/h14/Audio/");
        soundApplause = getAudioClip(path, "applause.wav");
        button.addActionListener(new ButtonActionListener());
        add(button);
    }

    class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bool = true;
            soundApplause.play();
            System.out.println(path);
            System.out.println(soundApplause);
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (bool)
        g.drawString("Button is clicked: " + true, 10, 10);
    }
}