package Views;

import javax.swing.*;

public class ViewCalculator extends JFrame {
    public ViewCalculator(){
        setTitle("Calculator");
        setSize(340, 530);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setVisible(true);
    }

    public void iniciar(){
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton();
            btn.setText(String.valueOf(i));
            btn.setBounds(10, 10, 10, 10);
            add(btn);
        }
    }

}
