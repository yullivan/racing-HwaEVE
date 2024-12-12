package racing;

import java.util.ArrayList;
import java.util.List;

class RaceTrack {
    private int totalRound;
    private List<Car> cars;

    public RaceTrack(int totalRound, List<Car> cars) {
        this.totalRound = totalRound;
        this.cars = cars;
    }

    public void moveCar(Car car, int step) {
        if (step >= 4) {
            car.moveForward();
        }
    }

    public void printStatus() {
        for (Car car : cars) {
            System.out.print(car.getName());
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printWinner() {
        int maxPosition = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
                winners.clear();
                winners.add(car.getName());
            } else if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }

        System.out.print("우승자는 ");
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if (i < winners.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("입니다!");
    }

    public int getTotalRound() {
        return totalRound;
    }
}
