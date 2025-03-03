package org.example.Prototype;

public class TestApp {
    public static void main(String[] args) {
        Car mycar = Car.builder().color("Red").model("hjkha").style("Sendan").build();

        mycar.Print();

        Car yourCar = mycar.clone();
        yourCar.Print();

        Book book = Book.builder().build();

    }
}
