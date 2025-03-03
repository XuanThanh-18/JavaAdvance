package org.example.Visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
