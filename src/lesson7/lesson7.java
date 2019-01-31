package lesson7;

public class lesson7 {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 15);
//        Plate plate = new Plate(10);
//        System.out.println("Кот сыт ? " + cat.isSatiety());
//        plate.info();
//        cat.eat(plate);
//        plate.info();
//        System.out.println("Кот сыт ? " + cat.isSatiety());

        Plate plate = new Plate(20);
        Cat[] cats = new Cat[5];
        String[] catsName = {"tom", "rij", "red", "cot", "baton"};
        for (int i = 0; i <cats.length ; i++) {
            cats[i]=new Cat(catsName[i]);
        }
        for (Cat c:cats
             ) {
            System.out.println(c.getName() +"  сыт ? " + c.isSatiety());
            plate.info();
            c.eat(plate);
            plate.info();
            System.out.println(c.getName() +"  сыт ? " + c.isSatiety());
            System.out.println();


        }
    }
}


