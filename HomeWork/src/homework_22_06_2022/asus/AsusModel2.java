package homework_22_06_2022.asus;

public class AsusModel2 extends Asus{
    public AsusModel2(String name) {
        super(name);
    }
    @Override
    public void connect() {
        System.out.println("AsusModel2 connect();");
    }
}
