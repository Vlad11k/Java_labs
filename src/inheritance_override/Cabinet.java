package inheritance_override;

public class Cabinet extends Furniture {
   private int width;
   private int depth;
   private int height;

   public Cabinet() {
       super();
       depth = 0;
       height = 0;
   }

   public Cabinet(int price, String material, int width) {
       super(price, material);
       this.width = width;
       depth = 0;
       height = 0;
   }

   public Cabinet(int price, String material, int width, int depth, int height) {
       super(price, material);
       this.width = width;
       this.depth = depth;
       this.height = height;
   }

    public int getWidth() {
        return width;
    }
    public int getDepth() {
        return depth;
    }
    public int getHeight() {
        return height;
    }

    public String getmanufacturer() {
       manufacturer = "Шкафы";
       return manufacturer;
   }
}
