import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private JPanel pa;
    private JTextField tf;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bnP, bnM, bnU, bnD, bnC, bnR;
    private double answers = 0;
    private String operate = "";

    public CalculatorSample() {
    
        fr = new JFrame("My Calculator");
        fr.setLayout(new BorderLayout());

        tf = new JTextField();
        fr.add(tf, BorderLayout.NORTH);

        pa = new JPanel();
        pa.setLayout(new GridLayout(4, 4));
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bnP = new JButton("+");
        bnM = new JButton("-");
        bnU = new JButton("x");
        bnD = new JButton("/");
        bnC = new JButton("c");
        bnR = new JButton("=");
        bn0.addActionListener(this);
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bnP.addActionListener(this);
        bnM.addActionListener(this);
        bnU.addActionListener(this);
        bnD.addActionListener(this);
        bnC.addActionListener(this);
        bnR.addActionListener(this);
        pa.add(bn7); pa.add(bn8); pa.add(bn9); pa.add(bnP);
        pa.add(bn4); pa.add(bn5); pa.add(bn6); pa.add(bnM);
        pa.add(bn1); pa.add(bn2); pa.add(bn3); pa.add(bnU);
        pa.add(bn0); pa.add(bnC); pa.add(bnR); pa.add(bnD);
        fr.add(pa, BorderLayout.CENTER);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent ev) {

        String action = ev.getActionCommand();
        if (action.equals("0") || action.equals("1") || action.equals("2") || action.equals("3") || action.equals("4") || action.equals("5") || action.equals("6") || action.equals("7") || action.equals("8") || action.equals("9")) {
            tf.setText(tf.getText() + action);
        }
        else if (action.equals("+") || action.equals("-") || action.equals("x") || action.equals("/")) {
            if (operate.isEmpty()) {
                answers = Double.parseDouble(tf.getText());
            }
            else {
                double operand = Double.parseDouble(tf.getText());
                if (operate.equals("+")) {
                    answers += operand;
                }
                else if (operate.equals("-")) {
                    answers -= operand;
                }
                else if (operate.equals("x")) {
                    answers *= operand;
                }
                else if (operate.equals("/")) {
                    answers /= operand;
                }
            }
            tf.setText("");
            operate = action;
        }
        else if (action.equals("c")) {
            tf.setText("");
            answers = 0;
            operate = "";
        }
        else if (action.equals("=")) {
            if (operate.isEmpty()) {
                answers = Double.parseDouble(tf.getText());
            }
            else {
                double operand = Double.parseDouble(tf.getText());
                if (operate.equals("+")) {
                    answers += operand;
                }
                else if (operate.equals("-")) {
                    answers -= operand;
                }
                else if (operate.equals("x")) {
                    answers *= operand;
                }
                else if (operate.equals("/")) {
                    answers /= operand;
                }
            }
            tf.setText(String.valueOf(answers));
            operate = "";
        }

    }

    public static void main(String[] args) {
        new CalculatorSample();
    }

}
