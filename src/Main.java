import filtration.*;
public class Main {

    public static void main(String[] args) {

        TooLongTextAnalyzer tooLongAnalyzer= new TooLongTextAnalyzer();
        NegativeTextAnalyzer negativeAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"рекламу"});
        TextAnalyzer[] setOfTextAnalyzers = {spamAnalyzer, negativeAnalyzer, tooLongAnalyzer};

        String negative = "Анализируем негатив :(";
        String pozitive = "Анализируем позитив :)";
        String tooLong  = "Анализируем    длинный   текст";
        String spam = "Анализируем рекламу";
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