package racingcar.enums;

public enum ErrorMsg {
    ERROR_PREFIX("[ERROR] "),
    ERROR_MSG_CAR_NAME_IS_NOT_BLANK("자동차의 이름으로 공백은 가능하지 않습니다. 올바른 값으로 다시 입력해주세요."),
    ERROR_MSG_CAR_NAME_SIZE_IS_OVER_5("자동차의 이름은 5자 이하만 가능합니다. 올바른 값으로 다시 입력해주세요."),
    ERROR_MSG_MOVE_COUNT_IS_INTEGER("시도 회수는 숫자만 가능합니다. 올바른 값으로 다시 입력해주세요."),
    ERROR_MSG_MOVE_COUNT_IS_POSITIVE("시도 회수는 양수만 가능합니다. 올바른 값으로 다시 입력해주세요.");

    private final String message;

    ErrorMsg(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
