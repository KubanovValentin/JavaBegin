package lesson_27_06_2022_composition;

public class Computer {
    private String name;
    private Ram ram;
    private Hdd hdd;
    private double weight;
  //  private CDRom cdRom=new CDRom();
  private CDRom cdRom;

    public Computer(){}

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, Ram ram, Hdd hdd, double weight, CDRom cdRom) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.cdRom = cdRom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public CDRom getCdRom() {
        return cdRom;
    }

    public void setCdRom(CDRom cdRom) {
        this.cdRom = cdRom;
    }
    public void writedCD(){
        if (cdRom==null) cdRom=new CDRom();
        cdRom.wrieCD();
    }
}
