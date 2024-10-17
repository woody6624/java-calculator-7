package calculator;

public class Validator {
    public boolean checkPositiveInt(String inputString) {
        // 공백 데이터에 대하여 처리
        if (inputString.isEmpty()) {
            return true;
        }
        // 음수일 경우 허용하지 않습니다.
        if (inputString.charAt(0) == '-') {
            return false;
        }
        if (inputString.charAt(0) == '+') {
            // Character의 isDigit를 통해 모든 문자가 숫자인지 체크
            return inputString.substring(1).chars().allMatch(Character::isDigit);
        }
        // Character의 isDigit를 통해 모든 문자가 숫자인지 체크
        return inputString.chars().allMatch(Character::isDigit);
    }
}
