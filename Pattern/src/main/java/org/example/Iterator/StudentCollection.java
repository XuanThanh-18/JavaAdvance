package org.example.Iterator;

public class StudentCollection implements Collection {
    private String[] students;
    public StudentCollection(String[] students) {
        this.students = students;
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator(students);
    }
}
