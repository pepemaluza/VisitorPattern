package ShapesWithoutVisitor;

public class Rectangle extends Shape  {
    public int height, width;

    public Rectangle(int x, int y, int height, int width){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
        this.type="Rectangle";
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String JsonExport() {
        return "Json export on shape Rectangle";
    }

    @Override
    public String XmlExport() {
        return "XML export on shape Rectangle";
    }
}
