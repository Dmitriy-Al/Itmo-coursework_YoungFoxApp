package menu;

public class OptionSaveGame implements IMenuCommand {

    private MenuChooseResult menuChooseResult;

    public OptionSaveGame(MenuChooseResult menuChooseResult) {
        this.menuChooseResult = menuChooseResult;
    }

    @Override
    public void execute() {
        menuChooseResult.saveGame();
    }
}
