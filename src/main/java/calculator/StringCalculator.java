package calculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    private Delimiter delimiter;
    private Validator validator;

    public StringCalculator() {
        this.delimiter = new Delimiter();
        this.validator = new Validator();
    }

    public int add(String inputData) {
        // 입력 데이터를 파싱하여 유효값만 리스트에 추가
        String parsedInput = delimiter.addDelimiter(inputData);
        String tmpDelimiter = delimiter.getDelimiters();
        List<String> numbers = Arrays.stream(parsedInput.split(tmpDelimiter)).toList();
        System.out.println(numbers);
        int sum = 0;
        for (String number : numbers) {
            //System.out.println(number + "\n");
            if (!validator.checkPositiveInt(number)) {
                throw new IllegalArgumentException("");
            }
            // 문자열을 정수로 파싱하여 합산
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
