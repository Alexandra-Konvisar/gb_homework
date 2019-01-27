public class lesson6 {
    public static void main(String[] args) {
        //Забег
        int l = 300;

        Cat c = new Cat();
        Dog d = new Dog();

        System.out.println("Пробежит ли собака " + l + " метров: " + d.run(l, d.runLength));
        System.out.println("Пробежит ли кошка " + l + " метров: " + c.run(l, c.runLength));

        System.out.println();

        //Заплыв

        int l2 = 15;

        Dog d3 = new Dog();
        d3.setSwimLength(30);

        System.out.println("Проплывет ли собака " + l2 + " метров: " + d3.swim(l2, d3.swimLength));

        System.out.println();

        //Прыжки

        double h = 2.5;

        Cat c3 = new Cat();
        c3.setJumpHeight(3);

        System.out.println("Прыгнет ли кошка на " + h + " метра: " + c3.jump(h, c3.jumpHeight));



    }
}
