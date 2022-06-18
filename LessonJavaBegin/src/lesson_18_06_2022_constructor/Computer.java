package lesson_18_06_2022_constructor;

public class Computer {
    private String name;
    private String factoryNumber;
    private String provider;
    private String manufacturer;
    private String view;
    private double dimensions;
    private int ram;
    private int hdd;
    private double weight;

//    public Computer(String name) {
//        this.name = name;
//    }


    public Computer(String name,
                    String factoryNumber,
                    String provider,
                    String manufacturer,
                    String view,
                    double dimensions,
                    int ram,
                    int hdd,
                    double weight) {
        this.name = name;
        this.factoryNumber = factoryNumber;
        this.provider = provider;
        this.manufacturer = manufacturer;
        this.view = view;
        this.dimensions = dimensions;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getFactoryNumber() {
        if ((factoryNumber == null || factoryNumber.trim().equals(""))){
            return "ошибка!!!номер не введен!!!";
        }
        return factoryNumber;
    }

    public void setFactoryNumber(String newFactoryNumber) {
        this.factoryNumber = newFactoryNumber;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("переданное значение " + newRam + "не может быть отрицательное");
        }

    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int newHdd) {
        if (newHdd > 0) {
            this.hdd = newHdd;
        } else {
            System.out.println("переданное значение " + newHdd + "не может быть отрицательное");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWight) {
        this.weight = newWight;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String newProvider) {
        if (newProvider.equals("Китай")) {
            this.provider = newProvider;
        } else {
            System.out.println("поставщик - " + newProvider + " не может быть! Выберите поставщика - Китай");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        if (newManufacturer.equals("Япония")) {
            this.manufacturer = newManufacturer;
        } else {
            System.out.println("производителем может быть только: " + manufacturer);
        }
    }

    public String getView() {
        return view;
    }

    public void setView(String newView) {
        if (newView.equals("моноблок") || newView.equals("ПК")) {
            this.view = newView;
        } else{
            System.out.println("продукт должен быть - моноблок или ПК! Но не " + newView + ",пустая стока");
        }

    }

    public double getDimensions() {

        return dimensions;
    }

    public void setDimensions(double newDimensions) {

        this.dimensions = newDimensions;
    }


    public void on() {
        print("я включился. моя модель -   " + name);
    }

    public void off() {
        print("я выключился");
    }

    public void load() {
        print("я загружаюсь.мой жесткий диск = " + hdd + " гб");
    }
    private void print(String str){
        System.out.println(str);
    }
}
