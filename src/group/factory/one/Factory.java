package group.factory.one;

/**
 * Created by xuchengyun on 8/6/18.
 */
public class Factory {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape cir = sf.getShape("circle");
        cir.draw();
    }
}
