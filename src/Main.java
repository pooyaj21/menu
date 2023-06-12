import Menu.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> mainMenu = new ArrayList<>();
        mainMenu.add(new Add());
        mainMenu.add(new Show());
        mainMenu.add(new Edit());
        mainMenu.add(new SecondMenu());
        MenuMaker.menuMaker(mainMenu);
    }
}
