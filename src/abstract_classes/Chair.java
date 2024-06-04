package abstract_classes;

public abstract class Chair implements Furniture, Object{
    public int price;
    public String material;

    public Chair (int price, String material) {
        this.price = price;
        this.material = material;
    }

    public int getPrice() {
        return price;
    }
    public String getMaterial() {
        return material;
    }

}
