public class Animal {
    boolean run(int length, int maxLength){
        if (length <= maxLength) {
            return true;
        } else {
            return false;
        }
    }

    boolean jump(double height, double maxheight){
        if (height <= maxheight) {
            return true;
        } else {
            return false;
        }

    }

    boolean swim(int length, int maxLength){
        if (length <= maxLength) {
            return true;
        } else {
            return false;
        }

    }
}

class Dog extends Animal {
    int runLength;
    int swimLength;
    double jumpHeight;

    public Dog() {
        this.runLength = 500;
        this.swimLength = 10;
        this.jumpHeight = 0.5;
    }

    public Dog(int runLength, int swimLength, double jumpHeight) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.jumpHeight = jumpHeight;
    }

    public void setSwimLength(int swimLength) {
        this.swimLength = swimLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
class Cat extends Animal {
    int runLength;
    int swimLength;
    double jumpHeight;

    public Cat() {
        this.runLength = 200;
        this.swimLength = 0;
        this.jumpHeight = 2;

    }

    public Cat(int runLength, int swimLength, double jumpHeight) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.jumpHeight = jumpHeight;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public void setSwimLength(int swimLength) {
        this.swimLength = swimLength;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}