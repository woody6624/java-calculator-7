package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("단어를 입력하시오: ");
        String inputString = Console.readLine();
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add(inputString);
        System.out.println("결과 : " + result);
        Console.close();
    }
}