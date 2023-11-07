package org.example.hr;

import java.util.List;

public class Applicant {
    private String name;
    private List<String> previousCompanies;
    private String currentCity;
    private String preferredLocation;
    private double expectedSalary;
    private String status;

    public Applicant(){
    }

    public Applicant(String name, List<String> previousCompanies, String currentCity, String preferredLocation, double expectedSalary, String status) {
        this.name = name;
        this.previousCompanies = previousCompanies;
        this.currentCity = currentCity;
        this.preferredLocation = preferredLocation;
        this.expectedSalary = expectedSalary;
        this.status = status;
    }


    public boolean isRelocationPreferred(){ // isso é a etiqueta do metodo!
        boolean relocationPreferrence = !currentCity.equals(preferredLocation); // 1. compara se eles sao iguais
        if (relocationPreferrence){  // if preferred location = currentCity return not relocate
            System.out.println("Aplicant do not prefer to relocate" );
        } else {
            System.out.println(" Aplicant want to be relocated");  // se preferred location != currentCity return relocate
        } return relocationPreferrence;
    }
    public List<String> getPreviousCompanies() {
        return previousCompanies;
    }
    public void setPreviousCompanies(List<String> previousCompanies) {
        this.previousCompanies = previousCompanies;
    }
    public String getCurrentCity() {
        return currentCity;
    }
    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }
    public String getPreferredLocation() {
        return preferredLocation;
    }
    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }
    public double getExpectedSalary() {
        return expectedSalary;
    }
    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
