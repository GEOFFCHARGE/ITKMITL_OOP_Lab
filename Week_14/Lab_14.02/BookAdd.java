import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookAdd implements ActionListener, WindowListener {

    private JButton bt;
    private JComboBox<String> cb;
    private JFrame fr;
    private JLabel lb1, lb2, lb3;
    private JPanel pn1, pn2, pn3, pn4;
    private JTextField tf1, tf2;

    public BookAdd() {

        fr = new JFrame();
        fr.setLayout(new GridLayout(4, 1));

        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(1, 2));
        fr.add(pn1);

        lb1 = new JLabel("   Name");
        pn1.add(lb1);

        tf1 = new JTextField();
        pn1.add(tf1);

        pn2 = new JPanel();
        pn2.setLayout(new GridLayout(1, 2));
        fr.add(pn2);

        lb2 = new JLabel("   Price");
        pn2.add(lb2);

        tf2 = new JTextField();
        pn2.add(tf2);

        pn3 = new JPanel();
        pn3.setLayout(new GridLayout(1, 2));
        fr.add(pn3);

        lb3 = new JLabel("   Type");
        pn3.add(lb3);

        String[] s = {"General", "Computer", "Math&Sci", "Photo"};
        cb = new JComboBox<>(s);
        pn3.add(cb);

        pn4 = new JPanel();
        pn4.setLayout(new FlowLayout());
        fr.add(pn4);

        bt = new JButton("Insert");
        bt.addActionListener(this);
        pn4.add(bt);

        fr.setSize(330, 170);
        fr.setResizable(false);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        fr.dispose();

    }

    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {

        fr.dispose();

    }
    public void windowClosing(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

}
