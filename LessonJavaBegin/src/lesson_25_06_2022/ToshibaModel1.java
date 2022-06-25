package lesson_25_06_2022;

public class ToshibaModel1 extends Toshiba implements Plansher,Phone{

    @Override
    public void openCD() {
        super.printMyModel();
        System.out.println("ToshibaModel1 overrided openCD");
    }

    @Override
    public void clodeCD() {
        System.out.println("ToshibaModel1 overrided clodeCD");
    }

    @Override
    public void navigateByScreen() {
        System.out.println("method tachscreen");
    }

    @Override
    public void call() {
        System.out.println("method call");
    }
}
