package homework_15_06_2022;

public class Main {
    public static void main(String[] args) {
    Bus bus=new Bus();
    bus.model="МАЗ";
    bus.motor=6;
    bus.places=20;
    bus.landing();
    bus.drive();
        System.out.println("-------------------------------------------");
    Database database=new Database();
    database.title="База Данных";
    database.memory=100;
    database.request();
    database.record();
        System.out.println("-------------------------------------------");
    Dog dog=new Dog();
    dog.name="Шарик";
    dog.age=1;
    dog.weight=50;
    dog.breed="буль";
    dog.barks();
    dog.run();
    }
}
