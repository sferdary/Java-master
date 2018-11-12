package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    private TextField textFieldOne, textFieldTwo;
    private String stringAddTotal, stringSubstractTotal, stringMultiplyTotal, stringDivideTotal;

    public void init() {
        setSize(150, 150);
        Label label = new Label("Calculator");
        add(label);

        textFieldOne = new TextField("", 15);
        add(textFieldOne);

        textFieldTwo = new TextField("", 15);
        add(textFieldTwo);

        Button buttonAdd = new Button("+");
        buttonAdd.addActionListener(new ButtonAddListener());
        stringAddTotal = "";
        add(buttonAdd);

        Button buttonSubstract = new Button(" - ");
        buttonSubstract.addActionListener(new ButtonSubstractListener());
        stringSubstractTotal = "";
        add(buttonSubstract);

        Button buttonMultiply = new Button(" * ");
        buttonMultiply.addActionListener(new ButtonMultiplyListener());
        stringMultiplyTotal = "";
        add(buttonMultiply);

        Button buttonDivide = new Button(" / ");
        buttonDivide.addActionListener(new ButtonDivideListener());
        stringDivideTotal = "";
        add(buttonDivide);

        Button buttonReset = new Button("C");
        buttonReset.addActionListener(new ButtonResetListener());
        add(buttonReset);
    }

    class ButtonAddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double doubleAddOne = Double.parseDouble(textFieldOne.getText());
            Double doubleAddTwo = Double.parseDouble(textFieldTwo.getText());
            Double doubleAddTotal = doubleAddOne + doubleAddTwo;
            stringAddTotal = String.valueOf(doubleAddTotal);
            textFieldOne.setText(stringAddTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonSubstractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double doubleSubstractOne = Double.parseDouble(textFieldOne.getText());
            Double doubleSubstractTwo = Double.parseDouble(textFieldTwo.getText());
            Double doubleSubstractTotal = doubleSubstractOne - doubleSubstractTwo;
            stringSubstractTotal = String.valueOf(doubleSubstractTotal);
            textFieldOne.setText(stringSubstractTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonMultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double doubleMultiplyOne = Double.parseDouble(textFieldOne.getText());
            Double doubleMultiplyTwo = Double.parseDouble(textFieldTwo.getText());
            Double doubleMultiplyTotal = doubleMultiplyOne * doubleMultiplyTwo;
            stringMultiplyTotal = String.valueOf(doubleMultiplyTotal);
            textFieldOne.setText(stringMultiplyTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonDivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double doubleDivideOne = Double.parseDouble(textFieldOne.getText());
            Double doubleDivideTwo = Double.parseDouble(textFieldTwo.getText());
            Double doubleDivideTotal = doubleDivideOne / doubleDivideTwo;
            stringDivideTotal = String.valueOf(doubleDivideTotal);
            textFieldOne.setText(stringDivideTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textFieldOne.setText("");
            textFieldTwo.setText("");
            repaint();
        }
    }
}