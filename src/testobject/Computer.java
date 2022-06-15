package testobject;

public class Computer {
    public String name;
    public int ram;
    public int hdd;
    public double weight;

    public void on() {
        System.out.println("я включился. моя модель -   " + name);
    }

    public void off() {
        System.out.println("я выключился");
    }

    public void load() {
        System.out.println("я загружаюсь.мой жесткий диск = " + hdd + " гб");
    }
}
