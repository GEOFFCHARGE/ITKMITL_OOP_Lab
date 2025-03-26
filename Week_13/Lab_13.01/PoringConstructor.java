import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener {

    private JFrame fr;
    private JButton bn;
    private Thread t;
    private Poring poring;

    public PoringConstructor() {

        fr = new JFrame();
        fr.setLayout(new FlowLayout());

        bn = new JButton("Add");
        bn.addActionListener(this);
        fr.add(bn);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(200, 80);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(bn)) {
            poring = new Poring();
            t = new Thread(poring);
            t.start();
        }

    }

    public static void main(String[] args) {

        new PoringConstructor();

    }

}
