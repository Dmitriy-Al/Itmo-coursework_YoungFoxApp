package paragraphs;

public class FoxGoesSearch extends Paragraph {

    private String text = Text.FOXGOSERCH;
    private String paragraphName = ParagraphName.FOX_GO_SEARCH;
    private SearchSquirrel searchSquirrel = new SearchSquirrel();
    private AskAnimals askAnimals = new AskAnimals();

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
        return askAnimals;
    }
}
