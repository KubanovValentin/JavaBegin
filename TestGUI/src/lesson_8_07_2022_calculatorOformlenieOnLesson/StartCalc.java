package lesson_8_07_2022_calculatorOformlenieOnLesson;



import com.jtattoo.plaf.smart.SmartLookAndFeel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class StartCalc {
    //кнопки
    private CalcJButton btnAdd;
    private CalcJButton btnSubtract;
    private CalcJButton btnDivide;
    private CalcJButton btnMultiply;
    //надписи
    private JLabel labelChislo1;
    private JLabel labelChislo2;
    private JLabel labelResult;
    //поле ввода
    private CalcJTextField jtxtChislo1;
    private CalcJTextField jtxtChislo2;
    private CalcJTextField jtxtResult;
    //контейнер
    private CalcJPanel panel1;
    private CalcJPanel panel2;
    private CalcJPanel panel3;
    //окно
    private CalcJFrame frame;

    public static void main(String[] args) {
        //скин-визуалное оформление SmartLookAndFeel
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StartCalc.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        StartCalc startCalc = new StartCalc();
        startCalc.createLabels();
        startCalc.createTextFields();
        startCalc.createButtons();
        startCalc.createPanels();
        startCalc.createFrame();



    }
    //<editor-fold defaultstate="collapsed" desc="компоненты(методы)">

    private void createLabels() {
        labelChislo1 = new JLabel("Число 1");
        labelChislo2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields() {
        jtxtChislo1 = new CalcJTextField(10);
        jtxtChislo2 = new CalcJTextField(10);

        jtxtResult = new CalcJTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);
    }

    private void createButtons() {
        btnAdd = new CalcJButton("Сложение");
        btnSubtract = new CalcJButton("Вычитание");
        btnDivide = new CalcJButton("Деление");
        btnMultiply = new CalcJButton("Умножение");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not suported yeat.");
            }
        });
    }

    private void createPanels() {
        panel1 = new CalcJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new CalcJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new CalcJPanel("panel3", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelChislo1);
        panel1.add(jtxtChislo1);
        panel1.add(labelChislo2);
        panel1.add(jtxtChislo2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        panel3.add(labelResult);
        panel3.add(jtxtResult);
    }

    private void createFrame() {
        frame = new CalcJFrame("Калькулятор", 500, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(500, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    //</editor-fold>
}
