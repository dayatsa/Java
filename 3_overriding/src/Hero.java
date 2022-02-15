public class Hero {
    //atribut
    String name;
    int power;
    int healthPoin;

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
}
