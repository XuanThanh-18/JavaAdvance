package org.example.Strategy;

public class AirShipping  implements ShippingStrategy {
    @Override
    public double caculateCost(double weight) {
        return 2.5 * weight;
    }
}
