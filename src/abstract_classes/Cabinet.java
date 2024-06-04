package abstract_classes;

public class Cabinet implements Furniture, Object{
    private int width;
    private int depth;
    private int height;

    public Cabinet() {
        width = 0;
        depth = 0;
        height = 0;
    }
    public Cabinet(int width) {
        this.width = width;
        depth = 0;
        height = 0;
    }
    public Cabinet(int width, int depth, int height) {
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
        return "Шкафы";
    }
    @Override
    public void print() {
        System.out.println("Производитель "+getmanufacturer()+" Ширина: "+getWidth()+
                " Высота: "+getHeight()+" Глубина "+getDepth());
    }
}
