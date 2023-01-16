package racingcar.controler;

import racingcar.utils.InputValidator;
import racingcar.view.InputView;
import racingcar.utils.DataTypeConverter;

import java.util.List;

public class InputControler {

    InputValidator inputValidator = new InputValidator();
    InputView inputView = new InputView();
    DataTypeConverter dataTypeConverter = new DataTypeConverter();

    public List<String> inputRacingcarName() {
        try {
            String tempCarsName = inputView.readRacingcarName();
            List<String> carsName = dataTypeConverter.convertStringToStrList(tempCarsName);
            inputValidator.validateRacingcarName(carsName);

            return carsName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputRacingcarName();
        }
    }

    public int inputMoveCount() {
        try {
            String tempMoveCount = inputView.readMoveCount();
            int moveCount = dataTypeConverter.convertStringToInt(tempMoveCount);
            inputValidator.validateMoveCount(moveCount);

            return moveCount;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputMoveCount();
        }
    }
}
