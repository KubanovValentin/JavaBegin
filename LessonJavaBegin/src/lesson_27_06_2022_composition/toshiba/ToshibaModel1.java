package lesson_27_06_2022_composition.toshiba;

public class ToshibaModel1 extends Toshiba{
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

}
