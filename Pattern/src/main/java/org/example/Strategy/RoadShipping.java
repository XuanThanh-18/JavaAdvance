package org.example.Strategy;

public class RoadShipping implements ShippingStrategy {
    @Override
    public double caculateCost(double weight) {
        return weight * 1.2;
    }
}
