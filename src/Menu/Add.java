package Menu;

public class Add implements MenuItem {
    @Override
    public String getName() {
        return "Add";
    }

    @Override
    public void performAction() {
        System.out.println("Add option");
    }
}
