package group.factory.one;

/**
 * Created by xuchengyun on 8/6/18.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType == "circle") return new Circle();
        if (shapeType == "rectangle") return new Rectangle();
        if (shapeType == "square") return new Square();
        return null;
    }
}
