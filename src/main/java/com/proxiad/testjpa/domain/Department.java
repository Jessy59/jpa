package com.proxiad.testjpa.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTMENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private Integer departmentId;
    private String departmentName;
    @OneToMany(mappedBy = "departmentId", cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
