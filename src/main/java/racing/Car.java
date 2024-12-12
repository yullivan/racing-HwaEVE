package racing;

import java.util.Random;

class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        Random random = new Random();
        if (random.nextInt(6) + 1 >= 3) {
            position++;
        }
    }
}