package racingcar.controler;

import racingcar.controler.InputControler;
import racingcar.model.Circuit;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {

    InputControler inputControler = new InputControler();
    Circuit circuit;
    OutputView outputView = new OutputView();

    public void gameInit() {
        List<String> carsName = inputControler.inputRacingcarName();
        circuit = new Circuit(carsName);

        gameStart();
    }

    public void gameStart() {
        int moveCount = inputControler.inputMoveCount();

        outputView.printResultMsg();
        for (int i = 0; i < moveCount; i++) {
            circuit.moveCars();
            outputView.printMoveProcess(circuit.getCarsName(), circuit.getCarsPosition());
        }

        gameEnd();
    }

    public void gameEnd() {
        List<String> winner = circuit.calWinner();
        outputView.printWinner(winner);
    }
}
