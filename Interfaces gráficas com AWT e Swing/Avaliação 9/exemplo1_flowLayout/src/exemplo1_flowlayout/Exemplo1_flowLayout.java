package exemplo1_flowlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Exemplo1_flowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Exemplo-Login"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(); 
        FlowLayout f = (FlowLayout)panel.getLayout(); 
        JLabel label1 = new JLabel("Uusário"); 
        JTextField textField = new JTextField (20); 
        JLabel label2 = new JLabel ("Senha");
        JPasswordField passWordField = new JPasswordField(20); 
        JButton button = new JButton ("Logar"); 
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
