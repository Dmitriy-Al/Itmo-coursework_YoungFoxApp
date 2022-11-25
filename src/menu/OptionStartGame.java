package menu;

public class OptionStartGame implements IMenuCommand {

    private MenuChooseResult menuChooseResult;

    public OptionStartGame(MenuChooseResult menuChooseResult) {
        this.menuChooseResult = menuChooseResult;
    }

    @Override
    public void execute() {
        menuChooseResult.startGame();
    }
}
