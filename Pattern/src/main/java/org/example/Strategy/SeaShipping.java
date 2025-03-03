package org.example.Strategy;

public class SeaShipping  implements ShippingStrategy {
    @Override
    public double caculateCost(double weight) {
        return weight * 0.8;
    }
}
