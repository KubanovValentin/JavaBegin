package homework_22_06_2022.main;
import homework_22_06_2022.object.Computer;
import homework_22_06_2022.asus.AsusModel1;
import homework_22_06_2022.printer.PaperFormat;
import homework_22_06_2022.printer.Printer;
import homework_22_06_2022.toshiba.ToshibaModel1;
import homework_22_06_2022.toshiba.ToshibaModel2;

//public class MyFirstProgram {
//    public static void main(String[] args) {
//
//        ToshibaModel1 toshiba1 = new ToshibaModel1("T1");
//        ToshibaModel2 toshiba2 = new ToshibaModel2("T2");
//
//        AsusModel1 asus1 = new AsusModel1("A1");
//        AsusModel1 asus2 = new AsusModel1("A2");
//
//        toshiba1.writeDisc();
//        asus1.writeDisc();
//
//
//        // нельзя создавать экземпляры этих классов!
////        Toshiba t1 = new Toshiba("asdasd");
////        Asus a1 = new Asus();
//
//
//    }
//}
public class MyFirstProgram {
    public static void main(String[] args) {

        testPrinter();

    }

    private static void testPrinter(){
        // дополнительное задание к 6 уроку: печать принтера на заданных форматах бумаги
        Printer printer = new Printer();
        printer.printPaperTypes();

        printer.print(PaperFormat.A5, "1111111111111111");
        printer.print(PaperFormat.A4, "000000000000000000000");
        printer.print(PaperFormat.A3, "4555");
    }
}
