package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        1. Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число. При каждой попытке
        компьютер должен сообщить больше ли указанное пользователем число чем
        загаданное, или меньше. После победы или проигрыша выводится запрос –
         «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        //whatNumber();

        /*
        2 * Создать массив из слов String[] words = {"apple", "orange", "lemon",
        "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
        "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
         */
        String[] fruits = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадайте какой фрукт или овощь загадал конпьютер. Используйте только строчные буквы.");

        whatWord(fruits);
    }

    private static void whatWord(String[] fruits) {
        Random random = new Random();
        int index = random.nextInt(fruits.length);
        String rndFruit = fruits[index];
        String fruit="";
        System.out.println(rndFruit);
        while (!fruit.equals(rndFruit)){
            System.out.println("Введите название фрукта:");
            fruit = sc.nextLine();
            if (fruit.equals(rndFruit)) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы ошиблись :( Попробуйте еще раз.");
                System.out.println("Подсказка :" + checkChar(fruit, rndFruit));
            }
        }


    }

    private static String checkChar(String fruit, String rndFruit) {
        String hint = "";
        for (int i = 0; i < 15; i++) {
            if(fruit.length() > i) {
                hint += (fruit.charAt(i) == rndFruit.charAt(i)) ? fruit.charAt(i) : "#";
            } else {
                hint+="#";
            }

    }
        return hint;
    }

    private static void whatNumber() {
        Random random = new Random();
        int answer = random.nextInt(10);

        System.out.println("Угадайте число от 0 до 9 с трех попыток");
        for (int i = 1; i <=3 ; i++) {
            System.out.printf("Попытка %d: ", i);

            int n = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);

            if(answer < n) System.out.println("Загазанное число меньше указанного");
            if(answer > n) System.out.println("Загазанное число больше указанного");
            if(answer == n) {
                System.out.println("Вы угадали!");
                repeat();
            }
            if(i==3){
                System.out.println("Количество попыток исчерпано. Вы проиграли.");
                repeat();
            }
        }
    }

    private static void repeat() {
        int x;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            x = sc.nextInt();
            if(x==1) whatNumber();
            if(x==0) break;
        } while (x < 0 || x > 1);

    }

    private static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

}
