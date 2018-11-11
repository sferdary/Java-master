package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht8_3 extends Applet {
    Label label;
    TextField textField;
    Button buttonCalculate, buttonReset;
    double doubleInput, doubleVAT ;
    DecimalFormat Fmt = new DecimalFormat("#.##");

    public void init() {
        setSize(200,150);
        
        label = new Label("Price excl. 21% VAT");
        add(label);
        
        textField = new TextField("", 20);
        textField.addActionListener(new TextFieldListener() );
        add(textField);
        
        buttonCalculate = new Button("Calculate" );
        buttonCalculate.addActionListener( new ButtonCalculateListener() );
        add(buttonCalculate);
        
        buttonReset = new Button("Reset" );
        buttonReset.addActionListener( new ButtonResetListener() );
        add(buttonReset);
        
        doubleVAT = 1.21;

    }
    class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleInput = Double.parseDouble(textField.getText());
            repaint();
        }
    }

    class ButtonCalculateListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            doubleInput = Double.parseDouble(textField.getText());
            repaint();
        }
    }

    class ButtonResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            textField.setText("");
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawLine(15,100,185,100);
        g.drawString("VAT high: ", 20, 115);
        g.drawString("€ " + Fmt.format(((doubleInput  * doubleVAT) - doubleInput)), 125, 115);
        g.drawString("Price incl. VAT:", 20, 135);
        g.drawString("€ " + Fmt.format((doubleInput  * doubleVAT)) + "" ,125, 135);
    }
}