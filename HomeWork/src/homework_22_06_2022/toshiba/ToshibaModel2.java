package homework_22_06_2022.toshiba;

public class ToshibaModel2 extends Toshiba{
    public ToshibaModel2(String name) {
        super(name);
    }
    @Override
    public void connect() {
        System.out.println("ToshibaModel2 connect();");
    }
    public void initializeBeforeConnect(){
        System.out.println("Model "+getName()+" initializing before connect...");
    }
}
