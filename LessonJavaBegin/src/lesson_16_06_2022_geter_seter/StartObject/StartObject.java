package lesson_16_06_2022_geter_seter.StartObject;

import lesson_16_06_2022_geter_seter.Object.Computer;

public class StartObject {
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
