import javax.swing.*;

public class AdmissionForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Admission Enquiry Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Course:");
        JLabel l3 = new JLabel("Mobile:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b = new JButton("Submit");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(150, 150, 150, 30);

        b.setBounds(120, 220, 100, 30);

        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);

        f.add(l3);
        f.add(t3);

        f.add(b);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
