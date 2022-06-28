package lesson_27_06_2022_composition.object;

public abstract class ElectronicDevice {
    private String name;
    private double weight;
    private static final String NONAME_STRING="unnamed";
    // все эл. устройства должны будут реализовать поведение: включить/выключить
    public abstract void on();

    public abstract void off();

    protected ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        this.name = name;
    }

    public ElectronicDevice(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    public static String checkString(String str) {
        if (str == null || str.equals("")) {
            return NONAME_STRING;
        }
        return str;
    }
    protected static void print(String str) {
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
