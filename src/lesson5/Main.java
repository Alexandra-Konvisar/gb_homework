package lesson5;

public class Main {
    public static void main(String[] args) {
        //Worker w = new Worker();

        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Сидоров", "Сергей", "Сергеевич", "Менеджер", "sss@mail.ru", "495-123-45-68", "12000", 44);
        persArray[1] = new Worker("Петров", "Петр", "Петрович", "Директор", "ppp@mail.ru", "495-123-45-55", "50000", 53);
        persArray[2] = new Worker("Иванов", "Иван", "Иванович", "", "iii@mail.ru", "495-123-45-67", "10000", 33);
        persArray[3] = new Worker("Карась", "Виталий", "Сергеевич", "Курьер", "kvs@mail.ru", "495-123-45-33", "5000", 22);
        persArray[4] = new Worker("Котов", "Сергей", "Генадьевич", "Менеджер", "ksg@mail.ru", "495-123-45-45", "12000", 50);

        for (Worker pers:persArray){
            if(pers.age > 40) pers.Print();
            System.out.println();
        }
    }
}
