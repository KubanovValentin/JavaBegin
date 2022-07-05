package lesson_5_07_20022;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
    public static void main(String[] args) {
/*
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

*/
        //BernsteinLookAndFeel подключение скачанной библиотеки скина
        try {
            UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        }   catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);//true
        // чтоб использовался скин
        //UIManager.setLookAndFeel
        // ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");


        JFrame frame = new JFrame("Test Frame");

        frame.setIconImage(new ImageIcon("D:\\Users\\13\\IdeaProjects\\JavaBegin\\TestGUI\\icon\\animal.png").getImage());
        //метод отображения окна (метод отображения окна, по умолчанию -false, true для отображения)
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//запускает фрейм(окно) ровно посередине экрана
//-------------------------------------------------------------
//        FlowLayout flowLayout = new FlowLayout();
//        frame.setLayout(flowLayout);
// -------------------------------------------------------------

        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        JPanel panel = new JPanel();
      panel.setBorder(BorderFactory.createRaisedBevelBorder());
       //      panel.setSize(400, 500);
   //     panel.setBackground(Color.blue);
       panel.setLayout(borderLayout);


        JButton jButton = new JButton("КНОПКА");
        //       jButton.setSize(100, 200);
        JButton jButton1 = new JButton("КНОПКА1");
        JButton jButton2 = new JButton("КНОПКА2");
        JButton jButton3 = new JButton("КНОПКА3");
        frame.add(jButton,BorderLayout.NORTH);
        frame.add(jButton1,BorderLayout.CENTER);
        frame.add(jButton2,BorderLayout.SOUTH);
        frame.add(jButton2);
        frame.add(jButton3);
        frame.add(panel);
        panel.add(jButton,BorderLayout.NORTH);
        panel.add(jButton1,BorderLayout.CENTER);
        panel.add(jButton2,BorderLayout.SOUTH);
        panel.add(jButton3,BorderLayout.EAST);

        frame.getContentPane().add(panel);
    }
}
