package menu;

public interface MenuCallback<E extends Enum<E>> {
    void onMenuSelected(E e, MenuController menuController);
}
