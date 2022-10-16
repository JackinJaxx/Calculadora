package Main;

import Views.ViewCalculator;

import javax.swing.*;

public class CalculatorRun {
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                ViewCalculator vista = new ViewCalculator();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
}
