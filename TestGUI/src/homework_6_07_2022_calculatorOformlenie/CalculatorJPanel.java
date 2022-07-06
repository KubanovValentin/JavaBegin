package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;
import java.awt.*;

public class CalculatorJPanel extends JPanel {
    public CalculatorJPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

    public CalculatorJPanel(LayoutManager layout) {
        super(layout);
    }

    public CalculatorJPanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public CalculatorJPanel() {
    }

    public CalculatorJPanel(String name, int width, int height) {
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.setBackground(Color.yellow);
    }

    public CalculatorJPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);
    }
    public CalculatorJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        super.setLayout(layout);
    }
    public CalculatorJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        this(name, width, height);
        super.setLayout(layout);
        super.add(comp);
    }
}
