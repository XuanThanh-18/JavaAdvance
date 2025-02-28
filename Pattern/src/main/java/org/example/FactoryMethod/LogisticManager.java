package org.example.FactoryMethod;

public class LogisticManager {
    public static BaseLogistic getLogistic(String type){
        if(type.equals("road")){
            return new RoadLogistic();
        } else if(type.equals("sea")){
            return new SeaLogistic();
        }else return null;
    }
}
