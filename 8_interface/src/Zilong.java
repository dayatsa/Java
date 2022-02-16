public class Zilong implements Hero {

    private int power;
    private int shield;
    private int healthPoin;
    private int position;

    public Zilong() {
        // set initial variable
        this.power = 30;
        this.shield = 5;
        this.healthPoin = 100;
        this.position = 0;
    }

    @Override
    public void attack() {
        System.out.println("Zilong attacking with " + this.power + " power");
    }

    @Override
    public void defense(int enemyPower) {
        int reducedHealthPoin = enemyPower - this.shield;
        this.healthPoin = this.healthPoin - reducedHealthPoin;
        System.out.println("Zilong defense");
        System.out.println("Reduced Health Poin: " + reducedHealthPoin);
        System.out.println("Health Poin: " + healthPoin);
    }

    @Override
    public void moveForward() {
        if (this.position >= MAX_POSITION) {
            System.out.println("Position maximum");
        } else {
            this.position += 10;
            System.out.println("Current position: " + this.position);
        }
    }

    @Override
    public void moveBackward() {
        if (this.position <= MIN_POSITION) {
            System.out.println("Position minimum");
        } else {
            this.position -= 10;
            System.out.println("Current position: " + this.position);
        }
    }
}
