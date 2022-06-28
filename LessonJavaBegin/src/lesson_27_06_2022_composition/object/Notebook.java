package lesson_27_06_2022_composition.object;

public abstract class Notebook extends PermanentComputer{
    public Notebook(String name) {
        super(name);
    }

    public Notebook(String name, boolean canWriteDvd) {
        super(name, canWriteDvd);
    }

    // для ноутбуков добавляетяс поведение работы от батареи (чего не может обычный компьютер)
    public abstract void workFromBattery();


    // можно для ноутбуков реализовать методы on(), off(), load()
    // и при необходимости переопределять в дочерних классах
    @Override
    public void load() {

        System.out.println(getName()+" loading");
    }

    @Override
    public void on() {
        getHdd().on();
        getRam().on();
        System.out.println(getName()+" on");
    }

    @Override
    public void off() {
        getHdd().off();
        getRam().off();
        System.out.println(getName()+" off");
    }

}
