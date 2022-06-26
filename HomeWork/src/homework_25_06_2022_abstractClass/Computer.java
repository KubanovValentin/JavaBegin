package homework_25_06_2022_abstractClass;

public abstract class Computer extends ElectronicDevice{
    private int ram;
    private int hdd;

    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    // Computer раширяет поведение эл.устройства
    // теперь компьютеры умеют загружаться и соединяться с устройствами
    // конкретное поведение задается в конкретных моделях
    public abstract void connect();
    public abstract void load();


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
