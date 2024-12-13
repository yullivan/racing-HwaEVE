package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    public static List<String> getCarNames( Scanner scanner){

        String carNamesInput = scanner.nextLine();
        List<String> carNames = new ArrayList<>();

        for (String name : carNamesInput.split(",")) {

            if (name.length() > 10) {
                System.out.println("[ERROR] 자동차 이름은 10자 이내여야 합니다.");
                return null;
            }
            carNames.add(name);
        }
        return carNames;
    }
}