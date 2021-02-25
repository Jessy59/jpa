package com.proxiad.testjpa.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    private Integer jobId;
    private String jobTitle;
    private Float minSalary;
    private Float maxSalary;

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobTitle='" + jobTitle + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
