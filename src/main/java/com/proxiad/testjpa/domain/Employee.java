package com.proxiad.testjpa.domain;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "EMPLOYEES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Instant hireDate;
    @OneToOne(cascade = CascadeType.ALL)
    private Job jobId;
    @OneToOne(cascade = CascadeType.ALL)
    private Employee managerId;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department departmentId;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", jobId=" + jobId +
                ", managerId=" + managerId +
                '}';
    }
}
