package homework_25_06_2022_abstractClass;

public abstract class ElectronicDevice {
    private double weight;
    private String name;

    // все эл. устройства должны будут реализовать поведение: включить/выключить
    public abstract void on();
    public abstract void off();

    protected ElectronicDevice() {
    }

    protected ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    protected ElectronicDevice(String name) {
        this.name = name;
    }


    protected void print(String str) {
        System.out.println(str);
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
