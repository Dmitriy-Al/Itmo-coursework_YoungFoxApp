package paragraphs;

public class HoneyForBear extends Paragraph {

    private String text = Text.HONEYFORBEAR;
    private String paragraphName = ParagraphName.HONEY_FOR_BEAR;
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
        return searchSquirrel;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return returnHome;
    }
}
