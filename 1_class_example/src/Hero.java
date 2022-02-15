public class Hero {
    //atribut
    String name;
    int speed;
    int healthPoin;

    // method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    // method isDead
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
