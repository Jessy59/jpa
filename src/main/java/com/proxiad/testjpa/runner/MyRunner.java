package com.proxiad.testjpa.runner;

import com.proxiad.testjpa.domain.Department;
import com.proxiad.testjpa.domain.Employee;
import com.proxiad.testjpa.domain.Job;
import com.proxiad.testjpa.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class MyRunner implements CommandLineRunner {

    private final DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {
        Job job = new Job(1, "Meilleur dev", 40000f, 50000f);
        Job job2 = new Job(2, "Moins bon dev", 1f, 2f);
        Employee employee = new Employee(1, "Jessy", "Jessy", "j.l@gmail.com", "0606060606", null, job, null, null);
        Employee employee2 = new Employee(2, "Alex", "Lamoot", "a.l@gmail.com", "0707070707", null, job2, employee, null);
        Department department = new Department(1, "Naze", Arrays.asList(employee, employee2));
        employee.setDepartmentId(department);
        employee2.setDepartmentId(department);
        departmentRepository.save(department);
        Department department1 = departmentRepository.findById(1).orElse(null);
        System.out.println();
    }
}
