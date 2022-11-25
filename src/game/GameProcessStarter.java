package game;

import paragraphs.FoxStoryStarter;
import paragraphs.Paragraph;

public class GameProcessStarter {

    private Game gameOver;
    private VariantChooser variantChooser = new VariantChooser();
    private Paragraph paragraph = new FoxStoryStarter();

    public void startGameProcess() {
        while (true) {
            try {
                System.out.println(paragraph.getParagraphName());
                System.out.println(paragraph.getText());
                System.out.println("клавиша 1 ➠ " + paragraph.getParagraphOne().getParagraphName() +
                        "\nклавиша 2 ➠ " + paragraph.getParagraphTwo().getParagraphName() + "\nклавиша 3 ➠ выход в меню");
                variantChooser.setVariantChooser(paragraph);
                paragraph = variantChooser.getChoseParagraph();
            } catch (NullPointerException e) {
                gameOver = new Game();
                gameOver.gameEscape();
            }
        }
    }

    protected void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

}
