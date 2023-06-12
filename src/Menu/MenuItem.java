package Menu;

/**
 * The MenuItem interface represents a menu item in a menu system.
 * It defines the methods required for a menu item, including getting
 * the name of the item and performing the associated action.
 */
public interface MenuItem {

    /**
     * Gets the name of the menu item.
     *
     * @return the name of the menu item as a String.
     */
    String getName();

    /**
     * Performs the action associated with the menu item.
     * This method should implement the functionality specific
     * to the menu item.
     */
    void performAction();
}
