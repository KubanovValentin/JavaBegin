package homework_26_06_2022_interface;

public interface Computer extends ElectronicDevice{
    // Computer раширяет поведение эл.устройства
    // теперь компьютеры умеют загружаться и соединяться с устройствами
    // конкретное поведение задается в конкретных моделях
    void connect();
    void load();

}
