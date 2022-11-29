package racingcar.view;

import java.util.List;

import static racingcar.enums.OutputMsg.*;

public class OutputView {

    public void printResultMsg() {
        System.out.println(LINE_BREAK.get() + OUTPUT_MSG_RESULT.get());
    }

    public void printMoveProcess(List<String> name, List<Integer> position) {
        int size = name.size();
        for (int i = 0; i < size; i++) {
            System.out.print(name.get(i) + COLON.get());
            for (int j = 0; j < position.get(i); j++) {
                System.out.print(PROCESS.get());
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void printWinner(List<String> winner) {
        System.out.print(OUTPUT_MSG_WINNER.get() + COLON.get());

        System.out.print(winner.get(0));
        for (int i = 1; i < winner.size(); i++) {
            System.out.print(COMMA.get() + winner.get(i));
        }
    }
}
