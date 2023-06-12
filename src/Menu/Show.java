package Menu;

public class Show implements MenuItem{
    @Override
    public String getName() {
        return "Show";
    }

    @Override
    public void performAction() {
        System.out.println("Show option");
    }
}
