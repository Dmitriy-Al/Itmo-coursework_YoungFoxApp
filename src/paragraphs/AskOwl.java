package paragraphs;

public class AskOwl extends Paragraph {

    private String text = Text.ASKOWL;
    private String paragraphName = ParagraphName.ASK_OWL;
    private BelieveOwl believeOwl = new BelieveOwl();
    private SearchSquirrel searchSquirrel = new SearchSquirrel();

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
        return believeOwl;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return searchSquirrel;
    }
}
