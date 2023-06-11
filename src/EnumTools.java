public class EnumTools {

    public static <T extends Enum> void makeMenu(Enum anEnum) {
        MenuController<T> controller = new MenuController<>(
                new MenuCallback<T>() {
                    @Override
                    public void onMenuSelected(T t, MenuController menuController) {
                        if (t instanceof MenuCallback) ((MenuCallback) t).onMenuSelected(t, menuController);
                    }

                    @Override
                    public void printItems() {
                        if (anEnum instanceof MenuCallback) ((MenuCallback) anEnum).printItems();
                    }

                    @Override
                    public T findById(int id) {
                        if(anEnum instanceof MenuCallback)return (T) ((MenuCallback<?>) anEnum).findById(id);
                        else return null;
                    }
                }
        );
        controller.show(anEnum);
    }

}
