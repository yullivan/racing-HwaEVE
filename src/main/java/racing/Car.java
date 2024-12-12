package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    public static String car; {

        Scanner scanner = new Scanner(System.in);

        // 자동차 이름 입력 받기
        System.out.print("자동차 이름을 입력하세요 (쉼표로 구분): ");
        String carNamesInput = scanner.nextLine();

        // 잘못된 입력 검증 및 자동차 이름 리스트 생성
        List<String> carNames = new ArrayList<>();
        while (true) {
            if (carNamesInput.isEmpty()) {
                break;
            }
            for (String name : carNamesInput.split(",")) {
                // 자동차 이름 길이 검사
                if (name.length() > 10) {
                    System.out.println("[ERROR] 자동차 이름은 10자 이내여야 합니다.");
                    continue; // 다음 이름으로 넘어감
                }
                carNames.add(name);
            }
        }
    }
}