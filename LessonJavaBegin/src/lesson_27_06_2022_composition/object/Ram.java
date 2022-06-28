package lesson_27_06_2022_composition.object;

public class Ram extends ElectronicDevice{
    private int size;// задается только в конструкторе, нельзя поменять после создания
    public Ram(String name) {
        super(name);
    }
    public Ram(int size) {
        this.size = size;
    }
    public Ram(double weight,String name) {
        super(weight,name);
    }
    public Ram(int size, String name) {
        super(name);
        this.size = size;
    }
    public Ram(int size, String name, double weight) {
        super(weight,name);
        this.size = size;
    }
    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
