package org.example.Visitor;

import java.awt.*;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Traiangle traiangle);
    void visit(Rectangle rectangle);
}
