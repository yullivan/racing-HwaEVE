package racing;

import java.util.Random;

class Dice {
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
