import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookView implements ActionListener {

    private JButton bt1, bt2, bt3, bt4, bt5;
    private JComboBox<String> cb;
    private JFrame fr;
    private JLabel lb1, lb2, lb3;
    private JPanel pn1, pn2, pn3, pn4, pn5;
    private JTextField tf1, tf2, tf3;

    public BookView() {

        fr = new JFrame();
        fr.setLayout(new GridLayout(5, 1));

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

        bt1 = new JButton("  <<<  ");
        bt1.addActionListener(this);
        pn4.add(bt1);

        tf3 = new JTextField("" + 0);
        tf3.setColumns(5);
        pn4.add(tf3);

        bt2 = new JButton("  >>>  ");
        bt2.addActionListener(this);
        pn4.add(bt2);

        pn5 = new JPanel();
        pn5.setLayout(new FlowLayout());
        fr.add(pn5);

        bt3 = new JButton("  Add  ");
        bt3.addActionListener(this);
        pn5.add(bt3);

        bt4 = new JButton("  Update  ");
        bt4.addActionListener(this);
        pn5.add(bt4);

        bt5 = new JButton("  Delete  ");
        bt5.addActionListener(this);
        pn5.add(bt5);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(270, 230);
        fr.setResizable(false);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bt1) {
            
        }
        else if (e.getSource() == bt2) {
            
        }
        else if (e.getSource() == bt3) {
            new BookAdd();
        }
        else if (e.getSource() == bt4) {
            
        }
        else if (e.getSource() == bt5) {
            
        }

    }

    public static void main(String[] args) {

        new BookView();

    }

}
