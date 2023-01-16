package racingcar.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static racingcar.enums.ErrorMsg.*;

public class DataTypeConverter {

    public List<String> convertStringToStrList(String input) {
        return Arrays.stream(input.split(","))
                .collect(Collectors.toList());
    }

    public int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_MOVE_COUNT_IS_INTEGER.get());
        }
    }
}
