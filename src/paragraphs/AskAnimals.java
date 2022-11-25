package paragraphs;

public class AskAnimals extends Paragraph {

    private String text = Text.ASKANIMALS;
    private String paragraphName = ParagraphName.ASK_ANIMALS;
    private AskOwl askOwl = new AskOwl();
    private AskWolf askWolf = new AskWolf();

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
        return askOwl;
    }

    @Override
    public Paragraph getParagraphTwo() {
        return askWolf;
    }
}
