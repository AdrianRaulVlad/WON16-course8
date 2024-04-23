package inheritance;

public class Bike {

    private int speed;

    public void increaseSpeed(int amount) {
        if (this.speed + amount < 0) {
            System.out.println("Speed can not be smaller than 0");
            return;
        }
        this.speed += amount;
    }

    public void stop() {
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }
}
