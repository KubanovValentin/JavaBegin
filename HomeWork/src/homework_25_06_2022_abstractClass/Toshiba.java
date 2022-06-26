package homework_25_06_2022_abstractClass;

public abstract class Toshiba extends Notebook{

    // нельзя создать экземпляр, т.к. protected
    // вызывающий класс MyFirstProgram должен находиться в другом пакете
    protected Toshiba(String name) {
        // т.к. по-умолчанию переменная canWriteDvd = true, в super не передаем true
        super(name);
    }

    // все тошибы должны реализовать поведение для подсветки клавиатуры
    public abstract void lightKeyboard();
}
