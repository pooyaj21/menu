package menu;

import java.util.HashMap;
import java.util.SortedMap;

public enum SeconderMenu implements MenuCallback{
    A(1, "A"),
    B(2, "B"),
    C(3, "C"),
    EXIT(4, "Exit");

    private final int id;
    final String title;


    SeconderMenu(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public void printItems() {
        for (SeconderMenu item : values()) {
            System.out.println(item);
        }
    }

    public  SeconderMenu findById(int id) {
        for (SeconderMenu item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }

    @Override
    public void onMenuSelected(Enum anEnum, MenuController menuController) {
        if (anEnum != null) {
            switch ((SeconderMenu)anEnum) {
                case A:
                    Filler.makeMenu(MenuItem.class);
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
