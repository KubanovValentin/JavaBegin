package myfirstprogram;

import testobject.Computer;

public class MyFirstProgram {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.name = "IBM";
        comp.hdd = 350;
        comp.on();
        comp.load();
        comp.off();
    }
}
