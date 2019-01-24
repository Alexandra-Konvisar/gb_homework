package lesson5;

public class Worker {
    String name;
    String surname;
    String patronymic;
    String post;
    String email;
    String phone;
    String salary;
    int age;

    //    public Worker() {
//        this.name = "Иван";
//        this.surname = "Иванович";
//        this.patronymic = "Иванов";
//        this.post = "Инженер";
//        this.email = "my@mail.ru";
//        this.phone = "495-123-45-67";
//        this.salary = "10000"+"руб.";
//        this.age = "33";
//    }
    public Worker(String surname, String name, String patronymic, String post, String email, String phone, String salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void Print(){
        System.out.println("ФИО: "+ this.name + " " +this.surname+ " " +this.patronymic);
        System.out.println("Должность: " + this.post);
        System.out.println("EMail: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Возраст: " + this.age);
    }
}
