package homework_26_06_2022_interface;

public class ToshibaModel1 extends AbstractNotebook implements Toshiba{
    public ToshibaModel1(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("ToshibaModel1 connect();");
    }

    @Override
    public void lightKeyboard() {
        print("Keyborad without light");
    }


    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel1 slow working from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("ToshibaModel1 using touchpad");
    }
}
