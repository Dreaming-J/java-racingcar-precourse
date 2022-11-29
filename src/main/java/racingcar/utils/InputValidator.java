package racingcar.utils;

import static racingcar.enums.ErrorMsg.*;

import java.util.List;

public class InputValidator {

    private final int MAX_CAR_NAME_SIZE = 5;
    private final int MIN_MOVE_COUNT_VALUE = 1;

    public void validateRacingcarName(List<String> carsName) {
        if (hasBlankName(carsName)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_CAR_NAME_IS_NOT_BLANK.get());
        }

        if (hasCarNameSizeIsOver5(carsName)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_CAR_NAME_SIZE_IS_OVER_5.get());
        }
    }

    private boolean hasBlankName(List<String> carsName) {
        return carsName.contains("");
    }

    private boolean hasCarNameSizeIsOver5(List<String> carsName) {
        for (String carName : carsName) {
            if (carName.length() > MAX_CAR_NAME_SIZE) {
                return true;
            }
        }

        return false;
    }

    public void validateMoveCount(int moveCount) {
        if (isNotPositive(moveCount)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_MOVE_COUNT_IS_POSITIVE.get());
        }
    }

    private boolean isNotPositive(int moveCount) {
        return moveCount < MIN_MOVE_COUNT_VALUE;
    }
}
