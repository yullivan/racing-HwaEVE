package racing;

import java.util.Random;

class CarMoveFunction {
    private String name;
    private int distance;

    public CarMoveFunction(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void move() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        if (dice >= 3) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < distance; i++) {
            sb.append(" ️");
        }
        if (distance > 0) {
            sb.append("-");
        }
        return sb.toString();
    }
}