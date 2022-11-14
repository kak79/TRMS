package com.project.TRMS.data;

import com.project.TRMS.models.GradingFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradingFormatRepo extends JpaRepository<GradingFormat, Integer> {
}
