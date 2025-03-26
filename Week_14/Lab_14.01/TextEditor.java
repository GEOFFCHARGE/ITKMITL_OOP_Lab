import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class TextEditor implements ActionListener {

    private JFrame fr;
    private JMenu m;
    private JMenuBar mb;
    private JMenuItem mi1, mi2, mi3, mi4;
    private JTextArea ta;

    public TextEditor() {

        fr = new JFrame("My Text Editor");
    
        mb = new JMenuBar();
        fr.setJMenuBar(mb);

        m = new JMenu("File");
        mb.add(m);

        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Close");
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        m.addSeparator();
        m.add(mi4);

        ta = new JTextArea();
        fr.add(ta);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 300);
        fr.setResizable(false);
        fr.setVisible(true);

    }

    private File chooseFile(String s) {

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle(s);
        fc.showOpenDialog(fr);
        File f = fc.getSelectedFile();
        return f;

    }

    private void openFile(File f) {

        try (FileReader fr = new FileReader(f)) {
            int ch;
            String text = "";
            while ((ch = fr.read()) != -1) {
                text += (char) ch;
            }
            ta.setText(text);
        }
        catch (NullPointerException e) {
            return;
        }
        catch (IOException e) {
            System.out.print(e);
        }

    }

    private void saveFile(File f) {

        try (FileWriter fw = new FileWriter(f)) {
            fw.write(ta.getText());
        }
        catch (NullPointerException e) {
            return;
        }
        catch (IOException e) {
            System.out.print(e);
        }

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mi1) {
            ta.setText("");
        }
        else if (e.getSource() == mi2) {
            openFile(chooseFile(e.getActionCommand()));
        }
        else if (e.getSource() == mi3) {
            saveFile(chooseFile(e.getActionCommand()));
        }
        else if (e.getSource() == mi4) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new TextEditor();
    }

}
