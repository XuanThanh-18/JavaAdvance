package org.example.Bridge;

public class Rectangle extends Shap{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("drawing rectangle" );
        color.setColor();
    }
}
