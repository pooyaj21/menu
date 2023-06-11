public interface MenuCallback<E extends Enum> {
    void onMenuSelected(E e, MenuController menuController);

    void printItems();

    E findById(int id);

}
