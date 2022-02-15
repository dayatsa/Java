public class App {
    public static void main(String[] args) throws Exception {
        
        Hero zilong = new Hero("Zilong", 30, 100);
        zilong.info();

        zilong.setName("Miya");
        zilong.info();

        System.out.println("Hero Power: " + zilong.getPower());
    }
}
