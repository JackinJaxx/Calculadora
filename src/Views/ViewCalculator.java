package Views;

import javax.swing.*;
import java.awt.*;

public class ViewCalculator extends JFrame {
    
    public ViewCalculator(){
        setTitle("Calculator");
        setSize(336, 540);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setUndecorated(true);



        setVisible(true);
    }
}
