package inheritance_override;

public class Table extends Furniture{
    private int number_cases;
    private int area;

    public Table () {
        super();
        number_cases = 0;
        area = 0;
    }
    public Table (int price, String material, int number_cases) {
        super(price, material);
        this.number_cases = number_cases;
        area = 0;
    }
    public Table (int price, String material, int number_cases, int area) {
        super(price, material);
        this.number_cases = number_cases;
        this.area = area;
    }

    public int getNumber_cases() { return number_cases; }

    public int getArea() { return area; }

    public String getmanufacturer() {
        manufacturer = "Столы";
        return manufacturer;
    }
}
