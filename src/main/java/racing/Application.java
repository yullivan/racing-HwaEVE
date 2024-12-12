package racing;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 자동차 이름 입력 받기
        List<String> carNames = Car.getCarNames(scanner);
        if (carNames == null) {
            return;
        }

        // 시행 횟수 입력 받기
        int totalRounds = Round.getTotalRounds(scanner);
        if (totalRounds <= 0) {
            return;
        }

        // 자동차 경주 시뮬레이션
        List<Integer> positions = Game.initializePositions(carNames.size());
        Game.runRace(carNames, positions, totalRounds, random);

        // 우승자 발표
        List<String> winners = Winner.getWinners(carNames, positions);
        Winner.printWinners(winners);
    }
}