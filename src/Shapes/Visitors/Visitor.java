package Shapes.Visitors;

import Shapes.GeometricShapes.Circle;
import Shapes.GeometricShapes.Dot;
import Shapes.GeometricShapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);
    }