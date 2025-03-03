package org.example.Visitor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(5, 5));
        shapes.add(new Circle(5));
        shapes.add(new Traiangle(4, 3));

        ShapeVisitor  shapeVisitor = new SGVExporter();
        for (Shape shape : shapes) {
            shape.accept(shapeVisitor);
        }
    }
}
