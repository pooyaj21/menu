package menu;

public enum MenuItem {
    ADD(1, "Add"),
    Edit(2, "Edit"),
    SHOW(3, "Show"),
    EXIT(4, "Exit");

    private final int id;
    final String title;

    MenuItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + "." + title;
    }

    public static void printItems() {
        for (MenuItem item : values()) {
            System.out.println(item);
        }
    }

    public static MenuItem findById(int id) {
        for (MenuItem item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }
}
