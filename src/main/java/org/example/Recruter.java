package org.example;

import java.util.List;

public class Recruter {

    String name;
    List<JobPosition> jobPositionManaed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobPosition> getJobPositionManaed() {
        return jobPositionManaed;
    }

    public void setJobPositionManaed(List<JobPosition> jobPositionManaed) {
        this.jobPositionManaed = jobPositionManaed;
    }
}
