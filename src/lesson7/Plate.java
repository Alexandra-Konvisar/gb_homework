package lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(Cat c,int n) {
        int checkSize = food - n;
        if (checkSize < 0) {
            System.out.println("В тарелке не хватает еды (" + (n - food) + ")");
        } else {
            food = checkSize;
            c.setSatiety(true);
        }
    }
    public void addFood(int n){
        food+=n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
