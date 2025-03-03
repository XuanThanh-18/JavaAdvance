package org.example.Visitor;

public class AreaCaculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println(" Circle Area is " + area);
    }

    @Override
    public void visit(Traiangle traiangle) {
    double area = 0.5 * traiangle.getBase() * traiangle.getHeight();
        System.out.println(" Traiangle Area is " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println(" Rectangle Area is " + area);
    }
}
