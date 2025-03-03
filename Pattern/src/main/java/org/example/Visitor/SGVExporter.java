package org.example.Visitor;

public class SGVExporter implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println(" Circle Shape is r = " + circle.getRadius());
    }

    @Override
    public void visit(Traiangle traiangle) {
        System.out.println("rec with with = " + traiangle.getBase() + "height = " + traiangle.getHeight());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("rec with with = " + rectangle.getWidth() + "height = " + rectangle.getHeight());
    }
}
