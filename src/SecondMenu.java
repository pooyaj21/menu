public enum SecondMenu implements MenuCallback{
    A(1, "A"),
    B(2, "B"),
    C(3, "C"),
    D(4, "D"),
    E(5, "E"),
    MAIN_ITEM(6, "Main Item"),
    EXIT(7, "Exit");

    private final int id;
    final String title;

    SecondMenu(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void onMenuSelected(Enum anEnum, MenuController menuController) {
        if (anEnum != null) {
            switch ((SecondMenu)anEnum) {
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
                    EnumTools.makeMenu(MenuItem.class);
                    break;
                case EXIT:
                    return;
            }
        }
        menuController.show(SecondMenu.class);
    }
}
