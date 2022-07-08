package lesson_8_07_2022_calculatorOformlenieOnLesson;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class CalcJTextField extends JTextField{
    public CalcJTextField (String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public CalcJTextField (int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public CalcJTextField (int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}

