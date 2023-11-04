package baseball.controller;

import baseball.domain.NumberGenerator;
import baseball.service.Judgement;
import baseball.service.Referee;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final Judgement judgement;
    private final Referee referee;

    public Game() {
        judgement = new Judgement();
        referee = new Referee();
    }

    public static List<Integer> askNumbers() { //정적메서드
        List<Integer> numbers = new ArrayList<>();
        System.out.print("숫자를 입력해 주세요: ");
        String input = InputView.getInput();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

    public static boolean askRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int input = Integer.parseInt(InputView.getInput());

        if(input == 1) {
            return true;
        }
        else {
            System.out.println("게임 종료");
            return false;
        }
    }


    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();

        //0볼 3스트라이크 될 때까지 -> while문 필요
        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        if(askRestartGame()) restartGame();

    }

    public void restartGame() {
        startGame();
    }


}
