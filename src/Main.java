import filtration.*;
import filtration.TextAnalyzer.Label;
public class Main {
    public static void main(String[] args) {

        TooLongTextAnalyzer tooLongAnalyzer= new TooLongTextAnalyzer();
        NegativeTextAnalyzer negativeAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"реклам"});

        TextAnalyzer[] setOfTextAnalyzers = {spamAnalyzer, negativeAnalyzer, tooLongAnalyzer};

        String negative = "негатив :(";
        String pozitive = "позитив :)";
        String tooLong  = "слишком длинный текст";
        String spam = "текст рекламы ";
 //       String [] testComments = {negative, tooLong, spam, pozitive} ;

        System.out.println( tooLongAnalyzer.processText(tooLong) +"  "+ tooLongAnalyzer.processText(pozitive));
        System.out.println( negativeAnalyzer.processText(negative) +"  "+ negativeAnalyzer.processText(pozitive));
        System.out.println( spamAnalyzer.processText(spam) +"  "+ spamAnalyzer.processText(pozitive));
        System.out.println();

        System.out.println( checkLabels(negative, setOfTextAnalyzers));
        System.out.println( checkLabels(pozitive, setOfTextAnalyzers));

    }
   public static Label checkLabels(String text, TextAnalyzer[] setTextAnalyzers) {
       for (TextAnalyzer ta : setTextAnalyzers)
           if (ta.processText(text) != Label.OK) return ta.processText(text);
       return Label.OK;
   }

}