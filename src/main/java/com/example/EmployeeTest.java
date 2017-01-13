package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employeeA;
    private Employee employeeB;

    @Before
    public void setUp() throws Exception {
        employeeA = new Employee.EmployeeBuilder("Kalle").lastName("Kula").build();
        employeeB = new Employee.EmployeeBuilder("Kalle").lastName("Kula").build();
    }

    @After
    public void tearDown() throws Exception {
        employeeA = null;
        employeeB = null;
    }

    @Test
    public void testBuilder() {
        assertNotSame(employeeA, employeeB);
        assertThat(employeeA.getFullName(), is("Kalle Kula"));
        assertThat(employeeB.getFullName(), is("Kalle Kula"));
    }

}