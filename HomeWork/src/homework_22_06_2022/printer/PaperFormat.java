package homework_22_06_2022.printer;

public enum PaperFormat {
    // типы форматов бумаги

    A5(10, "A5"),
    A4(15, "A4"),
    A3(20, "A3");

    private int length;
    private String name;

    // создаем только гетеры, без сетеров, т.к. значения задаем через конструктор
    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    // конструктор для задания имени и длины текста
    private PaperFormat(int length, String name) {
        this.length = length;
        this.name = name;
    }
}
