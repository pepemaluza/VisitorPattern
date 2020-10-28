package Shapes;

import Shapes.GeometricShapes.*;
import Shapes.Visitors.JSONExportVisitor;
import Shapes.Visitors.XMLExportVisitor;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        export(circle, rectangle);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        JSONExportVisitor jsonExportVisitor = new JSONExportVisitor();

        System.out.println(exportVisitor.export(shapes));
        System.out.println(jsonExportVisitor.export(shapes));
    }
}