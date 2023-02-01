package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>{
    List<Whisky> findByYear(int year);
    List<Whisky> findByAgeAndDistilleryName(int age,String distilleryName);
    List<Whisky> findByDistilleryRegion(String region);

}
