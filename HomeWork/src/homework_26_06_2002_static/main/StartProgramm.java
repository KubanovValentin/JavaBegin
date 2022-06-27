package homework_26_06_2002_static.main;

import homework_22_06_2022.asus.AsusModel2;
import homework_22_06_2022.toshiba.ToshibaModel1;
import homework_26_06_2002_static.asus.AsusModel1;
import homework_26_06_2002_static.object.Computer;

public class StartProgramm {
    public static void main(String[] args) {
        AsusModel1 asusModel1 = new AsusModel1("AsusModel1");
        AsusModel2 asusModel2 = new AsusModel2("AsusModel2");
        ToshibaModel1 toshibaModel1 = new ToshibaModel1("ToshibaModel1");

        Computer.showInfo();

        System.out.println(AsusModel1.createFactoryName(asusModel1.getName()));

        System.out.println(Computer.compCount);
        System.out.println(Computer.lastObject);

        asusModel1.workFromBattery();
    }
}
