package org.example.Iterator;

import org.example.Builder.Student;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Thanh", "Trang","Huy","Khai"};

        StudentCollection studentCollection = new StudentCollection(students);

        Iterator iterator = studentCollection.getIterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.next());
        }
    }
}
