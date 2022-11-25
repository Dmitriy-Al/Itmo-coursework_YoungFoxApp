package paragraphs;

import java.util.TreeSet;

public class BelieveOwl extends Paragraph {

    private String text = Text.BELIEVEOWL;
    private String paragraphName = ParagraphName.BELIEVE_OWL;
    private SearchSquirrel searchSquirrel = new SearchSquirrel();
    private TryGetHoney tryGetHoney = new TryGetHoney();

    @Override
    public String getParagraphName() {
        return paragraphName;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Paragraph getParagraphOne() {
        return searchSquirrel;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return tryGetHoney;
    }
}
