package Shapes.Visitors;

import Shapes.GeometricShapes.*;

public class JSONExportVisitor implements Visitor {

    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("{" + "\n");
        for (Shape shape : args) {
            sb.append("{"+ "\n").append(shape.accept(this)).append("}"+ "\n");
        }
        sb.append("\n" + "}");
        return sb.toString();
    }

    @Override
    public String visitDot(Dot d) {
        return "'dot' : " + "\n" +
                "{" + "\n" +
                    "    'id' : '" + d.getId() + "'" + "\n" +
                    "    'x' : '" +d.getX() + "'" + "\n" +
                    "    'y' : '" +d.getY() + "'" + "\n" +
                    "}" + "\n";

    }

    @Override
    public String visitCircle(Circle c) {
        return "'circle' : " + "\n" +
                "{" + "\n" +
                "    'id' : '" + c.getId() + "'" + "\n" +
                "    'x' : '" +c.getX() + "'" + "\n" +
                "    'y' : '" +c.getY() + "'" + "\n" +
                "    'radius' : '" +c.getRadius() + "'" + "\n" +
                "}" + "\n";
    }

    @Override
    public String visitRectangle(Rectangle r) {
        return "'rectangle' : "+ "\n" +
                "{" + "\n" +
                "    'id' : '" + r.getId() + "'" + "\n" +
                "    'x' : '" +r.getX() + "'" + "\n" +
                "    'y' : '" +r.getY() + "'" + "\n" +
                "    'width' : '" +r.getWidth() + "'" + "\n" +
                "    'height' : '" +r.getHeight() + "'" + "\n" +
                "}" + "\n" ;
    }

}
