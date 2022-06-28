package lesson_27_06_2022_composition.object;

public class CDRom extends ElectronicDevice{
    private String name;
    private double speed;
    private boolean cdWritable;

    public CDRom() {
    }

    public CDRom(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }

    public CDRom(String name, double speed, boolean cdWritable) {
        this.name = name;
        this.speed = speed;
        this.cdWritable = cdWritable;
    }

    public void writeCD() {
        if (cdWritable) { // проверка, может ли привод записывать диски
            System.out.println("Запись диска...");
        } else {
            System.out.println("Невозможно записать диск. Привод не пишущий");
        }
    }

    public void openCD() {
        System.out.println("openCD()");
    }

    public void closeCD() {
        System.out.println("closeCD()");
    }

    public void readCD() {
        System.out.println("readCD()");
    }

    //<editor-fold defaulted="collapsed" desc="гетеры и сетеры">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }
    //</editor-fold>

    @Override
    public void on() {
        print("CDRom on");
    }

    @Override
    public void off() {
        print("CDRom off");
    }
}
