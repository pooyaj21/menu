public enum MenuItem implements MenuCallback {
    ADD(1, "Add"),
    Edit(2, "Edit"),
    SHOW(3, "Show"),
    SECOND_MENU(4, "Second Menu"),
    EXIT(5, "Exit");

    private final int id;
    private final String title;

    public static MenuItem getInstanceOf(){
        return MenuItem.SHOW;
    }

    MenuItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void printItems() {
        for (MenuItem item : values()) {
            System.out.println(item.id + ". " + item);
        }
    }

    @Override
    public MenuItem findById(int id) {
        for (MenuItem item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }

    @Override
    public void onMenuSelected(Enum anEnum, MenuController menuController) {
        if (anEnum != null) {
            switch ((MenuItem) anEnum) {
                case ADD:
                    System.out.println("Add");
                    break;
                case Edit:
                    System.out.println("Edit");
                    break;
                case SHOW:
                    System.out.println("Show");
                    break;
                case SECOND_MENU:
                    System.out.println("switching menu");
                    EnumTools.makeMenu(SecondMenu.getInstanceOf());
                    break;
                case EXIT:
                    return;
            }
        }
        menuController.show(anEnum);
    }
}
