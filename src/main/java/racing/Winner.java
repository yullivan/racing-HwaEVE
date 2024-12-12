package racing;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public static List<String> getWinners(List<String> carNames, List<Integer> positions) {
        List<String> winners = new ArrayList<>();
        int maxPosition = positions.stream().max(Integer::compareTo).get();
        for (int i = 0; i < carNames.size(); i++) {
            if (positions.get(i) == maxPosition) {
                winners.add(carNames.get(i));
            }
        }
        return winners;
    }

    public static void printWinners(List<String> winners) {
        System.out.println("\n우승자는 " + String.join(", ", winners) + "!");
    }
}