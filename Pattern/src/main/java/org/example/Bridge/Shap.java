package org.example.Bridge;

public abstract class Shap {
    protected Color color;
    public Shap(Color color) {
        this.color = color;
    }

    abstract void draw();
}
