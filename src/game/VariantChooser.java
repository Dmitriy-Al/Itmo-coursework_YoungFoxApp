package game;

import menu.Menu;
import paragraphs.Paragraph;

import java.util.Scanner;

public class VariantChooser {

    private static Paragraph choseParagraph;
    private int variant;
    private Menu menu;
    private Scanner scanner = new Scanner(System.in);

    protected void setVariantChooser(Paragraph paragraph) {
        while (true) {
            variant = scanner.nextInt();
            if (variant == 1) {
                this.choseParagraph = paragraph.getParagraphOne();
                break;
            } else if (variant == 2) {
                this.choseParagraph = paragraph.getParagraphTwo();
                break;
            } else if (variant == 3) {
                menu = new Menu();
                menu.wholeGameMenu();
                break;
            } else {
                System.out.println("Только клавиши 1, 2, 3!");
            }
        }
    }

    protected Paragraph getChoseParagraph() {
        return choseParagraph;
    }

}
