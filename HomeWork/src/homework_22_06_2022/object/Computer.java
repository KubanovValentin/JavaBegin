package homework_22_06_2022.object;

public class Computer extends ElectronicDevice{
    private int ram;
    private int hdd;
    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    public Computer() {
    }

    public Computer(String name) {
        super(name);
    }

    public Computer(String name, double weight) {
        super(name, weight);
    }

    public Computer(String name, boolean cdWritable) {
        super(name);
        this.cdWritable = cdWritable;
    }

    public Computer(String name, double weight, int ram, int hdd, boolean cdWritable) {
        super(name, weight);

        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;

        on();
    }

    public void writeDisc() {
        System.out.println("Объект " + this.getName());
        if (cdWritable) { // проверка, может ли привод записывать диски
            System.out.println("Запись диска...");
        } else {
            System.out.println("Невозможно записать диск. Привод не пишущий");
        }

    }

    public void load() {
        System.out.println("Computer load();");
    }

    @Override
    public void on() {
        System.out.println("Computer on();");
    }

    @Override
    public void off() {
        System.out.println("Computer off();");
    }

    public void reboot() {
        print("Computer reboot();");
    }

    protected void print(String str) {
        System.out.println(str);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
