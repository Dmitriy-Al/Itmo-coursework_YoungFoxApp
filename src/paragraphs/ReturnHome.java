package paragraphs;

public class ReturnHome extends Paragraph {

    private String text = Text.RETURNHOME;
    private String paragraphName = ParagraphName.RETURN_HOME;

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
