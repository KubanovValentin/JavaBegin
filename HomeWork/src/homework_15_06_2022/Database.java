package homework_15_06_2022;

public class Database {
    public String title;
    public int memory;
    public void record(){
        System.out.println("в базу данных идет запись");
    }
    public void request(){
        System.out.println("в базу данных идет запрос");
    }
}
