package lesson_27_06_2022_composition.main;

import lesson_27_06_2022_composition.asus.AsusModel1;
import lesson_27_06_2022_composition.asus.AsusModel2;
import lesson_27_06_2022_composition.toshiba.ToshibaModel1;

public class StartProgramm {
    public static void main(String[] args) {
        AsusModel1 asusModel1 = new AsusModel1("AsusModel1");
        AsusModel2 asusModel2 = new AsusModel2("AsusModel2");
        ToshibaModel1 toshibaModel1 = new ToshibaModel1("ToshibaModel1");
        int a=10;
        int b=15;
        int c=5;
        System.out.println(a+b+c);
    }
}
