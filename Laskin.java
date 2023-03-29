import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.border.Border;
// import javax.swing.event.AncestorEvent;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
import javax.swing.JSplitPane;

public class Laskin implements ActionListener{

    static int count = 0;
    static String laskuToimitusString = "";
    static float laskuToimitusNumber = 0;
    static float currentNumber = 0;
    static float previousNumber[] = {0};
    static float calculation = 0;
    static boolean firstT = true;
    static boolean lastEqual = false;
    // static float prevCalculation = 0;
    static boolean lastPlus = false;
    static float allCalc = 0;
    static boolean equals = false;
    static boolean plus = false;
    static boolean minus = false;
    static boolean multiply = false;
    static boolean exponent = false;
    static boolean divide = false;
    static boolean sqrt = false;

    static JFrame frame;
    static JPanel panel;
    static JPanel panel2;

    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;
    static JButton button6;
    static JButton button7;
    static JButton button8;
    static JButton button9;
    static JButton button0;
    static JButton buttonDivide;
    static JButton buttonClear;
    static JButton buttonBack;
    static JButton buttonEmpty;
    static JButton buttonDot;
    static JButton buttonMultiply;
    static JButton buttonMinus;
    static JButton buttonPlus;
    static JButton buttonSQRT;
    static JButton buttonExponention;
    static JButton buttonEquals;
    static JLabel results;
    public Laskin() {
        frame = new JFrame();
        button1 = new JButton("1");
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.addActionListener(this);

        button4 = new JButton("4");
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.addActionListener(this);

        button7 = new JButton("7");
        button7.addActionListener(this);

        button8 = new JButton("8");
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.addActionListener(this);

        button0 = new JButton("0");
        button0.addActionListener(this);

        
        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        
        buttonBack = new JButton("<=");
        buttonClear.addActionListener(this);

        buttonEmpty = new JButton(" ");
        
        buttonDot = new JButton(".");
        buttonDot.addActionListener(this);

        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);

        buttonMultiply = new JButton("x");
        buttonMultiply.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.addActionListener(this);

        buttonPlus = new JButton("+");
        buttonPlus.addActionListener(this);
        
        buttonSQRT = new JButton("√");
        buttonSQRT.addActionListener(this);

        buttonExponention = new JButton("xˣ");
        buttonExponention.addActionListener(this);

        buttonEquals = new JButton("=");
        buttonEquals.addActionListener(this);

        results = new JLabel("");

        // Panel on top
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0, 1));

        // Panel way down under🦘
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 4));


        panel2.add(results);

        panel.add(buttonExponention);
        panel.add(buttonDivide);
        panel.add(buttonClear);
        panel.add(buttonBack);

        panel.add(button7);
        panel.add(button8);
        panel.add(button9); 
        panel.add(buttonMultiply);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMinus);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonPlus);

        
        panel.add(buttonSQRT);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonEquals);

        frame.add(panel, BorderLayout.PAGE_END);
        frame.add(panel2, BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Laskin");
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Laskin();
    }


    public void plus(float x){
        if(lastEqual == true){
            x = 0;
        }
        count++;

        System.out.println(x + " + "+ previousNumber[0]);

        calculation = x + previousNumber[0];
        results.setText(x + " + " + previousNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = x;
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastPlus = true;
        System.out.println(x + " + "+ previousNumber[0]);
    }
    public void minus(float x){}
    public void multiply(float x){}
    public void exponent(float x){}
    public void divide(float x){}
    public void sqrt(float x){}

    // Function for equal button
    public void equal(){
        lastEqual = true;
        System.out.println(calculation);
        results.setText("Results: " + calculation);
    }

    public void resetAll(){
        equals = false;
        plus = false;
        minus = false;
        multiply = false;
        exponent = false;
        divide = false;
        sqrt = false;
    }
    public void actionPerformed(ActionEvent e) {
        if(count >= 2 && lastPlus == false){
            count = 0;
            resetAll();
        }
        if(e.getSource() == button1){
            laskuToimitusString += "1";  
        } else if(e.getSource() == button2) {
            laskuToimitusString += "2";
        } else if(e.getSource() == button3) {
            laskuToimitusString += "3";
        } else if(e.getSource() == button4) {
            laskuToimitusString += "4";
        } else if(e.getSource() == button5) {
            laskuToimitusString += "5";
        } else if(e.getSource() == button6) {
            laskuToimitusString += "6";
        } else if(e.getSource() == button7) {
            laskuToimitusString += "7";
        } else if(e.getSource() == button8) {
            laskuToimitusString += "8";
        } else if(e.getSource() == button9) {
            laskuToimitusString += "9";
        } else if(e.getSource() == button0) {
            laskuToimitusString += "0";
        } else if(e.getSource() == buttonDot) {
            System.out.println("null");
        } else if(e.getSource() == buttonBack) {
            System.out.println("null");
        } else if(e.getSource() == buttonClear) {
            calculation = 0;
            laskuToimitusNumber = 0;
            results.setText("0");
        }
        laskuToimitusNumber = Integer.parseInt(laskuToimitusString);
        results.setText(laskuToimitusNumber + "");
        if(laskuToimitusString.length() >= 2){
            plus = false;
        }
        if(e.getSource() == buttonPlus || plus == true ){
            plus = true;
            plus(laskuToimitusNumber);
        }else if(e.getSource() == buttonMinus || minus == true){
            minus = true;
            minus(laskuToimitusNumber);
        }else if(e.getSource() == buttonMultiply || multiply == true){
            multiply = true;
            multiply(laskuToimitusNumber);
        }else if(e.getSource() == buttonExponention || exponent == true){
            exponent = true;
            exponent(laskuToimitusNumber);
        }else if(e.getSource() == buttonDivide || divide == true){
            divide = true;
            divide(laskuToimitusNumber);
        }else if(e.getSource() == buttonSQRT || sqrt == true){
            sqrt = true;
            sqrt(laskuToimitusNumber);
        }else if(e.getSource() == buttonEquals){
            equal();
        }
    }
    public void showAnswer(float answer){
        System.out.println(answer);
    }
}