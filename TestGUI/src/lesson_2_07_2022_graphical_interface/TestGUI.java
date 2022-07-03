package lesson_2_07_2022_graphical_interface;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
    public static void main(String[] args) {

        try {
          UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
   //        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }



//        try {
//            UIManager.setLookAndFeel(new MetalLookAndFeel());
//        }   catch (UnsupportedLookAndFeelException ex) {
//            ex.printStackTrace();
//            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE,null,ex);
//        }

        JFrame.setDefaultLookAndFeelDecorated(true);//true
                                                    // чтоб использовался скин
                                                    //UIManager.setLookAndFeel
                                                    // ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");


        JFrame frame = new JFrame("Test Frame");

        frame.setIconImage(new ImageIcon("D:/Users/13/Pictures/work-logo.jpg").getImage());
        //метод отображения окна (метод отображения окна, по умолчанию -false, true для отображения)
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//запускает фрейм(окно) ровно посередине экрана
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        panel.setSize(200, 300);
        panel.setBackground(Color.blue);


        JButton jButton = new JButton("КНОПКА");
        jButton.setSize(100, 200);

        frame.add(jButton);
        frame.add(panel);
        panel.add(jButton);

        frame.getContentPane().add(panel);
    }
}
