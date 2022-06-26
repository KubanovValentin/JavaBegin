package homework_26_06_2022_interface;

public class AsusModel2 extends AbstractNotebook implements Asus{
    public AsusModel2(String name) {
        super(name, false);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel2 connect();");
    }

    @Override
    public void workFromBattery() {
        print("AsusModel2 working from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("AsusModel2 using touchpad");
    }

    @Override
    public void printStartScreen() {
        System.out.println("AsusModel2 printStartScreen");
    }
}
