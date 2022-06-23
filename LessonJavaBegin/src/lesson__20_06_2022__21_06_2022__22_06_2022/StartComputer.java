package lesson__20_06_2022__21_06_2022__22_06_2022;

public class StartComputer {
    public static void main(String[] args) {
//        Computer comp=new Computer("IBM",
//               "wer",
//               "Россия",
//              "Япония","6456ПК",5.34,2047,150,0.3);

//        comp.on();
//        comp.getFactoryNumber();
//        comp.load();
//        comp.off();
//        System.out.println(comp.getFactoryNumber());
//        System.out.println(comp.getName());
//        System.out.println(comp.getRam()+" gb");
 //       Notebook notebook = new Notebook("mack123"); //21_06_2022
        Computer notebook = new Notebook("Computer Notebook");
        Computer comp=new Computer("Computer Computer");
//        Notebook not=new Notebook("Notebook Notebook");
       //notebook.setName("mack123");
       // notebook.on();
//        doSmth(notebook);
        doSmth(comp);

//        not.charging(comp);
//        notebook.charging(comp); нельзя сделать
    }

    public static void doSmth(Computer comp){
        if (comp instanceof Notebook){
            ((Notebook)comp).on();
            ((Notebook)comp).charging(comp);
        }else if(comp instanceof Computer){
            comp.on();
        }

    }


}
