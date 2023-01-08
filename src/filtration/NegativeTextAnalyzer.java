package filtration;
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    public NegativeTextAnalyzer(){
        super(new String[]{   ":(",   "=(",   ":|"  });
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
