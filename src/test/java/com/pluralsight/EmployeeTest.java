package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchClock_should_calculateCorrectly() {
        //arrange
        Employee employee1 = new Employee(1, "Grant", "Logistics", 7.25, 0);
        //act
        employee1.punchIn(10);
        employee1.punchOut(14);
        //assert
        assertEquals(4, employee1.getHoursWorked());
    }

    @Test
    public void punchClock_should_calculateCorrectlyTwo() {
        //arrange
        Employee employee1 = new Employee(1, "Grant", "Logistics", 7.25, 8);
        //act
        employee1.punchIn(13);
        employee1.punchOut(15);
        //assert
        assertEquals(10, employee1.getHoursWorked());
    }
}