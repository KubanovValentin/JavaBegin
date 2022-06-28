package lesson_27_06_2022_composition.asus;

public class AsusModel1 extends Asus{
    public AsusModel1(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel1 connect();");
    }

    @Override
    public void workFromBattery() {
        print("AsusModel1 can't work from battery");
    }
}
