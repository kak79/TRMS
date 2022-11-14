package com.project.TRMS.data;

import com.project.TRMS.models.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepo extends JpaRepository<EventType, Integer> {
}
