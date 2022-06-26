package homework_25_06_2022;

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
