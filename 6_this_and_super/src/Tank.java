public class Tank extends Hero{
    // atribut
    String name;
    int power;
    int healthPoin;
    int shield;

    public Tank(String name, int power, int healthPoin, int shield) {
        this.name = name;
        this.power = power;
        this.healthPoin = healthPoin;
        this.shield = shield;
    }

    void info() {
        System.out.println("Name: " + super.name);
        System.out.println("Power: "+ super.power);
        System.out.println("Health Poin: " + super.healthPoin);
        System.out.println("Shield: " + this.healthPoin);
    }
}
