package homework_10_07_2002_listener_implementation.gui;

import javax.swing.*;

public class MyJButton extends JButton {

    public MyJButton(String title) {
        super.setText(title);
    }

    public MyJButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }
}
