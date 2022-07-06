package homework_6_07_2022_calculatorOformlenie;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

public class CalculatorJTextField extends JTextField {
    public CalculatorJTextField() {
    }
    public CalculatorJTextField(int width, int height) {
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }
    public CalculatorJTextField(String text) {
        super(text);
    }

    public CalculatorJTextField(int columns) {
        super(columns);
    }

    public CalculatorJTextField(String text, int columns) {
        super(text, columns);
    }

    public CalculatorJTextField(Document doc, String text, int columns) {
        super(doc, text, columns);
    }
}
