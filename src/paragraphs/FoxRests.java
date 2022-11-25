package paragraphs;

public class FoxRests extends Paragraph {

    private String text = Text.FOXRESTS;
    private String paragraphName = ParagraphName.FOX_RESTS;

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
        return null;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return null;
    }
}
