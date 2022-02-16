
  
public class Hero {
    // private atribut
    private String name;
    private int power;
    private int healthPoin;

    // constructor
    public Hero(String name, int power, int healthPoin){
        this.name = name;
        this.power = power;
        this.healthPoin = healthPoin;
    }

    // method attack
    void attack(){
        System.out.println(this.name +" is attacking...");
        System.out.println("Power: "+ this.power);
    }

    //overloading method attack
    void attack(int speed) {
        System.out.println(this.name +" is attacking with " + speed + " speed");
        System.out.println("Power: "+ this.power);
    }

    // method isDead
    boolean isDead(){
        if(this.healthPoin <= 0) return true;
        return false;
    }

    void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Power: "+ this.power);
        System.out.println("Health Poin: " + this.healthPoin);
    }
}