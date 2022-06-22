package homework_22_06_2022.printer;

import homework_22_06_2022.object.ElectronicDevice;

public class Printer extends ElectronicDevice {
    private boolean colorPrint = false;// цветной или черно-белый принтер (по-умолчанию черно-белый)

    public Printer() {
    }

    public Printer(String name) {
        super(name);
    }

    public Printer(String name, boolean colorPrint) {
        super(name);
        this.colorPrint = colorPrint;
    }

    public Printer(String name, double weight, boolean colorPrint) {
        super(name, weight);
        this.colorPrint = colorPrint;
    }

    @Override
    public void on() {
        System.out.println("Printer on();");
    }

    @Override
    public void off() {
        System.out.println("Printer off();");
    }

    public boolean isColorPrint() {
        return colorPrint;
    }

    public void setColorPrint(boolean colorPrint) {
        this.colorPrint = colorPrint;
    }
}
