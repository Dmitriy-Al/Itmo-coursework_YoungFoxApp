package menu;

public class MenuOption {

    private IMenuCommand gameStart;
    private IMenuCommand gameLoad;
    private IMenuCommand gameEscape;
    private IMenuCommand gameSave;

    public MenuOption(IMenuCommand gameStart, IMenuCommand gameLoad, IMenuCommand gameEscape) {
        this.gameStart = gameStart;
        this.gameLoad = gameLoad;
        this.gameEscape = gameEscape;
    }

    public MenuOption(IMenuCommand gameStart, IMenuCommand gameLoad, IMenuCommand gameSave, IMenuCommand gameEscape) {
        this.gameStart = gameStart;
        this.gameLoad = gameLoad;
        this.gameEscape = gameEscape;
        this.gameSave = gameSave;
    }

    public void gameGetStart() {
        gameStart.execute();
    }

    public void gameGetLoad() {
        gameLoad.execute();
    }

    public void gameGetEscape() {
        gameEscape.execute();
    }

    public void gameGetSave() {
        gameSave.execute();
    }

}
