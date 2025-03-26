import javax.swing.*;

public class MDIFromGUI {

    private JFrame fr1, fr2, fr3, fr4;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;

    public MDIFromGUI() {

        fr1 = new JFrame("SubMenuItem Demo");
    
        mb = new JMenuBar();
        fr1.setJMenuBar(mb);
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mb.add(m1); mb.add(m2); mb.add(m3);

        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);

        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);

        fr2 = new JFrame("Application 01");
        fr2.setSize(270, 200);
        fr2.setLocation(50, 280);
        fr2.setVisible(true);

        fr3 = new JFrame("Application 02");
        fr3.setSize(270, 200);
        fr3.setLocation(220, 70);
        fr3.setVisible(true);

        fr4 = new JFrame("Application 03");
        fr4.setSize(270, 200);
        fr4.setLocation(380, 280);
        fr4.setVisible(true);

        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(700, 500);
        fr1.setVisible(true);

    }

    public static void main(String[] args) {
        new MDIFromGUI();
    }

}
