package org.example.FlyWeight;

public class AppTest {
    public static void main(String[] args) {
        Shape circle = ShapFactory.getShape("RED");
        circle.draw(10,10);

        Shape circle2 = ShapFactory.getShape("RED");
        circle2.draw(50,50);

        Shape circle3 = ShapFactory.getShape("blue");
        circle3.draw(50,50);
    }
}
