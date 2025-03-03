package org.example.AsbtractFactory;

public class TestApp {
    public static void main(String[] args) {
        IFurnitureFactory factory;
        factory = new ModernFurnitureFactory();

        IChair chair = factory.createChair();
        ISofa sofa = factory.createSofa();
        ICoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.lieOn();
        coffeeTable.placeItem();
    }
}
