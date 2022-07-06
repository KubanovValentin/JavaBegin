package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;

public class CalculatorJButton extends JButton {
    public CalculatorJButton() {
    }

    public CalculatorJButton(Icon icon) {
        super(icon);
    }

    public CalculatorJButton(String text) {
        super(text);
    }

    public CalculatorJButton(Action a) {
        super(a);
    }

    public CalculatorJButton(String text, Icon icon) {
        super(text, icon);
    }
    public CalculatorJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }
}
