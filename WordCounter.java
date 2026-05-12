import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {

    JTextArea ta;
    JButton b;
    JLabel l;

    WordCounter() {

        ta = new JTextArea(5, 20);
        b = new JButton("Count");
        l = new JLabel("Words: 0");

        b.addActionListener(this);

        add(ta);
        add(b);
        add(l);

        setLayout(null);

        ta.setBounds(30, 30, 200, 100);
        b.setBounds(70, 150, 100, 30);
        l.setBounds(80, 200, 100, 30);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String text = ta.getText();

        String words[] = text.split("\\s+");

        l.setText("Words: " + words.length);
    }

    public static void main(String args[]) {

        new WordCounter();
    }
}
