package ShapesWithoutVisitor;

public class Circle extends Shape  {
    public int radius;

    public Circle(int x, int y, int radius){
        this.radius=radius;
        this.x=x;
        this.y=y;
        this.type="Circle";
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String JsonExport() {
        return "Json export on shape Circle";
    }

    @Override
    public String XmlExport() {
        return "XML export on shape Circle";
    }
}
