package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {
    private static final int RANDOM_LOWER_INCLUSIVE = 0;
    private static final int RANDOM_UPPER_INCLUSIVE = 9;

    public int createRandomNumber() {
        return Randoms.pickNumberInRange(RANDOM_LOWER_INCLUSIVE, RANDOM_UPPER_INCLUSIVE);
    }
}
