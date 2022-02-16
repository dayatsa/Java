public class HeroUser {

    /**
     * without interface hero class
     */
    // private Zilong hero;

    // public HeroUser(Zilong hero) {
    //     this.hero = hero;
    // }

    /**
     * interface hero class
     */
    private Hero hero;

    public HeroUser(Hero hero) {
        this.hero = hero;
    }

    void makeHeroAttacking() {
        this.hero.attack();
    }

    void makeHeroDefense(int enemyPower) {
        this.hero.defense(enemyPower);
    }

    void runTheHeroForward() {
        this.hero.moveForward();
    }

    void runTheHeroBackward() {
        this.hero.moveBackward();
    }
}
