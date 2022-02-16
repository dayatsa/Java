
public abstract class Hero {
    // private atribut
    private int power;
    private int healthPoin;

    public void setPower(int power){
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public void setHealthPoin(int healthPoin){
        this.healthPoin = healthPoin;
    }

    public int getHealthPoin() {
        return this.healthPoin;
    }

    // abstract method
    abstract void ultimate();
}