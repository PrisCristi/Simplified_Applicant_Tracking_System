package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.io.FileWriter;
import java.util.*;


public class HRSystem {
    public static final String reportFile = "/Users/priscilasantos/Documents/StartSteps/Simplified_Applicant_Tracking_System/src/main/java/org/example/reportFile.txt";
    List<Applicant> applicants;
    List<JobPosition> jobPositions;
    List<Recruter> recruters;

    public HRSystem() {
        applicants = new ArrayList<>();
        jobPositions = new ArrayList<>();
        recruters = new ArrayList<>();
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public void setJobPositions(List<JobPosition> jobPositions) {
        this.jobPositions = jobPositions;
    }

    public List<Recruter> getRecruters() {
        return recruters;
    }

    public void setRecruters(List<Recruter> recruters) {
        this.recruters = recruters;
    }

    public void addRecruter(Recruter recruter) {   // etiqueta
        if (recruter != null) {    // verifica se lista nao esta vazia
            if (!recruters.contains(recruter)) {
                recruters.add(recruter);
            } else {
                System.out.println("Recruiter already registered in the system");
            }
        }
    }

    public Map<String, Long> generateReports() {
        StringBuilder report = new StringBuilder();
        report.append("Report").append(System.lineSeparator())
                .append("Number of applicants: ")
                .append(applicants.size())
                .append(System.lineSeparator()).append("Total of job position: ")
                .append(jobPositions.size())
                .append(System.lineSeparator())
                .append("Number of applicants per job position: ")
                .append(System.lineSeparator());

        applicantsPerJobPosition()
                .forEach((key, value) -> {
                    report.append(key.getTitle())
                            .append(" - ")
                            .append(String.join(", ", value.stream().map(Applicant::getName).toList()))
                            .append(System.lineSeparator());
                });
        applicantsCountPerStatus()
                .forEach((key, value) -> {
                    report.append(key)
                            .append(" - ")
                            .append(value)
                            .append(System.lineSeparator());
                });

        System.out.println(report);
        try (FileWriter fileWriter = new FileWriter(reportFile);) {
            fileWriter.write(report.toString());
        } catch (IOException e) {
            System.out.println("Write report file failed");
            e.printStackTrace();
        }
        public Map<JobPosition, List<Applicant>> applicantsCountPerStatus() {
            return applicants.stream()
                    .collect(Collectors.groupingBy(Applicant::getStatus, Collectors.counting()));
        }
    }
    public Map<JobPosition, List<Applicant>> applicantsPerJobPosition() {
        Map<JobPosition, List<Applicant>> applicantsByJobPosition = new HashMap<>();
        for (JobPosition job : jobPositions) {
            for (Applicant applicant : applicants) {
                if (job.isWithinBudget(applicant) && job.getLocation()
                        .equals(applicant.getPreferredLocation())) {
                    if (applicantsByJobPosition.containsKey(job)) {
                        applicantsByJobPosition.get(job).add(applicant);
                    } else {
                        applicantsByJobPosition.put(job, Collections.singletonList(applicant));
                    }
                }
            }
        }
        return applicantsByJobPosition;
    }
}
