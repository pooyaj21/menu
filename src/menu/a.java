package menu;

public class a {
    MenuController controller =null;
    public <E extends Enum<E>> void menu(Enum<?> value){
         controller = new MenuController(
                new MenuCallback<E>() {
                    @Override
                    public  void onMenuSelected( E item,MenuController menuController){
                        if (item != null) {
                            switch (value.getClass().getSimpleName()) {
                                case "MenuItem":
                                    MenuItem menuItem = (MenuItem) value;
                                    switch (menuItem) {
                                        case ADD:
                                            System.out.println("It's Add!");
                                            break;
                                        case Edit:
                                            System.out.println("It's Edit!");
                                            break;
                                        case SHOW:
                                            System.out.println("It's Show!");
                                            break;
                                        case EXIT:
                                            System.out.println("It's Exit!");
                                            break;
                                    }
                                    break;
                                case "SeconderMenu":
                                    SeconderMenu seconderMenu = (SeconderMenu) value;
                                    switch (seconderMenu) {
                                        case A:
                                            System.out.println("It's A!");
                                            break;
                                        case B:
                                            System.out.println("It's B!");
                                            break;
                                        case C:
                                            System.out.println("It's C!");
                                            break;
                                    }
                            }
                        }
                        controller.show();
                    }
                }
        );
         controller.show();
    }
}
