package ru.gb.patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .withName("Andrew")
                .withId(11L)
                .withQualification("Prorab")
                .withSalary(2000.00)
                .withActive(true)
                .build();

        System.out.println(employee);
    }
}
