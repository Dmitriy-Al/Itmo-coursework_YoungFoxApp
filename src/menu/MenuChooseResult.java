package menu;

import game.Game;
import game.GameProcessStarter;


public class MenuChooseResult {

    private GameProcessStarter gameStart = new GameProcessStarter();
    private Game game;

    public void startGame() {
        gameStart.startGameProcess();
    }

    public void loadGame() {
        game = new Game();
        game.loadSavedGame();
    }

    public void saveGame() {
        game = new Game();
        game.saveGame();
    }

    public void escapeGame() {
        game = new Game();
        game.gameEscape();
    }

}