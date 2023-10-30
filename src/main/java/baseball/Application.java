package baseball;

import java.util.*;

import baseball.domain.Referee;


public class Application {


    public static void main(String[] args) {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        System.out.println(result);
    }
}
