package lesson_8_07_2022_calculatorOformlenieOnLesson;

import javax.swing.*;

public class CalcJButton extends JButton {
    public CalcJButton(String title){
        super.setText(title);
    }

    public CalcJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }
}
