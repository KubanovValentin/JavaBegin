package lesson_2_07_2022_graphical_interface;

import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        //метод отображения окна (метод отображения окна, по умолчанию -false, true для отображения)
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JPanel panel = new JPanel();
        panel.setSize(500, 400);
        panel.setBackground(Color.blue);


        JButton jButton = new JButton("КНОПКА");
        jButton.setSize(100, 200);

        frame.add(jButton);
        frame.add(panel);
        panel.add(jButton);


    }
}
