import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {

    public void run() {

        try {
            while (true) {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                setFont(new Font("SansSerif", Font.PLAIN, 50));
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }

}
