package homework_15_06_2022;

public class Bus {
    public String model;
    public int motor;
    public int places;

    public void drive() {
        System.out.println("автобус - " + model + " , c двигателем : " + motor + " и мест для пассажиров = " + places + " начинает движение.");
    }

    public void landing() {
        System.out.println("в автобус идет посадка пассажиров");
    }
}
