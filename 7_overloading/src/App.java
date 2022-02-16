public class App {
    public static void main(String[] args) throws Exception {
        Hero zilong = new Hero("Zilong", 35, 80);

        zilong.attack();
        zilong.attack(10);
    }
}
