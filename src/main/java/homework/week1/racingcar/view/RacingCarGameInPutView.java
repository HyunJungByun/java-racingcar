package homework.week1.racingcar.view;

import java.util.Scanner;

public class RacingCarGameInPutView {

    private static final String INPUT_CAR_NAME_GUIDE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_RACING_NUMBER_GUIDE = "시도할 회수는 몇회인가요?";

    private RacingCarGameInPutView(){}

    public static RacingCarGameInPutView newInstance() {
        return new RacingCarGameInPutView();
    }

    public String inputCarName() {
        printGuideStr(INPUT_CAR_NAME_GUIDE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String inputNumberOfRacing() {
        printEmptyLine();
        printGuideStr(INPUT_RACING_NUMBER_GUIDE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printGuideStr(String guideStr) {
        System.out.println(guideStr);
    }

    private void printEmptyLine() {
        System.out.println();
    }
}
