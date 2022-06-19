package homework_19_06_2022;



public class StartComputer {
    public static void main(String[] args) {
//        Computer comp = new Computer("IBM",
//                "wer",
//                "Россия",
//                "Япония","6456ПК",5.34,2047,150,0.3);
//        comp.setName("IBM");
//        comp.setFactoryNumber("");
//        comp.setProvider("Россия");
//        comp.setManufacturer("Япония");
//        comp.setView("6456ПК");
//        comp.setHdd(150);
//        Computer comp2=new Computer("BNT");
//        comp.on();
//        comp.load();
//        comp.off();
//        comp2.on();
//        System.out.println(comp.getFactoryNumber());
//        System.out.println(comp.getName());
//        System.out.println(comp.getRam()+" gb");
//        System.out.println(comp2.getName());
        Computer comp=new Computer();

        Computer comp3=new Computer("4");
        Computer comp4=new Computer("5");
        System.out.println("comp3 name = "+comp3.getName());
        System.out.println("comp4 name = "+comp4.getName());
        Computer tempComp;
        tempComp=comp3;
        comp3=comp4;
        comp4=tempComp;
        System.out.println("comp3 name = "+comp3.getName());
        System.out.println("comp4 name = "+comp4.getName());
    }
}
