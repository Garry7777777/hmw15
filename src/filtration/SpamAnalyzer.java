package filtration;
public class SpamAnalyzer extends KeywordAnalyzer {
    public SpamAnalyzer(String[] keyWords){
        super(keyWords);
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}
