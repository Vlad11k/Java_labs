package abstract_classes;

public class Bar_stool extends Chair{

    public Bar_stool (int price, String material) {
        super(price, material);
    }

    @Override
    public String getmanufacturer() {
        return "Барные стулья";
    }

    @Override
    public void print() {
        System.out.println("Производитель "+getmanufacturer()+" Цена: "+
                getPrice()+" Материал: "+getMaterial());
    }
}
