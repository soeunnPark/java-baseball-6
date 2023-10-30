package baseball;

import java.util.*;

import baseball.domain.NumberGenerator;
import baseball.domain.Referee;


public class Application {


    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
        Referee referee = new Referee();

        //0볼 3스트라이크 될 때까지 -> while문 필요
        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() { //정적메서드
        System.out.print("숫자를 입력해 주세요: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
