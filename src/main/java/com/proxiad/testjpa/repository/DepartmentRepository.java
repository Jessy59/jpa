package com.proxiad.testjpa.repository;

import com.proxiad.testjpa.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
