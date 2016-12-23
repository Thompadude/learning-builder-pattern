package com.example;

public class Main {

    public static void main(String[] args) {

        // Creating a Employee object with the constructor.
        Employee employeeA = new Employee("Kalle", "Kula", 1983, 45);

        // Creating a Employee object with the help of the builder.
        // Much easier to read for other developers.
        Employee employeeB = new Employee.EmployeeBuilder()
                .firstName("Kalle")
                .lastName("Kula")
                .birthYear(1983)
                .shoeSize(45)
                .build();

        // Choose which fields you want to use.
        Employee employeeC = new Employee.EmployeeBuilder()
                .firstName("Kalle")
                .build();

        System.out.println("employeeA: " + employeeA);
        System.out.println("employeeB: " + employeeB);
        System.out.println("employeeC: " + employeeC);
    }

}