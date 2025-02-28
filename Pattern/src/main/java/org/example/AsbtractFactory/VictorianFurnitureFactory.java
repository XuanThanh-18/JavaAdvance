package org.example.AsbtractFactory;

public class VictorianFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
