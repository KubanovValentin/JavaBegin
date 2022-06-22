package homework_22_06_2022.asus;

import homework_22_06_2022.object.Notebook;

public class Asus extends Notebook {
    // нельзя создать экземпляр, т.к. protected
    // вызывающий класс MyFirstProgram должен находиться в другом пакете
    protected Asus(String name) {
        super(name, false);// запрещаем записывать диски
    }
}
