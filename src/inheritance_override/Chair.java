package inheritance_override;

public class Chair extends Furniture{
    private boolean control_back;

    public Chair() {
        super();
        control_back = false;
    }
    public Chair(int price, String material) {
        super(price, material);
        control_back = false;
    }

    public Chair(int price, String material, boolean control_back) {
        super(price, material);
        this.control_back = control_back;
    }

    public boolean isControl_back() {
        return control_back;
    }

    public String getmanufacturer() {
        manufacturer = "Стулья";
        return manufacturer;
    }
}
