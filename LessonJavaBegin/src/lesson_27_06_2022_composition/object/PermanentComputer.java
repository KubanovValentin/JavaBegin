package lesson_27_06_2022_composition.object;

public abstract class PermanentComputer extends Computer{
    // для этой переменной нет гетеров и сетеров, потому что значение всегда задается конструктором
    private boolean cdWritable = true;// по-умолчанию диски можно записывать

    private CDRom cdRom;

    public PermanentComputer(String name) {
        super(name);
    }

    public PermanentComputer(double weight, String name) {
        super(weight, name);
    }

    public PermanentComputer(String name, boolean cdWritable) {
        super(name);
        this.cdWritable = cdWritable;
        countObjects();
    }



    public PermanentComputer(double weight, String name, boolean cdWritable, CDRom cdRom, Hdd hdd, Ram ram) {
        super(weight, name);
        this.cdWritable = cdWritable;
        this.cdRom = cdRom;
        this.hdd = hdd;
        this.ram = ram;
        countObjects();
        on();
    }


    // метод записи диска - общий для всех дочерних классов
    // но его можно переопределить при необходимости
    public void writeDisc() {
        getCdRom().writeCD();
    }

    public void readDisc() {
        getCdRom().readCD();
    }

    public CDRom getCdRom() {
        if (cdRom==null) cdRom = new CDRom(cdWritable);
        return cdRom;
    }

}
