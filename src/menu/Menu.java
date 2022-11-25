package menu;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private MenuChooseResult menuResult = new MenuChooseResult();
    private IMenuCommand buttonOne = new OptionStartGame(menuResult);
    private IMenuCommand buttonTwo = new OptionLoadGame(menuResult);
    private IMenuCommand buttonThree = new OptionEscapeGame(menuResult);
    private IMenuCommand buttonFour = new OptionSaveGame(menuResult);
    private MenuOption shortMenuOption = new MenuOption(buttonOne, buttonTwo, buttonThree);
    private MenuOption wholeMenuOption = new MenuOption(buttonOne, buttonTwo, buttonFour, buttonThree);

    public void shortGameMenu() {
        while (true) {
            System.out.println("<Стартовое меню>\nНажмите клавишу: \n 1 ➤ Начать игру \n 2 ➤ Загрузить игру \n 3 ➤ Выход из игры");
            int number = scanner.nextInt();

            if (number == 1) {
                shortMenuOption.gameGetStart();
                return;
            } else if (number == 2) {
                shortMenuOption.gameGetLoad();
                return;
            } else if (number == 3) {
                shortMenuOption.gameGetEscape();
                return;
            } else {
                System.out.println("Только клавиши 1, 2, 3!");
            }
        }
    }

    public void wholeGameMenu() {
        while (true) {
            System.out.println("<Игровое меню>\nНажмите клавишу: \n 1 ➤ Начать новую игру \n 2 ➤ Загрузить игру " +
                    "\n 3 ➤ Сохранить игру \n 4 ➤ Выход из игры");
            int number = scanner.nextInt();

            if (number == 1) {
                wholeMenuOption.gameGetStart();
                return;
            } else if (number == 2) {
                wholeMenuOption.gameGetLoad();
                return;
            } else if (number == 3) {
                wholeMenuOption.gameGetSave();
                return;
            } else if (number == 4) {
                wholeMenuOption.gameGetEscape();
                return;
            } else {
                System.out.println("Только клавиши 1, 2, 3, 4!");
            }
        }
    }

}
