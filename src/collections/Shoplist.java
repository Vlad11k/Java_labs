package collections;

public class Shoplist {
    private String name;
    private String art;
    private String model;
    private String proizvod;
    private String color;
    private int size;
    private String date;
    private int price;

    public Shoplist(String name, String art, String model, String proizvod, String color, int size, String date, int price) {
        this.name = name;
        this.art = art;
        this.model = model;
        this.proizvod = proizvod;
        this.color = color;
        this.size = size;
        this.date = date;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setArt(String art) {
        this.art = art;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setProizvod(String proizvod) {
        this.proizvod = proizvod;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getArt() {
        return art;
    }
    public String getModel() {
        return model;
    }
    public String getProizvod() {
        return proizvod;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
    public String getDate() {
        return date;
    }
    public int getPrice() {
        return price;
    }
}


