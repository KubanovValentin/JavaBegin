package lesson_27_06_2022_composition.asus;

public class AsusModel2 extends Asus{
    public AsusModel2(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel2 connect();");
    }

    @Override
    public void workFromBattery() {
        print("AsusModel2 working from battery");
    }
}
