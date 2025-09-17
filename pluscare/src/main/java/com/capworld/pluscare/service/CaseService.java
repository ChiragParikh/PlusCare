package com.capworld.pluscare.service;

import com.capworld.pluscare.model.Case;
import com.capworld.pluscare.repository.CaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService
{
    @Autowired
    CaseRepo repo;

    public Case addCase(Case mCase)
    {
        return repo.save(mCase);
    }

    public List<Case> getAllCaseByDoctorId(Integer doctor_id)
    {
        return repo.getAllCaseByDoctorId(doctor_id);
    }

    public Case updateCase(Case mCase)
    {
        return repo.save(mCase);
    }

    public void deleteCaseById(int id)
    {
        repo.deleteById(id);
    }
}
