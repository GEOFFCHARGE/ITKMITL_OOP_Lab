import java.awt.*;
import javax.swing.*;

public class MyClockFrame {

    public static void main(String[] args) {

        JFrame fr = new JFrame("My Clock");
        fr.setLayout(new FlowLayout());
    
        MyClock clock = new MyClock();
        fr.add(clock);

        Thread t = new Thread(clock);
        t.start();

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(280, 120);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

    }

}
