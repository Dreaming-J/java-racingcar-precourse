package racingcar;

import racingcar.controler.GameController;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.gameInit();
    }
}
