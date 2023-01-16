package racingcar.view;

import static racingcar.enums.InputMsg.*;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readRacingcarName() {
        System.out.println(INPUT_MSG_RACINGCAR_NAME.get());

        return Console.readLine();
    }

    public String readMoveCount() {
        System.out.println(INPUT_MSG_MOVE_COUNT.get());

        return Console.readLine();
    }
}
