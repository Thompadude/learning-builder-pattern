package com.example;

/**
 * Outer class. All fields required when creating a new object.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private Integer birthYear;
    private Integer shoeSize;

    public Employee(String firstName, String lastName, Integer birthYear, Integer shoeSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", shoeSize=" + shoeSize +
                '}';
    }

    /**
     * Inner class. Static so we do not have to create a new object of EmployeeBuilder when creating a new Employee.
     * All methods return the EmployeeBuilder with any previously set values.
     *
     * @see Employee
     */
    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private Integer birthYear;
        private Integer shoeSize;

        // Make firstName mandatory
        public EmployeeBuilder(String firstName) {
            this.firstName = firstName;
        }

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder birthYear(Integer birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public EmployeeBuilder shoeSize(Integer shoeSize) {
            this.shoeSize = shoeSize;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, birthYear, shoeSize);
        }

    }

}