package homework_26_06_2002_static.object;

public abstract class ElectronicDevice {
    private double weight;
    private String name;
    private static final String NONAME_STRING="unnamed";
    // все эл. устройства должны будут реализовать поведение: включить/выключить
    public abstract void on();
    public abstract void off();
    //конструктор
    protected ElectronicDevice() {
    }
    protected ElectronicDevice(String name, double weight) {
        this.name = checkString(name);
        this.weight = weight;
    }
    protected ElectronicDevice(String name) {
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
