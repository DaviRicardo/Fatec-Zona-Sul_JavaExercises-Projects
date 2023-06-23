package exemplo3_gridlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo3_gridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Exemplo- Login");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JLabel label1 = new JLabel ("Usuário");
        JTextField textField = new JTextField (20);
        JLabel label2 = new JLabel ("Senha");
        JPasswordField passWordField = new JPasswordField(20);
        JButton button = new JButton("Logar");
	panel.add(label1);
	panel.add(textField);
	panel.add(label2);
	panel.add(passWordField);
	panel.add(button);
	frame.setContentPane(panel);
	frame.pack();
	frame.setVisible(true);

    }
}
