package lesson_25_06_2022;

public class StartProgram {
    public static void main(String[] args) {
        Toshiba t = new Toshiba() {
            @Override
            public void openCD() {
                System.out.println("t openCD");
            }

            @Override
            public void clodeCD() {
                System.out.println("t clodeCD");
            }
        };
        Toshiba toshiba=new ToshibaModel1();

        toshiba.openCD();
        toshiba.clodeCD();

        t.openCD();
        t.clodeCD();

    }
}
