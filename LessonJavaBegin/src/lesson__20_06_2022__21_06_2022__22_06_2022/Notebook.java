package lesson__20_06_2022__21_06_2022__22_06_2022;

public class Notebook extends Computer{
    public Notebook(String name) {
        super(name);
    }
    @Override
    public void on() {
        super.on();
        print("Notebook  включился в сеть. моя модель -   " + getName());
    }

    public void charging(Computer comp){
        System.out.println("заряжается ноутбук");
    }
    //    public Notebook(String name,
//                    String factoryNumber,
//                    String provider,
//                    String manufacturer,
//                    String view,
//                    double dimensions,
//                    int ram,
//                    int hdd,
//                    double weight) {
//        super(name, factoryNumber, provider, manufacturer, view, dimensions, ram, hdd, weight);
//    }

//    public static void main(String[] args) {
//
//    }
}
