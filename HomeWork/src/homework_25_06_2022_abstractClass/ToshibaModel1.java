package homework_25_06_2022_abstractClass;

public class ToshibaModel1 extends Toshiba{
    public ToshibaModel1(String name) {
        super(name);
    }

    @Override
    public void connect() {
        print("ToshibaModel1 connect();");
    }

    @Override
    public void lightKeyboard() {
        print("Keyborad without light");
    }

    @Override
    public void workFromBattery() {
        print("ToshibaModel1 slow working from battery");
    }

}
