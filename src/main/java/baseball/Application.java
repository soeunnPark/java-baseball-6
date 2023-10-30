package baseball;
import java.util.*;
import java.util.stream.Stream;

import baseball.domain.NumberGenerator;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import net.bytebuddy.pool.TypePool;

public class Application {


    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);

    }
}
