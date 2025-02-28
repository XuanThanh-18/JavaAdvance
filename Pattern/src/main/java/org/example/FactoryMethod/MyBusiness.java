package org.example.FactoryMethod;

public class MyBusiness {


    public static void main(String[] args) {
        BaseLogistic roadLogistic;
        roadLogistic = LogisticManager.getLogistic("road");
        roadLogistic.planDelivery();
    }
}
