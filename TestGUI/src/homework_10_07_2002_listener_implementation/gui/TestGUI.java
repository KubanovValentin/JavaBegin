package homework_10_07_2002_listener_implementation.gui;


import com.jtattoo.plaf.smart.SmartLookAndFeel;
import homework_10_07_2002_listener_implementation.listeners.CalcButtonActionListener;
import homework_10_07_2002_listener_implementation.listeners.CalcTextFieldFocusListener;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
    public static final String INPUT_CHISLO = "введите число";

    private MyJButton btnAdd;
    private MyJButton btnSubtract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;
    private MyJButton btnClear;

    private JLabel labelChislo1;
    private JLabel labelChislo2;
    private JLabel labelResult;

    private MyJTextField jtxtChislo1;
    private MyJTextField jtxtChislo2;
    private MyJTextField jtxtResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;

    private MyJFrame frame;


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);
        TestGUI testGUI=new TestGUI();
        testGUI.createLabels();
        testGUI.createTextFields();
        testGUI.createButtons();
        testGUI.createPanels();
        testGUI.createFrame();

    }

    //<editor-fold defaultstate="collapsed" desc="create GUI components">

    private void createLabels() {
        labelChislo1 = new JLabel("Число 1");
        labelChislo2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields() {
        jtxtChislo1 = new MyJTextField(INPUT_CHISLO, 10);
        jtxtChislo2 = new MyJTextField(INPUT_CHISLO, 10);

        jtxtResult = new MyJTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);

        addTextFieldListeners();

    }

    private void createButtons() {
        btnAdd = new MyJButton("Сложение");
        btnSubtract = new MyJButton("Вычитание");
        btnDivide = new MyJButton("Деление");
        btnMultiply = new MyJButton("Умножение");
        btnClear=new MyJButton("Очистка");
        addButtonListeners();
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyJPanel("panel3", 100, 100);
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
        panel3.add(btnClear);

    }

    private void createFrame() {
        frame = new MyJFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
    private static boolean numeralOrNot(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int commaCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '.') {
                commaCount++;
            }
            if ((!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != '-') || commaCount > 1) {
                return false;
            }
        }

        return true;
    }
    //</editor-fold>


    //<editor-fold defaultstate="collapsed" desc="create listeners">

    private void addButtonListeners() {
        CalcButtonActionListener bl = new CalcButtonActionListener(jtxtChislo1, jtxtChislo2, jtxtResult);

        btnAdd.addActionListener(bl);
        btnSubtract.addActionListener(bl);
        btnMultiply.addActionListener(bl);
        btnDivide.addActionListener(bl);
    }

    private void addTextFieldListeners() {
        jtxtChislo1.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo1));
        jtxtChislo2.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo2));
    }

    //</editor-fold>
}
