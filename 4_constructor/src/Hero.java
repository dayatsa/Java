public class Hero {
    //atribut
    String name;
    int power;
    int healthPoin;

    // constructor
    public Hero(String name, int power, int healthPoin){
        this.name = name;
        this.power = power;
        this.healthPoin = healthPoin;
    }

    // method attack
    void attack(){
        System.out.println(name +" is attacking...");
        System.out.println("Power: "+ power);
    }

    // method isDead
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }

    void info() {
        System.out.println("Name: " + name);
        System.out.println("Power: "+ power);
        System.out.println("Health Poin: " + healthPoin);
    }
}
