import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Laskin{

    static int count = 0;
    static JFrame frame;
    static JPanel panel;
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
    // JLabel results;
    public static void gui() {
        frame = new JFrame();
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonDivide = new JButton("/");
        buttonClear = new JButton("C");
        buttonBack = new JButton("<=");
        buttonEmpty = new JButton(" ");
        buttonDot = new JButton(".");
        buttonMultiply = new JButton("x");
        buttonMinus = new JButton("-");
        buttonPlus = new JButton("+");
        buttonSQRT = new JButton("√");
        buttonExponention = new JButton("xˣ");
        buttonEquals = new JButton("=");
        // results = new JLabel("Laskutoimitus");
        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 4));

        panel.add(buttonExponention);
        // buttonExponention.addActionListener(this);
        //math.pow(num1, num2)
        //num1 ^num2
        //tekstikenttä ^paina ja anna numero

        panel.add(buttonDivide);
        // buttonDivide.addActionListener();

        
        //         buttonDivide.addActionListener(new ActionListener());

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

        // panel.add();

        


         

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Laskin");
        frame.setSize(300, 400);
        frame.setVisible(true);
    }

    public void buttonAction(ActionEvent e) {
        System.out.println("test");
    }

    public static void main(String[] args) {
        System.out.println("lol");
    }
    
}