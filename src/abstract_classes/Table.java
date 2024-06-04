package abstract_classes;

public class Table implements Furniture, Object{
    private int number_cases;
    private int area;

    public Table () {
        number_cases = 0;
        area = 0;
    }
    public Table (int number_cases) {
        this.number_cases = number_cases;
        area = 0;
    }
    public Table (int number_cases, int area) {
        this.number_cases = number_cases;
        this.area = area;
    }

    public int getNumber_cases() { return number_cases; }

    public int getArea() { return area; }

    public String getmanufacturer() {
        return "Столы";
    }

    @Override
    public void print() {
        System.out.println("Производитель "+getmanufacturer()+" Количество полок: "+getNumber_cases()+
                " Площадь "+getArea());
    }
}
