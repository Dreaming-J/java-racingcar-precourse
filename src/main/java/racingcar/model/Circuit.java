package racingcar.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import racingcar.utils.RandomGenerator;

public class Circuit {

    private List<Car> cars;
    RandomGenerator randomGenerator = new RandomGenerator();

    public Circuit(List<String> carsName) {
        this.cars = new ArrayList<>();
        for (String carName : carsName) {
            this.cars.add(new Car(carName));
        }
    }

    public void moveCars() {
        for (Car car : this.cars) {
            car.move(randomGenerator.createRandomNumber());
        }
    }

    public List<String> calWinner() {
        List<String> winner = new ArrayList<>();

        int maxPosition = calMaxPosition();
        for (Car car : this.cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car.getName());
            }
        }

        return winner;
    }

    private int calMaxPosition() {
        return getCarsPosition().stream()
                .max(Comparator.comparing(x -> x))
                .get();
    }

    public List<String> getCarsName() {
        List<String> carsName = new ArrayList<>();

        for (Car car : cars) {
            carsName.add(car.getName());
        }

        return carsName;
    }

    public List<Integer> getCarsPosition() {
        List<Integer> carsPosition = new ArrayList<>();

        for (Car car : cars) {
            carsPosition.add(car.getPosition());
        }

        return carsPosition;
    }
}
