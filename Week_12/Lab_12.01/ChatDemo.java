import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener {

    private JFrame f;
    private JPanel pa1, pa2;
    private JTextArea ta;
    private JTextField tf;
    private JButton bn1, bn2;

    public ChatDemo() {

        f = new JFrame();
        f.setLayout(new BorderLayout());

        ta = new JTextArea();
        ta.setEditable(false);
        ta.setSize(45,20);
        f.add(ta, BorderLayout.CENTER);

        pa1 = new JPanel();
        pa1.setLayout(new GridLayout(2, 1));

        tf = new JTextField();
        tf.setSize(45,10);
        pa1.add(tf);

        pa2 = new JPanel();
        pa2.setLayout(new FlowLayout());

        bn1 = new JButton("Submit");
        bn2 = new JButton("Reset");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        pa2.add(bn1);
        pa2.add(bn2);
        pa1.add(pa2);

        f.add(pa1, BorderLayout.SOUTH);

        f.addWindowListener(this);
        f.setSize(500, 400);
        f.setVisible(true);

        loadFile();

    }

    private void saveFile() {

        try (FileWriter fw = new FileWriter("ChatDemo.dat")) {
            fw.write(ta.getText());
        }
        catch (IOException e) {
            System.out.print(e);
        }

    }

    private void loadFile() {

        try (FileReader f = new FileReader("ChatDemo.dat")) {
            int ch;
            String text = "";
            while ((ch = f.read()) != -1) {
                text += (char) ch;
            }
            ta.setText(text);
        }
        catch (FileNotFoundException e) {
            System.out.println("No save file");
        }
        catch (IOException e) {
            System.out.print(e);
        }

    }

    public void actionPerformed(ActionEvent ev) {

        String text = tf.getText();
        if (ev.getSource() == bn1 && !text.isEmpty()) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String time = dtf.format(LocalDateTime.now());
            ta.append(time + ": " + text + "\n");
            tf.setText("");
        }
        else if (ev.getSource() == bn2) {
            ta.setText("");
        }

    }

    public void windowActivated(WindowEvent e) {}
    public void windowClosing(WindowEvent ev) {

        saveFile();
        System.exit(0);

    }

    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {

        new ChatDemo();

    }

}
