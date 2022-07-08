package lesson_8_07_2022_calculatorOformlenieOnLesson;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class CalcJFrame extends JFrame {
    public CalcJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }

    public CalcJFrame(String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);

    }

    public CalcJFrame(String title, int width, int height, LayoutManager layout) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }
}
