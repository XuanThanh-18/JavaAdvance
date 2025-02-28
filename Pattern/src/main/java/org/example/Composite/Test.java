package org.example.Composite;

public class Test {
    public static void main(String[] args) {
        Manager tem1 = new Manager();

        tem1.setName("Team1");

        tem1.addDeveloper(Developer.builder().name("Developer 1").age(20).salary(30).build());
        tem1.addDeveloper(Developer.builder().name("Developer 2").age(30).salary(60).build());

        tem1.AdjustSalary(50);
        tem1.showInfo();
    }
}
