package homework.week1.racingcar.view;

import homework.week1.racingcar.util.ResultStringUtil;

import java.util.Scanner;

public class GameInputView {
    private static final String INPUT_CAR_NAME_GUIDE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_RACING_NUMBER_GUIDE = "시도할 회수는 몇회인가요?";

    public static String inputCarName() {
        ResultStringUtil.printGuideStr(INPUT_CAR_NAME_GUIDE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String inputNumberOfRacing() {
        ResultStringUtil.printEmptyLine();
        ResultStringUtil.printGuideStr(INPUT_RACING_NUMBER_GUIDE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
