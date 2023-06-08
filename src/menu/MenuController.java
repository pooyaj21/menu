package menu;

import java.util.HashMap;
import java.util.Scanner;

public class MenuController {

    private Scanner scanner = new Scanner(System.in);
    private MenuCallback menuCallback;

    private static final String SEPERATOR =
            "********************************************************\n" +
            "\t\t\t\t\t %s\n" +
            "********************************************************\n";

    public MenuController(MenuCallback menuCallback) {
        this.menuCallback = menuCallback;
    }

    public void show() {
        // Print Menu Items
        System.out.printf(SEPERATOR, "Main Menu");
        MenuItem.printItems();
        // Ask for an ID
        System.out.println("-------------------------");
        System.out.print("Enter a menu id: ");
        String input = scanner.nextLine();
        // Validate input
        if (input.matches("[0-9]+")) {
            // Convert input to an integer
            int id = Integer.parseInt(input);
            // Find equivalent menu item
            MenuItem menuItem = MenuItem.findById(id);
            // Print Separator
            if (menuItem != null) {
                System.out.printf(SEPERATOR, menuItem.title);
            }
            // Invoke Callback
            menuCallback.onMenuSelected(menuItem, this);
        } else {
            // Invoke Callback
            menuCallback.onMenuSelected(null, this);
        }
    }



}
