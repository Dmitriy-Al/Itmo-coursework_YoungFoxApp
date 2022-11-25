package menu;

public class OptionLoadGame implements IMenuCommand {

    private MenuChooseResult menuChooseResult;

    public OptionLoadGame(MenuChooseResult menuChooseResult) {
        this.menuChooseResult = menuChooseResult;
    }

    @Override
    public void execute() {
        menuChooseResult.loadGame();
    }

}