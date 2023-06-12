package Menu;

/**
 * The MenuCallback interface defines a callback method that is invoked
 * when a menu item is selected in a menu.
 */
public interface MenuCallback {

    /**
     * Called when a menu item is selected.
     *
     * @param menu the Menu object representing the menu.
     * @param menuItem the selected MenuItem object.
     */
    void onMenuSelected(Menu menu, MenuItem menuItem);
}
