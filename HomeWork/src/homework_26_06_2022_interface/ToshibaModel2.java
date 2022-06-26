package homework_26_06_2022_interface;

public class ToshibaModel2 extends AbstractNotebook implements Toshiba{
    public ToshibaModel2(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("ToshibaModel2 connect();");
    }

    // метод, который нужно выполнить перед подключением (connect())
    // для демонстрации полиморфизма в классе Monitor в методе connectDevice
    public void initializeBeforeConnect(){
        System.out.println("Model "+getName()+" initializing before connect...");
    }

    @Override
    public void lightKeyboard() {
        print("ToshibaModel2 keyboard lightning");
    }

    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel2 different working from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("ToshibaModel2 using touchpad");
    }
}
