package menu;

public enum MenuItemCreator {
    ADD(1, "Add"),
    Edit(2, "Edit"),
    SHOW(3, "Show"),
    EXIT(4, "Exit");

    private final int id;
    final String title;

    MenuItemCreator(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + "." + title;
    }

    public static void printItems() {
        for (MenuItemCreator item : values()) {
            System.out.println(item);
        }
    }

    public static MenuItemCreator findById(int id) {
        for (MenuItemCreator item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }
}
