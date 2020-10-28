package ShapesWithoutVisitor;

abstract class Shape implements ShapeInterface {
    int id;
    int x;
    int y;
    String type;

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType(){
        return type;
    }

    @Override
    public String JsonExport() {
        return null;
    }

    @Override
    public String XmlExport() {
        return null;
    }
}
