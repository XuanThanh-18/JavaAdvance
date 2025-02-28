package org.example.Proxy;

public class ReadDocument implements Document {


    private String filename;
    public ReadDocument(String filename) {
        this.filename = filename;
    }
    public void loadFromDisk(){
        System.out.println("load file from " + filename);
    }

    @Override
    public void Display() {
        System.out.println("Displaying " + filename);
    }
}
