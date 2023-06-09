import menu.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        MenuController<SeconderMenu> controller = new MenuController<>(
                new MenuCallback<SeconderMenu>() {
                    @Override
                    public void onMenuSelected(
                            SeconderMenu menuItem,
                            MenuController menuController
                    ) {
                        if (menuItem != null) {
                            switch (menuItem) {
                                case A:
                                case B:
                                case C:
                                    System.out.println("Not implemented");
                                    break;
                                case EXIT:
                                    return;
                            }
                        }
                        menuController.show(SeconderMenu.class);
                    }
                }
        );
        controller.show(SeconderMenu.class);


    }
    }