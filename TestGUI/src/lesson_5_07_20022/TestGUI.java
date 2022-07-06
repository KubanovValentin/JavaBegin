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
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//запускает фрейм(окно) ровно посередине экрана
//-------------------------------------------------------------
//        FlowLayout flowLayout = new FlowLayout();
//        frame.setLayout(flowLayout);
// -------------------------------------------------------------

//        BorderLayout borderLayout = new BorderLayout();
 //       frame.setLayout(borderLayout);
//--------------------------------------------------------------

        GridLayout gridLayout=new GridLayout(2,5,4,4);
        frame.setLayout(gridLayout);
        JPanel panel = new JPanel();
      panel.setBorder(BorderFactory.createRaisedBevelBorder());
           panel.setSize(400, 500);
   //     panel.setBackground(Color.blue);
 //      panel.setLayout(borderLayout);
        panel.setLayout(gridLayout);

        JButton jButton0 = new JButton("КНОПКА0");
 //       jButton.setSize(300, 400);
        JButton jButton1 = new JButton("КНОПКА1");
        JButton jButton2 = new JButton("КНОПКА2");
        JButton jButton3 = new JButton("КНОПКА3");
        JButton jButton4 = new JButton("КНОПКА4");
        JButton jButton5 = new JButton("КНОПКА5");
        JButton jButton6 = new JButton("КНОПКА6");
//        frame.add(jButton0,BorderLayout.NORTH);
//        frame.add(jButton1,BorderLayout.CENTER);
//        frame.add(jButton2,BorderLayout.SOUTH);
//        frame.add(jButton3,BorderLayout.EAST);
//        frame.add(jButton4,BorderLayout.WEST);
//        frame.add(jButton2);
//        frame.add(jButton3);
        frame.add(panel);
//        panel.add(jButton0,BorderLayout.NORTH);
//        panel.add(jButton1,BorderLayout.CENTER);
//        panel.add(jButton2,BorderLayout.SOUTH);
//        panel.add(jButton3,BorderLayout.EAST);
//        panel.add(jButton4,BorderLayout.WEST);
        panel.add(jButton0);
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jButton3);
        panel.add(jButton4);
        panel.add(jButton5);
        panel.add(jButton6);
        frame.getContentPane().add(panel);
    }
}
