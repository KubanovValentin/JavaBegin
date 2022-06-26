package homework_25_06_2022;

public abstract class Asus extends Notebook{

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
