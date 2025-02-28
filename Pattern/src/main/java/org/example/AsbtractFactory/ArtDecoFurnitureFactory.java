package org.example.AsbtractFactory;

public class ArtDecoFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public ISofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
