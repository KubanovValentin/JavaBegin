package homework_26_06_2002_static.object;

import java.util.Date;

public abstract class Computer extends ElectronicDevice{
    private int ram;
    private int hdd;

    public static int compCount;// кол-во созданных объектов типа Computer
    public static Computer lastObject;// последний созданный объект

    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    // Computer раширяет поведение эл.устройства
    // теперь компьютеры умеют загружаться и соединяться с устройствами
    // конкретное поведение задается в конкретных моделях
    public abstract void connect();

    public abstract void load();

    public Computer() {
        countObjects();
    }

    public Computer(String name) {
        super(name);

        countObjects();

    }

    public Computer(String name, double weight) {
        super(name, weight);

        countObjects();

    }

    public Computer(String name, boolean cdWritable) {
        super(name);
        this.cdWritable = cdWritable;
        countObjects();
    }

    public Computer(String name, double weight, int ram, int hdd, boolean cdWritable) {
        super(name, weight);

        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;

        countObjects();

        on();
    }

    // ведет подсчет объектов
    private void countObjects() {
        compCount++;
        lastObject = this;
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
    public void reboot() {
        off();
        on();
        load();
    }

    // печать статистики
    public static void showInfo() {
//        print(ram);// ошибка, т.к. переменная ram нестатичная
        print("Total count: " + compCount);
        print("Last object: " + lastObject);
    }

    protected static void print(String str) {
        System.out.println("Computer class: "+str);
    }

    // присвоение уникального заводского имени с датой и временем
    public static String createFactoryName(String str) {
        return str + " " + new Date().toString() + " SOME INFORMATION";
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
