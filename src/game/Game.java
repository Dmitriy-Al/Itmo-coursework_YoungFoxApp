package game;

import menu.Menu;
import paragraphs.Paragraph;

import java.io.*;

public class Game {

    private final String saveFolder = "C:/Users/admit/OneDrive/Рабочий стол/saved_game.txt ";
    private VariantChooser variantChoosers = new VariantChooser();
    private GameProcessStarter gameStarter = new GameProcessStarter();
    private Menu menu = new Menu();
    private Paragraph savedParagraph;


    public void gameBegin() {
        System.out.println("\n☛ Игра \"Лисёнок\" ☚\n");
        menu.shortGameMenu();
    }

    public void saveGame() {
        savedParagraph = variantChoosers.getChoseParagraph();

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(saveFolder);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(savedParagraph);
        } catch (IOException e) {
            System.out.println("Ошибка сохранения!");
            return;
        }
        System.out.println("\n<Игра сохранена>\n");
    }

    public void loadedSavedGame() {
        try (
                FileInputStream fileInputStream = new FileInputStream(saveFolder);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            gameStarter.setParagraph((Paragraph) objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Err");
        }
        gameStarter.startGameProcess();
    }

    public void gameEscape() {
        System.out.println("<Игра завершена>");
        Runtime.getRuntime().exit(0);
    }

}
