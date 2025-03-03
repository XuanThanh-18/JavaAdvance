package org.example.Visitor;

public class Traiangle  implements Shape {
    private double base,height;

    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }



    public Traiangle(double base, double weight) {
        this.base = base;
        this.height = weight;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
