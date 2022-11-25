package paragraphs;

public class FoxStoryStarter extends Paragraph {

    private String text = Text.FOXSTORYSTARTER;
    private String paragraphName = ParagraphName.FOX_STORY_STARTER;

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
        ReturnHome returnHome = new ReturnHome();
        return returnHome;
    }

    @Override
    public Paragraph getParagraphTwo() {
        FoxGoesSearch foxGoesSearch = new FoxGoesSearch();
        return foxGoesSearch;
    }

}
