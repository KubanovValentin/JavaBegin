package homewoek_17_06_2022.all_object;

public class Computer {
    // свойства объекта Computer
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    private boolean cdReadable;// может ли считывать диск


    // сервис методы
    public void on() {
        print("я включился. Моя модель: " + getName());
    }

    public void off() {
        print("я выключился ");
    }

    public void load() {
        print("я загружаюсь. Мой объем жесткого диска равен: " + getHdd() + " Гб");
    }

    public void reboot() {
        print("я перезагружаюсь.");
    }

    public void readCD() {
        if (cdReadable) {
            print("Считываю диск");
        } else {
            print("Не могу считать диск, устройство не поддерживается!");
        }
    }


    private void print(String str) {
        System.out.println(str);
    }

    // гетеры и сетеры для свойств с проверками передаваемые значений
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {// если переданное имя не пустое и не null
            this.name = name;
        } else {
            System.out.println("Переданное значение name '" + name + "' не может быть пустым!");
        }
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        } else {
            System.out.println("Переданное значение ram " + ram + " не может быть отрицательным!");
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        if (hdd > 0) {
            this.hdd = hdd;
        } else {
            System.out.println("Переданное значение hdd " + hdd + " не может быть отрицательным!");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Переданное значение weight " + weight + " не может быть отрицательным!");
        }
    }


    public boolean iscdReadable() {
        return cdReadable;
    }

    public void setCdReadable(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }
}
