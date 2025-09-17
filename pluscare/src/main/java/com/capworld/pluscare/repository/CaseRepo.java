package com.capworld.pluscare.repository;

import com.capworld.pluscare.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseRepo extends JpaRepository<Case,Integer>
{
    public List<Case> getAllCaseByDoctorId(Integer doctor_id);
}
