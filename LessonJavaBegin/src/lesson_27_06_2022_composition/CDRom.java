package lesson_27_06_2022_composition;

public class CDRom {
    private String name;
    private double speed;
    private boolean cdWritable;

    public void wrieCD(){
        System.out.println("wrieCD");
    }
    public void openCD(){
        System.out.println("openCD()");
    }
    public void closeCD(){
        System.out.println("closeCD()");
    }
    public void readCD(){
        System.out.println("readCD()");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }
}
