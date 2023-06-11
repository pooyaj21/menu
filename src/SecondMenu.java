public enum SecondMenu implements MenuCallback {
    A(1, "A"),
    B(2, "B"),
    C(3, "C"),
    D(4, "D"),
    E(5, "E"),
    MAIN_ITEM(6, "Main Item"),
    EXIT(7, "Exit");

    final String title;
    private final int id;

    SecondMenu(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public static SecondMenu getInstanceOf() {
        return SecondMenu.A;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void onMenuSelected(Enum anEnum, MenuController menuController) {
        if (anEnum != null) {
            switch ((SecondMenu) anEnum) {
                case A:
                    System.out.println("A");
                    break;
                case B:
                    System.out.println("B");
                    break;
                case C:
                    System.out.println("C");
                    break;
                case D:
                    System.out.println("D");
                    break;
                case E:
                    System.out.println("E");
                    break;
                case MAIN_ITEM:
                    System.out.println("switching menu");
                    EnumTools.makeMenu(MenuItem.getInstanceOf());
                    break;
                case EXIT:
                    return;
            }
        }
        menuController.show(anEnum);
    }

    @Override
    public void printItems() {
        for (SecondMenu item : values()) {
            System.out.println(item.id + ". " + item);
        }
    }

    @Override
    public SecondMenu findById(int id) {
        for (SecondMenu item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }
}
