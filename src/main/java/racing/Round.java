package racing;

import java.util.Scanner;

public class Round {
    public static int getTotalRounds(Scanner scanner) {
        System.out.print("몇 회를 시행할지 입력하세요: ");
        String input = scanner.nextLine();

// 숫자인지 확인

        if (isNumeric(input)) {
            int totalRounds = Integer.parseInt(input);
            if (totalRounds <= 0) {
                System.out.println("[ERROR] 시행 횟수는 1 이상이어야 합니다.");
                return -1;
            }
            return totalRounds;
        } else {
            System.out.println("[ERROR] 잘못된 입력입니다.");
            return -1;
        }
    }

// 숫자인지 확인하는 메소드

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

