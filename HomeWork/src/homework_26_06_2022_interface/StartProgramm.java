package homework_26_06_2022_interface;

public class StartProgramm {
    public static void main(String[] args) {
        Asus asusModel1 = new AsusModel1("AsusModel1");
        Asus asusModel2 = new AsusModel2("AsusModel2");
        Toshiba toshiba1 = new ToshibaModel1("Toshiba1");
        Toshiba toshiba2 = new ToshibaModel2("Toshiba2");
        useNotebook(asusModel1);
        useNotebook(asusModel2);
        useNotebook(toshiba1);
        useNotebook(toshiba2);

    }

    private static void useNotebook(Notebook notebook){
        notebook.useTouchPad();
        notebook.workFromBattery();
    }

}
