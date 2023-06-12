package Menu;

public class Edit implements MenuItem{
    @Override
    public String getName() {
        return "Edit";
    }

    @Override
    public void performAction() {
        System.out.println("Edit option");
    }
}
