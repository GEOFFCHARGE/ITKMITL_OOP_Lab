import java.awt.*;
import javax.swing.*;

public class MyTimer extends JLabel implements Runnable {

    private int sec, min, hour, time;
    private boolean pause;

    private synchronized void checkThread() {

        while (pause) {
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

    public void pauseThread() {

        pause = true;

    }

    public synchronized void resumeThread() {

        pause = false;
        this.notify();

    }

    public void run() {

        try {
            while (true) {
                checkThread();
                sec = time % 60;
                min = (time / 60) % 60;
                hour = (time / 3600) % 24;
                setFont(new Font("SansSerif", Font.PLAIN, 50));
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
                time++;
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }

}
