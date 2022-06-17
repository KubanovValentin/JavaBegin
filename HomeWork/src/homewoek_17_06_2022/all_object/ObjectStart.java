package homewoek_17_06_2022.all_object;

public class ObjectStart {
    public static void main(String[] args) {
        Computer comp = new Computer();

        // различные варианты присваивания
        comp.setName("test name");// можно
        comp.setName(null);// нельзя!
        comp.setName("");// нельзя!
        comp.setHdd(2048);// можно
        comp.setHdd(-2048);// нельзя!

        comp.readCD();// здесь диск не считается
        comp.setCdReadable(true);// добавим устройство считывания
        comp.readCD();// теперь диск считается

        comp.on();
        comp.load();
        comp.off();
    }
}
