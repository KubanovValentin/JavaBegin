package homework_2_07_2022;

import javax.swing.*;
import java.awt.*;

public class MyJButton extends JButton {

    public MyJButton(String title){
        super.setText(title);
    }

    public MyJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }

}
