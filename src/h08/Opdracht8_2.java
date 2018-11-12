package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    private int intCountMaleVisitor, intCounterPotentialMaleStudent, intCounterFemaleVisitor, intCounterPotentialFemaleStudent, intMaleVisitor, intPotentialMaleStudent, intFemaleVisitor, intPotentialFemaleStudent, intTotal;

    public void init() {
        setSize(450, 180);
        setLayout(null);

        Label label = new Label("Count visitors and potential students:");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(10, 10, 400, 25);
        add(label);

        Button buttonMaleVisitor = new Button("Male visitors");
        buttonMaleVisitor.setBounds(10, 50, 150, 30);
        buttonMaleVisitor.addActionListener(new buttonMaleVisitorListener());
        add(buttonMaleVisitor);
        intMaleVisitor = 0;
        intCountMaleVisitor = 1;

        Button buttonPotentialMaleStudent = new Button("Potential male students");
        buttonPotentialMaleStudent.setBounds(10, 80, 150, 30);
        buttonPotentialMaleStudent.addActionListener(new ButtonPotentialMaleStudentListener());
        add(buttonPotentialMaleStudent);
        intPotentialMaleStudent = 0;
        intCounterPotentialMaleStudent = 1;

        Button buttonFemaleVisitor = new Button("Female visitors");
        buttonFemaleVisitor.setBounds(250, 50, 150, 30);
        buttonFemaleVisitor.addActionListener(new ButtonFemaleVisitorListener());
        add(buttonFemaleVisitor);
        intFemaleVisitor = 0;
        intCounterFemaleVisitor = 1;

        Button buttonPotentialFemaleStudent = new Button("Potential female students");
        buttonPotentialFemaleStudent.setBounds(250, 80, 150, 30);
        buttonPotentialFemaleStudent.addActionListener(new ButtonPotentialFemaleStudentListener());
        add(buttonPotentialFemaleStudent);
        intPotentialFemaleStudent = 0;
        intCounterPotentialFemaleStudent = 1;

        Button buttonReset = new Button("Reset");
        buttonReset.setBounds(350, 150, 50, 25);
        buttonReset.addActionListener(new ButtonResetListener());
        add(buttonReset);
    }

    class buttonMaleVisitorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intMaleVisitor = intCountMaleVisitor++;
            repaint();
        }
    }

    class ButtonPotentialMaleStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intPotentialMaleStudent = intCounterPotentialMaleStudent++;
            intMaleVisitor = intCountMaleVisitor++;
            repaint();
        }
    }

    class ButtonFemaleVisitorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intFemaleVisitor = intCounterFemaleVisitor++;
            repaint();
        }
    }

    class ButtonPotentialFemaleStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intPotentialFemaleStudent = intCounterPotentialFemaleStudent++;
            intFemaleVisitor = intCounterFemaleVisitor++;
            repaint();
        }
    }

    class ButtonResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            intTotal = 0;
            intMaleVisitor = 0;
            intCountMaleVisitor = 1;
            intPotentialMaleStudent = 0;
            intCounterPotentialMaleStudent = 1;

            intFemaleVisitor = 0;
            intCounterFemaleVisitor = 1;
            intPotentialFemaleStudent = 0;
            intCounterPotentialFemaleStudent = 1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        intTotal = intMaleVisitor + intFemaleVisitor;

        g.drawString("" + intMaleVisitor, 170, 70);
        g.drawString("" + intPotentialMaleStudent, 170, 100);

        g.drawString("" + intFemaleVisitor, 410, 70);
        g.drawString("" + intPotentialFemaleStudent, 410, 100);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Total: " + intTotal, 10, 170);
    }
}