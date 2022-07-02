package homework_2_07_2022;

public class TestGUI {
    public static void main(String[] args) {
        MyJButton button1=new MyJButton("кнопка");

        MyJPanel panel=new MyJPanel("панель",100,100,button1);
        MyJFrame frame=new MyJFrame("Frame",500,400,panel);

    }

}
