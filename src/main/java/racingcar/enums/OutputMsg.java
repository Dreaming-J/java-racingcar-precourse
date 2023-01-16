package racingcar.enums;

public enum OutputMsg {
    LINE_BREAK("\n"),
    COLON(" : "),
    PROCESS("-"),
    COMMA(", "),
    OUTPUT_MSG_RESULT("실행 결과"),
    OUTPUT_MSG_WINNER("최종 우승자");

    private final String message;

    OutputMsg(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
