package paragraphs;

public class StealHoney extends Paragraph {

    private String text = Text.STEALHONEY;
    private String paragraphName = ParagraphName.STEAL_HONEY;

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
