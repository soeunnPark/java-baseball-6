package baseball;

import java.util.*;
import java.util.stream.Stream;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import net.bytebuddy.pool.TypePool;

public class Application {


    public static void main(String[] args) {
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

        Judgement judgement = new Judgement();
        int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        System.out.println(count); //3

    }
}
