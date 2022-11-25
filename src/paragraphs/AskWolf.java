package paragraphs;

public class AskWolf extends Paragraph {

    private String text = Text.ASKWOLF;
    private String paragraphName = ParagraphName.ASK_WOLF;
    private ReturnHome returnHome = new ReturnHome();
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
        return returnHome;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return searchSquirrel;
    }
}
