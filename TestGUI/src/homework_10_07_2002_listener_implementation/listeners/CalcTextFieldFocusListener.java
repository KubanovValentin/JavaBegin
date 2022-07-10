package homework_10_07_2002_listener_implementation.listeners;

import homework_10_07_2002_listener_implementation.gui.MyJTextField;
import homework_10_07_2002_listener_implementation.gui.TestGUI;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {
    private MyJTextField field;

    public CalcTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_CHISLO)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_CHISLO);
            field.setForeground(Color.GRAY);
        }
    }
}
