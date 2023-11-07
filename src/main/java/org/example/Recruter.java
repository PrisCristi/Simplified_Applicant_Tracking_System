package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Recruter {

    private String name;
    private List<JobPosition> jobPositionManaged;
    private Set <String> specializedIndustries;
    private Set <String> SpecializedRoles;

    public Recruter(String name, List<JobPosition> jobPositionManaged) {
        this.name = name;
        this.jobPositionManaged = jobPositionManaged;
    }

    public Recruter(Set<String> specializedIndustries, Set<String> specializedRoles) {
        this.specializedIndustries = specializedIndustries;
        SpecializedRoles = specializedRoles;
    }
    public void assignJobPosition(JobPosition jobPosition){ // etiqueta
        List<JobPosition> jobPositionList= new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobPosition> getJobPositionManaed() {
        return jobPositionManaged;
    }

    public void setJobPositionManaed(List<JobPosition> jobPositionManaed) {
        this.jobPositionManaged = jobPositionManaed;
    }
}
