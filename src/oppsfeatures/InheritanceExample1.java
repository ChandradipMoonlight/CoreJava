package oppsfeatures;

class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public String toString() {
        return ("No. of gears are " + gear +
                "\nand speed of bicycle is " + speed);
    }
}
class MountainBike extends Bicycle {
    public int seaHeight;
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        /* super keyword is used to call the parent class constructor.
         * gear and speed are two data member from parent class Bicycle hence to call the Bicycle
         * class constructor we used super keyword here.
         */
        seaHeight = startHeight;
    }
    public void setSeaHeight(int newValue) {
        seaHeight = newValue;
    }
    public String toString() {
        return (super.toString()+ "\nseaHeight is " + seaHeight);
        /*
        here super.toString() is used to call the toString method of parent class
         */
    }
}
public class InheritanceExample1 {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(5, 200, 26);
        System.out.println(mountainBike.toString());
        mountainBike.applyBreak(150);
        System.out.println(mountainBike);
    }
}
