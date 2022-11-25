package paragraphs;

public class FoxWaits extends Paragraph {

    private String text = Text.FOXWAITS;
    private String paragraphName = ParagraphName.FOX_WAITS;
    private HoneyForBear honeyForBear = new HoneyForBear();
    private FoxRests foxRests = new FoxRests();

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
        return honeyForBear;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return foxRests;
    }
}
