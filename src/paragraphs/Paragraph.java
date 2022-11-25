package paragraphs;

import java.io.Serializable;

public abstract class Paragraph implements Serializable {

    private String text;
    private String paragraphName;

    public abstract String getParagraphName();

    public abstract String getText();

    public abstract Paragraph getParagraphOne();

    public abstract Paragraph getParagraphTwo();


}
