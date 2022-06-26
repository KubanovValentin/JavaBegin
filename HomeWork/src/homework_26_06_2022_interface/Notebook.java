package homework_26_06_2022_interface;

public interface Notebook extends Computer{
    // для ноутбуков добавляется поведение работы от батареи (чего не может обычный компьютер)
    void workFromBattery();
    void useTouchPad();
}
