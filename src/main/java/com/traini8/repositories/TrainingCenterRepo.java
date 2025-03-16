package com.traini8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traini8.entitites.TrainingCenter;

@Repository
public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, Long> {

}
