package Views;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ViewCalculator extends JFrame {
    private JPanel panelBar;
    public ViewCalculator(){
        setTitle("Calculator");
        setSize(336, 540);
        setBackground(Color.BLACK);
        setUndecorated(true);
        setBarWindow();


        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void  setBarWindow(){
        panelBar= new JPanel();
        panelBar.setBackground(Color.BLACK);
        panelBar.setBounds(0, 0, 336, 30);
        panelBar.setLayout(null);
        this.getContentPane().add(panelBar);

        JButton btnClose = new JButton();
        btnClose.setBounds(306, 0, 32, 32);
        btnClose.setBackground(null);
        btnClose.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Images/cerrar.png"))));
        btnClose.setBorder(null);
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(e -> System.exit(0));
        panelBar.add(btnClose);

        JButton btnMinimize = new JButton();
        btnMinimize.setBounds(276, 0, 32, 32);
        btnMinimize.setBackground(null);
        btnMinimize.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Images/minimizar.png"))));
        btnMinimize.setBorder(null);
        btnMinimize.setFocusPainted(false);
        btnMinimize.addActionListener(e -> setState(ICONIFIED));
        panelBar.add(btnMinimize);

        JButton btnMaximize = new JButton();
        btnMaximize.setBounds(246, 0, 32, 32);
        btnMaximize.setBackground(null);
        btnMaximize.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Images/maximizar.png"))));
        btnMaximize.setBorder(null);
        btnMaximize.setFocusPainted(false);
        btnMaximize.addActionListener(e -> {
            if(getExtendedState() == MAXIMIZED_BOTH){
                setExtendedState(NORMAL);
            }else{
                setExtendedState(MAXIMIZED_BOTH);
            }
        });
        panelBar.add(btnMaximize);
    }
}
