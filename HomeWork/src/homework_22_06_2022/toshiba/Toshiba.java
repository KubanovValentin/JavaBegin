package homework_22_06_2022.toshiba;

import homework_22_06_2022.object.Notebook;

public class Toshiba extends Notebook {

        // нельзя создать экземпляр, т.к. protected
        // вызывающий класс MyFirstProgram должен находиться в другом пакете
        protected Toshiba(String name) {
            // т.к. по-умолчанию переменная canWriteDvd = true, в super не передаем true
            super(name);
        }

    }