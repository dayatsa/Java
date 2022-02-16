public class App {
    public static void main(String[] args) throws Exception {

        /**
         * without interface Hero class
         */

        // Zilong zilong = new Zilong();
        // HeroUser dadang = new HeroUser(zilong);
 
        /**
         * interface hero class
         */
        //make hero object
        Hero zilong = new Zilong();
        Hero miya = new Miya();


        //make user object
        HeroUser dadang = new HeroUser(zilong);
        HeroUser dudung = new HeroUser(miya);

        dadang.runTheHeroForward();
        dadang.runTheHeroForward();
        dadang.runTheHeroForward();
        dadang.runTheHeroForward();

        dadang.runTheHeroBackward();
        dadang.runTheHeroBackward();
        dadang.runTheHeroBackward();

        dadang.makeHeroAttacking();

        dadang.makeHeroDefense(15);
        dadang.makeHeroDefense(25);
        dadang.makeHeroDefense(10);

        dudung.runTheHeroForward();
        dudung.runTheHeroForward();
        dudung.runTheHeroBackward();

        dudung.makeHeroAttacking();
        dudung.makeHeroDefense(20);
    }
}
