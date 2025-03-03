package org.example.Visitor;

public class Rectangle implements Shape{
    private double width,height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
