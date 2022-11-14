package com.project.TRMS.data;

import com.project.TRMS.models.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReimbursementRepo extends JpaRepository<Reimbursement, Integer> {
}
