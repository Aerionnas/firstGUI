import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame window = new JFrame("Square root demo");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JTextField textfield1 = new JTextField("25");
        JTextField textfield2 = new JTextField("1");

        JTextArea textarea1 = new JTextArea("Enter x:");
        JTextArea textarea2 = new JTextArea("Current guess g:");
        JTextArea textarea3 = new JTextArea("g=(g+x/g)/2");

        JButton button1 = new JButton("go");
        panel1.setLayout(new GridLayout(3, 2));

        panel1.add(textarea1);
        panel1.add(textfield1);
        panel1.add(textarea2);
        panel1.add(textfield2);
        panel1.add(button1);
        panel1.add(textarea3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(textfield1.getText().trim());
                int g = Integer.parseInt(textfield2.getText().trim());

                textarea3.setText("g = (" + (g + x / g) / 2 + ")");
            }
        });

        window.setContentPane(panel1);
        window.setSize(250, 300);
        window.setLocation(100, 100);
        window.setVisible(true);
    }
}
