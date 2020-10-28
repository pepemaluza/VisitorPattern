package ShapesWithoutVisitor;

public class XmlExport implements Export {
    @Override
    public String export(Shape shape) {
        return shape.XmlExport();
    }
}
