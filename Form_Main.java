package suhasGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Main implements ActionListener {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextField textField2 = new JTextField();
    JLabel title = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JButton button = new JButton();

    Form_Main() {
        title.setText("Login Form");
        title.setFont(new Font("Sans Serif", Font.ITALIC, 30));
        title.setBounds(140, 30, 300, 40);
        title.setForeground(Color.white);

        label1.setText("Username");
        label1.setBounds(50, 100, 100, 30);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Comic Sans", Font.PLAIN, 20));

        label2.setText("Email");
        label2.setBounds(50, 200, 100, 30);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Comic Sans", Font.PLAIN, 20));

        textField.setBounds(170, 100, 200, 30);
        textField.setFont(new Font(null, Font.PLAIN, 20));

        textField2.setBounds(170, 200, 200, 30);
        textField2.setFont(new Font(null, Font.PLAIN, 20));

        button.setText("Submit");
        button.addActionListener(this::actionPerformed);
        button.setBackground(new Color(0x45aaf2));
        button.setBounds(170, 280, 100, 40);
        button.setForeground(Color.white);
        button.setFont(new Font("Comic sans", Font.BOLD, 16));

        frame.add(title);
        frame.add(label1);
        frame.add(label2);
        frame.add(textField);
        frame.add(textField2);
        frame.add(button);
        // main frame
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x333333));
        frame.setTitle("Form");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = textField.getText();
            String email = textField2.getText();
            if (name.isBlank() || email.isBlank()) {
                JOptionPane.showMessageDialog(null, "Please enter the form corretly", "Form InValid",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("Correct");
            }
        }
    }
}
