package menu;

public class OptionEscapeGame implements IMenuCommand {

    private MenuChooseResult menuChooseResult;

    public OptionEscapeGame(MenuChooseResult menuChooseResult) {
        this.menuChooseResult = menuChooseResult;
    }

    @Override
    public void execute() {
        menuChooseResult.escapeGame();
    }
}
