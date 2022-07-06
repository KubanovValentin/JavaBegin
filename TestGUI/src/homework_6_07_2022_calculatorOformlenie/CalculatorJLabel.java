package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;

public class CalculatorJLabel extends JLabel {
    public CalculatorJLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public CalculatorJLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public CalculatorJLabel(String text) {
        super(text);
    }

    public CalculatorJLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public CalculatorJLabel(Icon image) {
        super(image);
    }

    public CalculatorJLabel() {
    }
}
