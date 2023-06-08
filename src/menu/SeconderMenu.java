package menu;

import java.util.HashMap;

public enum SeconderMenu {
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
        return id + "." + title;
    }

    public static void printItems() {
        for (SeconderMenu item : values()) {
            System.out.println(item);
        }
    }

    public static SeconderMenu findById(int id) {
        for (SeconderMenu item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }
}