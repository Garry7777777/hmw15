package filtration;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    private final String[] keywords;
    public KeywordAnalyzer(String[] keywords){
        this.keywords = keywords;
    }
    public Label processText(String text) {
        for (String kw : getKeywords())
            if (text.contains(kw)) return getLabel();
        return Label.OK;
    }
    protected String[] getKeywords (){
        return keywords;
    }
    protected abstract Label getLabel();
}

