package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;
import java.awt.*;

public class CalculatorStart {
    public static void main(String[] args) {
//        FlowLayout flowLayout = new FlowLayout(2,30,40);
//        GridLayout gridLayout=new GridLayout(1,0,10,1);
//        CalculatorJFrame calculatorJFrame = new CalculatorJFrame("КАЛЬКУЛЯТОР", 600, 400);
//
//        CalculatorJLabel calculatorJLabel1=new CalculatorJLabel("Число 1");
//        CalculatorJLabel calculatorJLabel2=new CalculatorJLabel("Число 2");
//        CalculatorJTextField calculatorJTextField1=new CalculatorJTextField(200,50);
//        CalculatorJTextField calculatorJTextField2=new CalculatorJTextField(200,50);
//        CalculatorJPanel calculatorJPanel = new CalculatorJPanel("1",600,300);
// //       calculatorJFrame.setLayout(gridLayout);
// //       calculatorJPanel.setLayout(flowLayout);
//        calculatorJPanel.setLayout(gridLayout);
//        calculatorJFrame.add(calculatorJPanel);
//        calculatorJPanel.add(calculatorJLabel1);
//        calculatorJPanel.add(calculatorJTextField1);
//        calculatorJPanel.add(calculatorJLabel2);
//        calculatorJPanel.add(calculatorJTextField2);
//        CalculatorJButton calculatorJButton=new CalculatorJButton("сложение",100,50);
        CalculatorJFrame frame = new CalculatorJFrame("КАЛЬКУЛЯТОР",600,350);
//        Dimension dimension = new Dimension(640,480);
//
//        frame.setMinimumSize( dimension );
//        frame.setMaximumSize( dimension );
        frame.setResizable(false);

        CalculatorJPanel panel1 = new CalculatorJPanel();
        CalculatorJPanel panel2 = new CalculatorJPanel();
        CalculatorJPanel panel3 = new CalculatorJPanel();
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        panel2.setBounds(0, 100, 500, 100);
        panel1.setBounds(0, 200, 500, 100);
        panel3.setBounds(0, 0, 500, 100);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.blue);
    }
}
