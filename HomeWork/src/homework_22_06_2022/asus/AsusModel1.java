package homework_22_06_2022.asus;

public class AsusModel1 extends Asus{
    public AsusModel1(String name) {
        super(name);
    }
    @Override
    public void connect() {
        System.out.println("AsusModel1 connect();");
    }
}
