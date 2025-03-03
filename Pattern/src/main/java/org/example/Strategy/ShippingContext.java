package org.example.Strategy;

public class ShippingContext {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double caculateShippingCost(double weight) {
        if (strategy == null) {
            throw new RuntimeException("No stratergy set");
//            strategy = new RoadShipping();
//            strategy.caculateCost(weight);
        }else{
            return strategy.caculateCost(weight);
        }
    }
}
