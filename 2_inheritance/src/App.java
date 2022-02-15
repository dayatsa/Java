public class App {
    public static void main(String[] args) throws Exception {
        Mage eudora = new Mage();
        eudora.name = "Eudora";
        eudora.power = 15;
        eudora.magicPower = 30;
        eudora.healthPoin = 80;

        eudora.attack();
        eudora.magicAttack();

        Support estes = new Support();
        estes.name = "Estes";
        estes.power = 10;
        estes.healthPoin = 100;

        estes.attack();
        estes.healing();
    }
}
