package filtration;

public abstract class KeywordAnalyzer implements TextAnalyzer{

    private final String[] keyWords;

    public KeywordAnalyzer(String[] keyWords){
        this.keyWords = keyWords;
    }
    public Label processText(String text) {
        for (String kw : getKeywords())
            if (text.contains(kw)) return getLabel();
        return Label.OK;
    }
    protected String[] getKeywords (){
        return keyWords;
    }
    protected abstract Label getLabel();

}

