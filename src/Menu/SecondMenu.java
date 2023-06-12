package Menu;

import java.util.ArrayList;

public class SecondMenu implements MenuItem {
    @Override
    public String getName() {
        return "SecondMenu";
    }

    @Override
    public void performAction() {
        ArrayList<MenuItem> secondMEnu = new ArrayList<>();
        secondMEnu.add(new Show());
        secondMEnu.add(new Show());
        secondMEnu.add(new Show());
        secondMEnu.add(new MainMenu());
        MenuMaker.menuMaker(secondMEnu);
    }
}
