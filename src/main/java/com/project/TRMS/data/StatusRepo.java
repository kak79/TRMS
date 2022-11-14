package com.project.TRMS.data;

import com.project.TRMS.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status, Integer> {
}
