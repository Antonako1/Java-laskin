import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.lang.model.util.SimpleAnnotationValueVisitor14;
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
// import javax.swing.JSplitPane;

public class Laskin implements ActionListener{

    static int count = 0;
    static String laskuToimitusString = "";
    static double laskuToimitusNumber = 0;
    static double previousNumber[] = {0};
    static double currentNumber[] = {0};
    static double calculation = 0;
    static boolean firstT = true;
    static boolean lastEqual = false;
    // static double prevCalculation = 0;
    static double allCalc = 0;
    static boolean equals = false;

    static boolean lastPlus = false;
    static boolean lastMinus = false;
    static boolean lastMultiply = false;
    static boolean lastExponent = false;
    static boolean lastDivide = false;
    static boolean lastSqrt = false;
    static boolean prevClear = false;

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
        buttonBack.addActionListener(this);

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

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0, 1));

        // 🦘
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

    public void plus(double x){
        if(lastEqual == true){
            x = 0;
        }
        currentNumber[0] = x;
        calculation = currentNumber[0] + previousNumber[0];
        results.setText(currentNumber[0] + " + " + previousNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastPlus = true;
    }
    public void minus(double x){
        if(lastEqual == true){
            x = 0;
        }
        currentNumber[0] = x;
        calculation = previousNumber[0] - currentNumber[0];
        results.setText(currentNumber[0] + " - " + previousNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastMinus = true;
    }
    public void multiply(double x){
        if(lastEqual == true){
            x = 1;
        }
        currentNumber[0] = x;
        calculation = currentNumber[0] * previousNumber[0];
        results.setText(currentNumber[0] + " * " + previousNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastMultiply = true;
    }
    public void exponent(double x){
        if(lastEqual == true){
            x = 1;
        }
        currentNumber[0] = x;
        calculation = Math.pow(previousNumber[0], currentNumber[0]);
        results.setText(currentNumber[0] + " ^ " + previousNumber[0]);

        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastExponent = true;
    }
    public void divide(double x){
        if(lastEqual == true){
            x = 1;
        }
        currentNumber[0] = x;
        calculation = previousNumber[0] / currentNumber[0];
        results.setText(currentNumber[0] + " / " + previousNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastDivide = true;
    }
    public void sqrt(double x){
        if(lastEqual == true){
            x = 1;
        }
        currentNumber[0] = x;
        calculation = Math.sqrt(currentNumber[0]);
        results.setText("√" + currentNumber[0]);
        laskuToimitusString = "0";
        if (firstT == true) {
            previousNumber[0] = currentNumber[0];
        } else {
            previousNumber[0] = calculation;
        }
        firstT = false;
        lastEqual = false;
        lastSqrt = true;
    }
    public void equal(){
        if(lastPlus == true){
            plus(laskuToimitusNumber);
            lastPlus = false;
        } else if(lastMinus == true) {
            minus(laskuToimitusNumber);
            lastMinus = false;
        }  else if(lastMultiply == true) {
            multiply(laskuToimitusNumber);
            lastMultiply = false;
        }  else if(lastExponent == true) {
            exponent(laskuToimitusNumber);
            lastExponent = false;
        }  else if(lastDivide == true) {
            divide(laskuToimitusNumber);
            lastDivide = false;
        }  else if(lastSqrt == true) {
            sqrt(laskuToimitusNumber);
            lastSqrt = false;
        } 
        lastEqual = true;
        System.out.println(calculation);
        results.setText("Results: " + calculation);
    }
    public void actionPerformed(ActionEvent e) {
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
            // laskuToimitusString += ".";
        } else if(e.getSource() == buttonBack) {
            if(laskuToimitusString.length() <= 1){
                results.setText(calculation + "\n Error");
            }
            laskuToimitusString = laskuToimitusString.substring(0,laskuToimitusString.length()-1);
        } else if(e.getSource() == buttonClear) {
            previousNumber[0] = 0;
            currentNumber[0] = 0;
            calculation = 0;
            laskuToimitusNumber = 0;
            results.setText("0");
        }else{
            System.out.println("ok");
        }
        laskuToimitusNumber = Integer.parseInt(laskuToimitusString);
        results.setText(laskuToimitusNumber + "");
        if(e.getSource() == buttonPlus ){
            plus(laskuToimitusNumber);
        }else if(e.getSource() == buttonMinus){
            minus(laskuToimitusNumber);
        }else if(e.getSource() == buttonMultiply){
            multiply(laskuToimitusNumber);
        }else if(e.getSource() == buttonExponention){
            exponent(laskuToimitusNumber);
        }else if(e.getSource() == buttonDivide){
            divide(laskuToimitusNumber);
        }else if(e.getSource() == buttonSQRT){
            sqrt(laskuToimitusNumber);
        }else if(e.getSource() == buttonEquals){
            equal();
        }
    }
}