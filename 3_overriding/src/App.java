public class App {
    public static void main(String[] args) throws Exception {
        
        Mage cyclops = new Mage();
        cyclops.name = "Cyclops";
        cyclops.power = 25;
        cyclops.healthPoin = 80;

        cyclops.attack();
    }
}
