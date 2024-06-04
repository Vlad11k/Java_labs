package abstract_classes;

public class Stool extends Chair{

    public Stool (int price, String material) {
        super(price, material);
    }

    @Override
    public String getmanufacturer() {
        return "Табуретки";
    }
    @Override
    public void print() {
        System.out.println("Производитель "+getmanufacturer()+" Цена: "+
                getPrice()+" Материал: "+getMaterial());
    }
}
