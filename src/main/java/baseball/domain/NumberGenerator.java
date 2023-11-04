package baseball.domain;

import java.util.*;

public class NumberGenerator {

    private static final int MAX_OF_RANDOM_NUMBER_SIZE=3;
    private static final int MAX_OF_RANDOM_NUMBER = 9;
    public List<Integer> createRandomNumbers() {
        //3개의 숫자가 담길 때까지 -> while문 사용: false가 될 때까지 계속 반복
        //만약 이미 존재하는 숫자라면 담지 않는다.
        //만약 존재하지 않는 숫자라면 담는다.
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < MAX_OF_RANDOM_NUMBER_SIZE) {
            int number = new Random().nextInt(MAX_OF_RANDOM_NUMBER) + 1;
            if (numbers.contains(number)) {
                continue;
            } else {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
