package homework_26_06_2022_interface;

public abstract class AbstractElectronicDevice {
    private double weight;
    private String name;

    public AbstractElectronicDevice(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public AbstractElectronicDevice(String name) {
        this.name = name;
    }

    public AbstractElectronicDevice() {

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
