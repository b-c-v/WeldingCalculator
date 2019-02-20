package weldingCalculator;

import weldingCalculator.guiForm.CalculatorGUI;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {

        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setVisible(true);
        calculatorGUI.pack();
        calculatorGUI.setLocationRelativeTo(null);
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
