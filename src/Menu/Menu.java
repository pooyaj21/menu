package Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Menu class represents a menu system that allows users to select
 * menu items and perform associated actions.
 */
public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private final MenuCallback menuCallback;

    /**
     * Constructs a Menu object with the specified MenuCallback.
     *
     * @param menuCallback the MenuCallback to handle menu item selections.
     */
    public Menu(MenuCallback menuCallback) {
        this.menuCallback = menuCallback;
    }

    /**
     * Adds a MenuItem to the menu.
     *
     * @param item the MenuItem to be added to the menu.
     */
    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    /**
     * Displays the menu items.
     */
    public void display() {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getName());
        }
    }

    /**
     * Runs the menu system.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
        display();
        System.out.print("Enter your choice (0 to exit): ");
        input = scanner.nextLine();
        if (input.matches("[0-9]+")) {
            int choice = Integer.parseInt(input);
            if (choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                selectedItem.performAction();
                menuCallback.onMenuSelected(this, selectedItem);
            }
        } else {
            menuCallback.onMenuSelected(this, null);
        }
    }
}
