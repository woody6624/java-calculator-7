package calculator;

public class Delimiter {
    private String default_delimiters = ",|:";

    public String addDelimiter(String inputData) {
        StringBuffer delimiters = new StringBuffer(default_delimiters);
        if (inputData.startsWith("//")) {
            char customDelimiter = inputData.charAt(2);
            // 숫자로 된 구분자 혹은 구분자가 아예 없을떄 에러
            if (Character.isDigit(customDelimiter) || customDelimiter == '\\') {
                throw new IllegalArgumentException("잘못된 구분자 타입입니다.");
            }
            delimiters.append("|").append(customDelimiter);
        }
        // 추가한 구분자를 포함한 구분자에 대한 정보를 리턴
        return delimiters.toString();
    }
}
