package Menu;

import java.util.ArrayList;

/**
 * The MenuMaker class provides a convenient method to create and run a menu
 * based on a list of menu items.
 */
public class MenuMaker {

    /**
     * Creates and runs a menu based on the provided list of menu items.
     *
     * @param menuItems the list of MenuItem objects to be included in the menu.
     */
    public static void menuMaker(ArrayList<MenuItem> menuItems) {
        Menu menu = new Menu(new MenuCallback() {
            @Override
            public void onMenuSelected(Menu menu, MenuItem menuItem) {
                menu.run();
            }
        });
        for (MenuItem item : menuItems) menu.addItem(item);
        menu.run();
    }
}
