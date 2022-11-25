package paragraphs;

public class SearchSquirrel extends Paragraph {

    private String text = Text.SEARCHSQUIRREL;
    private String paragraphName = ParagraphName.SEARCH_SQUIRREL;

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
