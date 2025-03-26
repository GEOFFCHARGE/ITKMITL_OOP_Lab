import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class Poring implements Runnable, MouseListener {

    private static int count;
    private JFrame fr;
    private JLabel lb1, lb2;
    private BufferedImage bufferedImage;
    private Image image;
    private ImageIcon imageIcon;

    public void run() {

        try {
            fr = new JFrame();
            fr.setLayout(new FlowLayout());

            bufferedImage = ImageIO.read(new File("PoringImage.png"));
            image = bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            imageIcon = new ImageIcon(image);

            lb1 = new JLabel(imageIcon);
            lb1.addMouseListener(this);
            lb1.setPreferredSize(new Dimension(150, 150));
            fr.add(lb1);

            count++;

            lb2 = new JLabel(String.valueOf(count));
            lb2.setFont(new Font("SansSerif", Font.PLAIN, 30));
            lb2.setPreferredSize(new Dimension(60, 100));
            fr.add(lb2);

            int x = (int) (Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 200));
            int y = (int) (Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 200));
            fr.setLocation(x, y);

            fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            fr.pack();
            fr.setResizable(false);
            fr.setVisible(true);

            new Thread(() -> shake(fr)).start();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    private void shake(JFrame frame) {

        int x = frame.getX();
        int y = frame.getY();
        Random rand = new Random();
        while (true) {
            try {
                int shakeX = rand.nextInt(10) - 5;
                int shakeY = rand.nextInt(10) - 5;
                frame.setLocation(x + shakeX, y + shakeY);
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

    public void mouseClicked(MouseEvent e) {

        if (e.getSource().equals(lb1)) {
            fr.dispose();
        }

    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

}
