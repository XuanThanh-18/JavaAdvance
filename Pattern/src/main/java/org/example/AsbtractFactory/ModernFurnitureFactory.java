package org.example.AsbtractFactory;

public class ModernFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
