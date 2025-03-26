import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {

    private JFrame fr;
    private JPanel pa;
    private JTextField tf;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bnP, bnM, bnU, bnD, bnC, bnR;

    public CalculatorTwoGUI() {
    
        fr = new JFrame("My Calculator");
        fr.setLayout(new BorderLayout());

        tf = new JTextField(15);
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
        pa.add(bn7); pa.add(bn8); pa.add(bn9); pa.add(bnP);
        pa.add(bn4); pa.add(bn5); pa.add(bn6); pa.add(bnM);
        pa.add(bn1); pa.add(bn2); pa.add(bn3); pa.add(bnU);
        pa.add(bn0); pa.add(bnC); pa.add(bnR); pa.add(bnD);
        fr.add(pa, BorderLayout.CENTER);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }

}
