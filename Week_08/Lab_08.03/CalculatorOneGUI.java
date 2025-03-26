import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {

    private JFrame fr;
    private JPanel pa;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2, bn3, bn4;

    public CalculatorOneGUI() {
    
        fr = new JFrame("เครื่องคิดเลข");
        fr.setLayout(new GridLayout(4, 1));

        tf1 = new JTextField();
        tf2 = new JTextField();
        fr.add(tf1);
        fr.add(tf2);

        pa = new JPanel();
        pa.setLayout(new FlowLayout(FlowLayout.CENTER));
        bn1 = new JButton("Plus");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multiply");
        bn4 = new JButton("Devide");
        pa.add(bn1); pa.add(bn2); pa.add(bn3); pa.add(bn4);
        fr.add(pa);
        
        tf3 = new JTextField();
        fr.add(tf3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 200);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }

}
