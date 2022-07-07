package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;
import java.awt.*;

public class CalculatorStart {
    public static void main(String[] args) {
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 15, 30);
        GridLayout gridLayout1 = new GridLayout(1, 4, 15, 20);
        GridLayout gridLayout2 = new GridLayout(1, 2, 10, 10);
//        CalculatorJFrame calculatorJFrame = new CalculatorJFrame("КАЛЬКУЛЯТОР", 600, 400);
//
        CalculatorJLabel calculatorJLabel1 = new CalculatorJLabel("Число 1");
        CalculatorJLabel calculatorJLabel2 = new CalculatorJLabel("Число 2");
        CalculatorJLabel calculatorJLabel3 = new CalculatorJLabel("РЕЗУЛЬТАТ");
        CalculatorJTextField calculatorJTextField1 = new CalculatorJTextField(200, 50);
        CalculatorJTextField calculatorJTextField2 = new CalculatorJTextField(200, 50);
        CalculatorJTextField calculatorJTextField3 = new CalculatorJTextField(200, 50);
        CalculatorJFrame frame = new CalculatorJFrame("КАЛЬКУЛЯТОР", 600, 330);
        CalculatorJButton calculatorJButton1 = new CalculatorJButton("сложение");
        CalculatorJButton calculatorJButton2 = new CalculatorJButton("вычитание");
        CalculatorJButton calculatorJButton3 = new CalculatorJButton("деление");
        CalculatorJButton calculatorJButton4 = new CalculatorJButton("умножение");
        Dimension dimension1 = new Dimension(110, 30);
        Dimension dimension2 = new Dimension(150, 30);
        frame.setResizable(false);
        CalculatorJPanel panel1 = new CalculatorJPanel();
        CalculatorJPanel panel2 = new CalculatorJPanel();
        CalculatorJPanel panel3 = new CalculatorJPanel();
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        panel2.setBounds(0, 100, 600, 100);
        panel3.setBounds(0, 200, 600, 100);
        panel1.setBounds(0, 0, 600, 100);
        calculatorJButton1.setPreferredSize(dimension1);
        calculatorJButton2.setPreferredSize(dimension1);
        calculatorJButton3.setPreferredSize(dimension1);
        calculatorJButton4.setPreferredSize(dimension1);
        calculatorJTextField1.setPreferredSize(dimension2);
        calculatorJTextField2.setPreferredSize(dimension2);
        calculatorJLabel3.setPreferredSize(dimension2);
        calculatorJTextField3.setPreferredSize(dimension2);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.lightGray);
        panel1.setLayout(flowLayout);
        panel2.setLayout(flowLayout);
        panel3.setLayout(flowLayout);
        panel1.add(calculatorJLabel1);
        panel1.add(calculatorJTextField1);
        panel1.add(calculatorJLabel2);
        panel1.add(calculatorJTextField2);
        panel2.add(calculatorJButton1);
        panel2.add(calculatorJButton2);
        panel2.add(calculatorJButton3);
        panel2.add(calculatorJButton4);
        panel3.add(calculatorJLabel3);
        panel3.add(calculatorJTextField3);
    }
}
