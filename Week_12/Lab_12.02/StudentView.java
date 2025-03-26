import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {

    private JFrame fr;
    private JLabel l1, l2, l3, l4;
    private JTextField tf1, tf2;
    private JButton bn1, bn2;
    private StudentProfile student;

    public StudentView() {

        fr = new JFrame();
        fr.setLayout(new GridLayout(4, 2));

        l1 = new JLabel("  ID :");
        tf1 = new JTextField();
        fr.add(l1);
        fr.add(tf1);

        l2 = new JLabel("  Name :");
        tf2 = new JTextField();
        fr.add(l2);
        fr.add(tf2);

        l3 = new JLabel("  Money :");
        l4 = new JLabel("0");
        fr.add(l3);
        fr.add(l4);

        bn1 = new JButton("Deposit");
        bn2 = new JButton("WithDraw");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        fr.add(bn1);
        fr.add(bn2);

        fr.addWindowListener(this);
        fr.setSize(250, 150);
        fr.setVisible(true);

        loadFile();

    }

    private void saveFile() {

        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))) {
            if (student == null) {
                student = new StudentProfile();
            }
            student.setID(Integer.parseInt(tf1.getText()));
            student.setName(tf2.getText());
            student.setMoney(Integer.parseInt(l4.getText()));
            oout.writeObject(student);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    private void loadFile() {

        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("StudentM.dat"))) {
            student = (StudentProfile) oin.readObject();
            tf1.setText(String.valueOf(student.getID()));
            tf2.setText(student.getName());
            l4.setText(String.valueOf(student.getMoney()));
        }
        catch (FileNotFoundException e) {
            student = new StudentProfile();
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    public void actionPerformed(ActionEvent ev) {

        int money = Integer.parseInt(l4.getText());
        if (ev.getSource() == bn1) {
            l4.setText(String.valueOf(money + 100));
            student.setMoney(money);
        }
        else if (ev.getSource() == bn2 && money >= 100) {
            l4.setText(String.valueOf(money - 100));
            student.setMoney(money);
        }

    }

    public void windowActivated(WindowEvent ev) {}
    public void windowClosing(WindowEvent ev) {

        saveFile();
        System.exit(0);

    }

    public void windowClosed(WindowEvent ev) {}
    public void windowDeactivated(WindowEvent ev) {}
    public void windowDeiconified(WindowEvent ev) {}
    public void windowIconified(WindowEvent ev) {}
    public void windowOpened(WindowEvent ev) {}

    public static void main(String[] args) {

        new StudentView();

       }

}
