package lesson_27_06_2022_composition.object;

import java.util.Date;

public abstract class Computer extends ElectronicDevice{
    protected Ram ram = new Ram(2048, "Intel");
    protected Hdd hdd = new Hdd(512, "Fujitsu");
    public static int compCount;// кол-во созданных объектов типа Computer
    public static Computer lastObject;// последний созданный объект

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

    public Computer(double weight, String name) {
        super(weight, name);
        countObjects();
    }



    // ведет подсчет объектов
    protected void countObjects() {
        compCount++;
        lastObject = this;
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

    // такой же метод, как и в классе ElectronicDevice (для тестирования, какой из методов будет вызываться)
    protected static void print(String str) {
        System.out.println("Computer class: " + str);
    }

    // присвоение уникального заводского имени с датой и временем
    public static String createFactoryName(String str) {
        return str + " " + new Date().toString() + " SOME INFORMATION";
    }

    public Ram getRam() {
        if (ram == null) {
            ram = new Ram(2048, "Intel");
        }
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        if (hdd == null) {
            hdd = new Hdd(512, "Toshiba");
        }
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }
}
