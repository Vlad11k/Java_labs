package inheritance_override;

public class Furniture {
    String manufacturer;
    int price;
    String material;

    public Furniture() {
        price = 0;
        material = "Неизвестный";
    }
    public Furniture(int price) {
        this.price = price;
        material = "Неизвестный";
    }

    public Furniture(int price, String material) {
        this.price = price;
        this.material = material;
    }

    public String getmanufacturer () { //Метод который потом будут переопределять другие классы
        manufacturer = "Мебель";
        return manufacturer;
    }
    public int getPrice() { return price; }
    public String getMaterial() { return material; }
}

