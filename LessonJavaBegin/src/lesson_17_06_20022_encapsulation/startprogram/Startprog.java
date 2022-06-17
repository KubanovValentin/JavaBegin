package lesson_17_06_20022_encapsulation.startprogram;

import lesson_17_06_20022_encapsulation.Computer;

public class Startprog {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setName("IBM");
        comp.setFactoryNumber("");
        comp.setProvider("Россия");
        comp.setManufacturer("Япония");
        comp.setView("6456ПК");
        comp.setHdd(150);
        comp.on();
        comp.load();
        comp.off();
        System.out.println(comp.getFactoryNumber());
    }
}
