package org.example.test;

import org.example.hr.Applicant;
import org.example.hr.JobPosition;
import org.junit.Test;

public class JobPositionTest {
    @Test
    public void testIswithinBudget(){
        JobPosition jobPosition = new JobPosition();
        jobPosition.setOfferedSalaryRangeStart(2000);
        jobPosition.setOfferedSalaryRangeEnd(6000);

        Applicant applicant = new Applicant();
        applicant.setExpectedSalary(7000);






    }
}
