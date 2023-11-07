package org.example.hr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recruter {

    private String name;
    private List<JobPosition> jobPositionManaged;
    private Set<String> specializedIndustries;
    private Set<String> specializedRoles;

    public Recruter(){

    }

    public Recruter(String name) {
        this.name = name;
        jobPositionManaged = new ArrayList<>();
        specializedRoles = new HashSet<>();
        specializedIndustries = new HashSet<>();
    }
    public void assignJobPosition(JobPosition jobPosition) { // etiqueta
        if (jobPosition != null) {   // se a posicao estiver vazia execute o conteudo abaixo
            if (jobPositionManaged.contains(jobPosition)) {
                jobPositionManaged.add(jobPosition);
            } else {
                System.out.println("No possible to add a new open position");
            }
        }
    }
        public void reviewApplicant (Applicant applicant){
            System.out.println(applicant.toString());
            applicant.setStatus("Reviewed");
        }
            public boolean isSpecializedFor(JobPosition jobPosition) {
                boolean hasSpecializedIndustry = specializedIndustries.contains(jobPosition.getIndustry());
                boolean hasSpecializedRole = specializedRoles.contains(jobPosition.getRole());
                return hasSpecializedIndustry && hasSpecializedRole;
            }
            public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

        public List<JobPosition> getJobPositionManaged () {
            return jobPositionManaged;
        }

        public void setJobPositionManaged (List < JobPosition > jobPositionManaged) {
            this.jobPositionManaged = jobPositionManaged;
        }

        public Set<String> getSpecializedIndustries () {
            return specializedIndustries;
        }

        public void setSpecializedIndustries (Set < String > specializedIndustries) {
            this.specializedIndustries = specializedIndustries;
        }

        public Set<String> getSpecializedRoles () {
            return specializedRoles;
        }
        public void setSpecializedRoles (Set < String > specializedRoles) {
            this.specializedRoles = specializedRoles;
        }
    }
