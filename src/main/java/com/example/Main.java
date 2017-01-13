package com.example;

public class Main {

    public static void main(String[] args) {

        // Creating a Employee object with the constructor.
        Employee employeeA = new Employee("Kalle", "Kula", 1983, 45);

        // Creating a Employee object with the help of the builder.
        // Readability for other developers.
        // Note: firstName is mandatory.
        Employee employeeB = new Employee.EmployeeBuilder("Kalle")
                .lastName("Kula")
                .birthYear(1983)
                .shoeSize(45)
                .build();

        System.out.println("employeeA: " + employeeA);
        System.out.println("employeeB: " + employeeB);
    }

}