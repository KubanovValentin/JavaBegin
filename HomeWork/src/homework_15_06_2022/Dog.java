package homework_15_06_2022;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public int weight;

    public void run() {
        System.out.println("собака по кличке " + name + " бегает");
    }

    public void barks() {
        System.out.println("собака не гавкает по причине - порода " + breed);
    }
}
