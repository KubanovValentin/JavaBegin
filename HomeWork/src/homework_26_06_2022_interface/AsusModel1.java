package homework_26_06_2022_interface;

public class AsusModel1 extends AbstractNotebook implements Asus{
    public AsusModel1(String name) {
        super(name, false);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel1 connect();");
    }

    @Override
    public void workFromBattery() {
        print("AsusModel1 can't work from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("AsusModel1 using touchpad");
    }

    @Override
    public void printStartScreen() {
        System.out.println("AsusModel1 printStartScreen");
    }
}
