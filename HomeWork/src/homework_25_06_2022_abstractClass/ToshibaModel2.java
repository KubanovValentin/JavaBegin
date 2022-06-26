package homework_25_06_2022_abstractClass;

public class ToshibaModel2 extends Toshiba{
    public ToshibaModel2(String name) {
        super(name);
    }

    @Override
    public void connect() {
        print("ToshibaModel2 connect();");
    }

    // метод, который нужно выполнить перед подключением (connect())
    // для демонстрации полиморфизма в классе Monitor в методе connectDevice
    public void initializeBeforeConnect(){
        print("Model "+getName()+" initializing before connect...");
    }

    @Override
    public void lightKeyboard() {
        print("ToshibaModel2 keyborad lightning");
    }

    @Override
    public void workFromBattery() {
        print("ToshibaModel2 different working from battery");
    }
}
