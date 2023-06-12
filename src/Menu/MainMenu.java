package Menu;

import java.util.ArrayList;

public class MainMenu implements MenuItem{
    @Override
    public String getName() {
        return "Main Menu";
    }

    @Override
    public void performAction() {
        ArrayList<MenuItem> mainMenu = new ArrayList<>();
        mainMenu.add(new Add());
        mainMenu.add(new Show());
        mainMenu.add(new Edit());
        mainMenu.add(new SecondMenu());
        MenuMaker.menuMaker(mainMenu);
    }
}
