package paragraphs;

public class TryGetHoney extends Paragraph {

    private String text = Text.TRYGETHONEY;
    private String paragraphName = ParagraphName.TRY_GET_HONEY;
    private FoxWaits foxWaits = new FoxWaits();
    private StealHoney stealHoney = new StealHoney();

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
        return foxWaits;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return stealHoney;
    }
}
