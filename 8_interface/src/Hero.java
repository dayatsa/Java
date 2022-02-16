public interface Hero {
    int MAX_POSITION = 100;
    int MIN_POSITION = 0;

    void attack();
    void defense(int enemyPower);
    void moveForward();
    void moveBackward();
}