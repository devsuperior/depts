package com.devsuperior.depts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.depts.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
