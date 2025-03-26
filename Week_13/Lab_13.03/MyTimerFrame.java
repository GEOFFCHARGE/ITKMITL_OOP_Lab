import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyTimerFrame implements MouseListener {

    private JFrame fr;
    private Thread t;
    private MyTimer timer;
    private boolean pause = false;

    public MyTimerFrame() {

        fr = new JFrame("My Timer");
        fr.setLayout(new FlowLayout());
    
        timer = new MyTimer();
        timer.addMouseListener(this);
        fr.add(timer);

        t = new Thread(timer);
        t.start();

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(280, 120);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

    }

    public void mouseClicked(MouseEvent e) {

        if (e.getSource().equals(timer)) {
            pause = !pause;
            if (pause) {
                timer.pauseThread();
            }
            else {
                timer.resumeThread();
            }
        }

    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {

        new MyTimerFrame();

    }

}
