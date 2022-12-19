package com.kodilla.kodillapatterns3.adapter.company;

import com.kodilla.kodillapatterns3.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter() {
            @Override
            public double TotalSalary(String[][] workers, double[] salaries) {
                return 0;
            }
        };
        // When
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());
        // Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }

}
