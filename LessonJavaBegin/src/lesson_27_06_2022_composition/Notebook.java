package lesson_27_06_2022_composition;

public class Notebook extends Computer{
    public Notebook() {}

    public Notebook(String name) {
        super(name);
    }

    public Notebook(String name, Ram ram, Hdd hdd, double weight, CDRom cdRom) {
        super(name, ram, hdd, weight, cdRom);
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
    public Ram getRam() {
        return super.getRam();
    }

    @Override
    public void setRam(Ram ram) {
        super.setRam(ram);
    }

    @Override
    public Hdd getHdd() {
        return super.getHdd();
    }

    @Override
    public void setHdd(Hdd hdd) {
        super.setHdd(hdd);
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
    public CDRom getCdRom() {
        return super.getCdRom();
    }

    @Override
    public void setCdRom(CDRom cdRom) {
        super.setCdRom(cdRom);
    }

    @Override
    public void writedCD() {
        super.writedCD();
    }
}
