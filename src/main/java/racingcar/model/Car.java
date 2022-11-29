package racingcar.model;

public class Car {

    private final int MIN_MOVING_VALUE = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int number) {
        if (number >= MIN_MOVING_VALUE) {
            this.position++;
        }
    }
}
