package filtration;
public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength = 15;
    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)  return Label.TOO_LONG;
        return Label.OK;
    }
}
