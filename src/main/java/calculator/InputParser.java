package calculator;

public class InputParser {
    private final Delimiter delimiter;

    public InputParser() {
        this.delimiter = new Delimiter();
    }

    public String parse(String inputData) {
        return delimiter.addDelimiter(inputData);
    }
}
