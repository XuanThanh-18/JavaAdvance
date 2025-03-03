package org.example.Strategy;

public class StratergyTest {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();
        double weight = 10 ;

        context.setStrategy(new RoadShipping());
        double cost = context.caculateShippingCost(weight);
        System.out.println(cost);
    }
}
