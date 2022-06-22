package homework_22_06_2022.object;

public class ElectronicDevice {
    private double weight;
    private String name;

    protected ElectronicDevice() {
    }

    protected ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    protected ElectronicDevice(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("ElectronicDevice on();");
    }

    public void off() {
        System.out.println("ElectronicDevice off();");
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
