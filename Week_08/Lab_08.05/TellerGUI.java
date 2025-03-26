import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel pa1, pa2, pa3;
    private JLabel l1, l2, l3;
    private JTextField tf;
    private JButton bn1, bn2, bn3;

    public TellerGUI() {

        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4, 1));

        pa1 = new JPanel();
        pa1.setLayout(new GridLayout(1, 2));
        l1 = new JLabel("  Balance");
        l2 = new JLabel("6000");
        pa1.add(l1);
        pa1.add(l2);
        fr.add(pa1);

        pa2 = new JPanel();
        pa2.setLayout(new GridLayout(1, 2));
        l3 = new JLabel("  Amount");
        tf = new JTextField(10);
        pa2.add(l3);
        pa2.add(tf);
        fr.add(pa2);

        pa3 = new JPanel();
        pa3.setLayout(new FlowLayout(FlowLayout.CENTER));
        bn1 = new JButton("Deposit");
        bn2 = new JButton("WithDraw");
        bn3 = new JButton("Exit");
        pa3.add(bn1); pa3.add(bn2); pa3.add(bn3);
        fr.add(pa3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(260, 200);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new TellerGUI();
    }

}
