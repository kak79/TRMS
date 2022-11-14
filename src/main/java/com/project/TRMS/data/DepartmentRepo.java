package com.project.TRMS.data;

import com.project.TRMS.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository <Department, Integer> {
}
