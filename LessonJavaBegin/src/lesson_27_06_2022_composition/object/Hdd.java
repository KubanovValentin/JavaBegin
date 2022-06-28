package lesson_27_06_2022_composition.object;

public class Hdd extends ElectronicDevice{
    private int size;// задается только в конструкторе, нельзя поменять после создания

    public Hdd(String name) {
        super(name);
    }

    public Hdd(int size) {
        this.size = size;
    }

    public Hdd(double weight, String name) {
        super(weight, name);
    }

    public Hdd(int size, String name) {
        super(name);
        this.size = size;
    }

    public Hdd(double weight, String name, int size) {
        super(weight, name);
        this.size = size;
    }



    @Override
    public void on() {
        print("Hdd initializing...");
    }

    @Override
    public void off() {
        print("Hdd off");

    }

    public void saveData(){
        print("saving data...");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
