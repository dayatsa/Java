public class Mage extends Hero {

    @Override
    void attack() {
        System.out.println(name +" is attacking with magic...");
        System.out.println("Power: "+ power);
    }
}
