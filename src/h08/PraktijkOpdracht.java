package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    Label label;
    TextField textFieldOne, textFieldTwo;
    Button buttonAdd, buttonSubstract, buttonMultiply, buttonDevide, buttonReset;
    String stringAddTotal, stringSubstractTotal, stringMultiplyTotal, stringDevideTotal;
    Double doubleInputOne, doubleInputTwo, doubleAddOne, doubleAddTwo, doubleAddTotal, doubleSubstractOne, doubleSubstractTwo, doubleSubstractTotal, doubleMultiplyOne, doubleMultiplyTwo, doubleMultiplyTotal, doubleDevideOne, doubleDevideTwo, doubleDevideTotal;

    public void init() {
            setSize(150, 150);
            label = new Label("Calculator");
            add(label);

            textFieldOne = new TextField("", 15);
            textFieldOne.addActionListener(new TextFieldOneListener());
            add(textFieldOne);

            textFieldTwo = new TextField("", 15);
            textFieldTwo.addActionListener(new TextFieldTwoListener());
            add(textFieldTwo);

            buttonAdd = new Button("+");
            buttonAdd.addActionListener(new ButtonAddListener());
            stringAddTotal = "";
            add(buttonAdd);

            buttonSubstract = new Button(" - ");
            buttonSubstract.addActionListener(new ButtonSubstractListener());
            stringSubstractTotal = "";
            add(buttonSubstract);

            buttonMultiply = new Button(" * ");
            buttonMultiply.addActionListener(new ButtonMultiplyListener());
            stringMultiplyTotal = "";
            add(buttonMultiply);

            buttonDevide = new Button(" / ");
            buttonDevide.addActionListener(new ButtonDevideListener());
            stringDevideTotal = "";
            add(buttonDevide);

            buttonReset = new Button("C");
            buttonReset.addActionListener(new ButtonResetListener());
            add(buttonReset);
        }

    class TextFieldOneListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleInputOne = Double.parseDouble(textFieldOne.getText());
            repaint();
        }
    }

    class TextFieldTwoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleInputTwo = Double.parseDouble(textFieldTwo.getText());
            repaint();
        }
    }

    class ButtonAddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleAddOne = Double.parseDouble(textFieldOne.getText());
            doubleAddTwo = Double.parseDouble(textFieldTwo.getText());
            doubleAddTotal = doubleAddOne + doubleAddTwo;
            stringAddTotal = String.valueOf(doubleAddTotal);
            textFieldOne.setText(stringAddTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonSubstractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleSubstractOne = Double.parseDouble(textFieldOne.getText());
            doubleSubstractTwo = Double.parseDouble(textFieldTwo.getText());
            doubleSubstractTotal = doubleSubstractOne - doubleSubstractTwo;
            stringSubstractTotal = String.valueOf(doubleSubstractTotal);
            textFieldOne.setText(stringSubstractTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonMultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleMultiplyOne = Double.parseDouble(textFieldOne.getText());
            doubleMultiplyTwo = Double.parseDouble(textFieldTwo.getText());
            doubleMultiplyTotal = doubleMultiplyOne * doubleMultiplyTwo;
            stringMultiplyTotal = String.valueOf(doubleMultiplyTotal);
            textFieldOne.setText(stringMultiplyTotal);
            textFieldTwo.setText("");
            repaint();
        }
    }

    class ButtonDevideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleDevideOne = Double.parseDouble(textFieldOne.getText());
            doubleDevideTwo = Double.parseDouble(textFieldTwo.getText());
            doubleDevideTotal = doubleDevideOne / doubleDevideTwo;
            stringDevideTotal = String.valueOf(doubleDevideTotal);
            textFieldOne.setText(stringDevideTotal);
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