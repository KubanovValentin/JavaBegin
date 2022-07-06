package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;
import java.awt.*;

public class CalculatorJFrame extends JFrame {

    public CalculatorJFrame() throws HeadlessException {
    }

    public CalculatorJFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public CalculatorJFrame(String title) throws HeadlessException {
        super(title);
    }

    public CalculatorJFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    public CalculatorJFrame(String title, int width, int height){
        super(title);
        super.setSize(width,height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setVisible(true);
    }
    public CalculatorJFrame (String title,int width, int height, Component comp){
        this(title, width, height);
        super.getContentPane().add(comp);
    }
}

