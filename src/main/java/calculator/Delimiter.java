package calculator;

public class Delimiter {
    private String default_delimiters = ",|:";

    public String addDelimiter(String inputData) {
        StringBuilder delimiters = new StringBuilder(default_delimiters);

        if (inputData.startsWith("//")) {
            int newLineIndex = inputData.indexOf("\\n");

            // '\n'이 없다면 에러 -> 커스텀 구분자 형식에 어긋남
            if (newLineIndex == -1) {
                throw new IllegalArgumentException("입력 에러 //뒤에 오는 구분자 형식에 어긋납니다.");
            }

            char customDelimiter = inputData.charAt(2);
            //System.out.println("커스텀 구분자" + customDelimiter);
            // 빈 구분자에 대한 에러 처리
            if (customDelimiter == '\\') {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
            // 구분자가 숫자인지 체크
            if (Character.isDigit(customDelimiter)) {
                throw new IllegalArgumentException("숫자는 구분자가 될 수 없습니다.");
            }
            // 커스텀 구분자를 추가
            delimiters.append("|").append(customDelimiter);
            default_delimiters = delimiters.toString();
            // 구분자를 제외한 나머지 문자열 반환
            return inputData.substring(5);
        } else {
            // 변경사항이 없으므로 받은 그대로 리턴
            return inputData;
        }
    }

    public String getDelimiters() {
        return default_delimiters;
    }

}
