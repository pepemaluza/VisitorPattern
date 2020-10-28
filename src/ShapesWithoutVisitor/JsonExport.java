package ShapesWithoutVisitor;


public class JsonExport implements Export {

    public String export(Shape shape){
        return shape.JsonExport();
    }

}
