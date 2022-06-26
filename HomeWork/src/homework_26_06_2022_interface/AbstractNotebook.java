package homework_26_06_2022_interface;

public abstract class AbstractNotebook extends AbstractElectronicDevice implements Notebook{
    private int ram;
    private int hdd;

    public AbstractNotebook(String name) {
        super(name);
    }

    public AbstractNotebook(String name, boolean cdWritable) {
        super(name);
        this.cdWritable = cdWritable;
    }

    public AbstractNotebook(double weight, String name) {
        super(weight, name);
    }

    public AbstractNotebook(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public AbstractNotebook(int ram, int hdd, String name) {
        super(name);
        this.ram = ram;
        this.hdd = hdd;
    }

    public AbstractNotebook(int ram, int hdd, double weight, String name) {
        super(weight, name);
        this.ram = ram;
        this.hdd = hdd;
    }



    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    // метод записи диска - общий для всех дочерних классов
    // но его можно переопределить при необходимости
    public void writeDisc() {
        System.out.println("Объект " + this.getName());
        if (cdWritable) { // проверка, может ли привод записывать диски
            System.out.println("Запись диска...");
        } else {
            System.out.println("Невозможно записать диск. Привод не пишущий");
        }

    }

    // измененный метод перезагрузки
    // для перезагрузки сначала выключаем компьютер, затем включаем и загружаем
    public void reboot(){
        off();
        on();
        load();
    }

    // можно для ноутбуков реализовать методы on(), off(), load()
    // и при необходимости переопределять в дочерних классах
    @Override
    public void load() {
        System.out.println(getName()+" loading");
    }

    @Override
    public void on() {
        System.out.println(getName()+" on");
    }

    @Override
    public void off() {
        System.out.println(getName()+" off");
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
