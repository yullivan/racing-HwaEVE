package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static List<Integer> initializePositions(int carCount) {
        // 각 자동차의 초기 위치를 0으로 설정
        List<Integer> positions = new ArrayList<>(carCount);
        for (int i = 0; i < carCount; i++) {
            positions.add(0);
        }
        return positions;
    }

    public static void runRace(List<String> carNames, List<Integer> carPositions, int totalRounds, Random random) {
        String[] carEmojis = {"️", "", ""}; // 다양한 자동차 이모지 추가 가능
        int round = 1;
        boolean isRaceFinished = false;

        while (!isRaceFinished && round <= totalRounds) {
            System.out.println("(" + round + ")");
            for (int i = 0; i < carNames.size(); i++) {
                System.out.print(carNames.get(i) + " " + carEmojis[i % carEmojis.length]); // 이모지 번갈아가며 사용
                for (int j = 0; j < carPositions.get(i); j++) {
                    System.out.print("-");
                }
                if (carPositions.get(i) == totalRounds) {
                    System.out.print("");
                    isRaceFinished = true;
                }
                System.out.println();
            }

            // 다음 라운드 진행
            for (int i = 0; i < carPositions.size(); i++) {
                if (carPositions.get(i) < totalRounds) {
                    int dice = random.nextInt(6) + 1;
                    if (dice >= 3) {
                        carPositions.set(i, carPositions.get(i) + 1);
                    }
                }
            }
            round++;
        }
    }
}
