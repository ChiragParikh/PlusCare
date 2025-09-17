package com.capworld.pluscare.repository;

import com.capworld.pluscare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Integer>
{
    public Patient findByEmail(String email);
    public List<Patient> getAllPatientByDoctorId(Integer doctor_id);
}
