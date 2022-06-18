package lesson_18_06_2022_constructor;



public class StartComputer {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM",
                "wer",
                "Россия",
                "Япония","6456ПК",5.34,2047,150,0.3);
//        comp.setName("IBM");
//        comp.setFactoryNumber("");
//        comp.setProvider("Россия");
//        comp.setManufacturer("Япония");
//        comp.setView("6456ПК");
//        comp.setHdd(150);
        comp.on();
        comp.load();
        comp.off();
        System.out.println(comp.getFactoryNumber());
        System.out.println(comp.getName());
        System.out.println(comp.getRam()+" gb");
    }
}
