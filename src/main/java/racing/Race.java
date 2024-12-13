package racing;

import java.util.ArrayList;
import java.util.List;

class Race {
    private List<Car> cars;
    private int totalRounds;

    public Race(List<String> carNames, int totalRounds) {
        this.cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        this.totalRounds = totalRounds;
    }

    public void start() {
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("(" + round + ")");
            for (Car car : cars) {
                System.out.print(car.getName() + " ");
                for (int i = 0; i < car.getPosition(); i++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            for (Car car : cars) {
                car.move();
            }
        }
    }

    public List<String> getWinners() {
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().getAsInt();
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}

