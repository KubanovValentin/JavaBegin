package lesson_27_06_2022_composition.asus;

import lesson_27_06_2022_composition.object.Notebook;

public abstract class Asus extends Notebook {
    // нельзя создать экземпляр, т.к. protected
    // вызывающий класс MyFirstProgram должен находиться в другом пакете
    protected Asus(String name) {
        super(name, false);// запрещаем записывать диски
    }

    // все асусы будут печатать приветственное сообщение (можно при загрузке)
    public void printStartScreen(){
        print("Asus company. All rights reserved.");
    }
}
