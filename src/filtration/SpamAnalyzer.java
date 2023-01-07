package filtration;

public class SpamAnalyzer extends KeywordAnalyzer implements  TextAnalyzer{
    public SpamAnalyzer(String[] keyWords){
        super(keyWords);
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}
