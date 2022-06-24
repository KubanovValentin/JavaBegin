package homework_22_06_2022.printer;

import homework_22_06_2022.object.ElectronicDevice;

public class Printer extends ElectronicDevice {
    private boolean colorPrint = false;// цветной или черно-белый принтер (по-умолчанию черно-белый)

    public Printer() {
    }

    public Printer(String name) {
        super(name);
    }

    public Printer(String name, boolean colorPrint) {
        super(name);
        this.colorPrint = colorPrint;
    }

    public Printer(String name, double weight, boolean colorPrint) {
        super(name, weight);
        this.colorPrint = colorPrint;
    }

    @Override
    public void on() {
        System.out.println("Printer on();");
    }

    @Override
    public void off() {
        System.out.println("Printer off();");
    }

    // печатает текст на формате бумаги
    public void print(PaperFormat paperFormat, String text) {
        System.out.println("Длина строки для печати: " + text.length());

        // если длина текста подходит для данного формата бумаги - печатаем
        if (text.length() <= paperFormat.getLength()) {
            System.out.println("Печать текста " + text + " на формате бумаги " + paperFormat.getName());
        } else {// если длина не подходит

            // ищем нужный формат
            PaperFormat properPaperFormat = getPaperFormat(text.length());

            if (properPaperFormat != null) {
                System.out.println("Неверный формат бумаги " + paperFormat + ".\nНеоходимо использовать формат " + properPaperFormat.getName());
            } else {
                System.out.println("Не существует нужного формата бумаги");
            }
        }
        System.out.println();

    }

    // по длине текста определяет нужный формат бумаги
    private PaperFormat getPaperFormat(int textLength) {
        for (PaperFormat paper : PaperFormat.values()) {
            if (textLength <= paper.getLength()) {
                return paper;
            }
        }
        return null;
    }

    // печатает все доступные форматы бумаги
    public void printPaperTypes() {
        for (PaperFormat paper : PaperFormat.values()) {
            System.out.println("Формат печати: " + paper.getName() + ", длина текста: " + paper.getLength());
        }
        System.out.println();
    }

    public boolean isColorPrint() {
        return colorPrint;
    }

    public void setColorPrint(boolean colorPrint) {
        this.colorPrint = colorPrint;
    }


}
