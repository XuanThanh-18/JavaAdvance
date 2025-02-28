package org.example.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapFactory {
    private static Map<String, Shape> circleMap = new HashMap<>();
    public static Shape getShape(String color) {
        Circle circle =(Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Created Circle color: " + color);
        }
        return circle;
    }
}
