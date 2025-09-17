package com.capworld.pluscare.service;

import com.capworld.pluscare.model.Patient;
import com.capworld.pluscare.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService
{
    @Autowired
    PatientRepo repo;

    public Patient getPatientByEmail(String email)
    {
        return repo.findByEmail(email);
    }

    public Patient addPatient(Patient patient)
    {
        return repo.save(patient);
    }

    public List<Patient> getAllPatientsByDoctorId(Integer doctor_id)
    {
        return repo.getAllPatientByDoctorId(doctor_id);
    }

    public Patient updatePatient(Patient patient)
    {
        return repo.save(patient);
    }
    public void deletePatientById(int patientId)
    {
        repo.deleteById(patientId);
    }
}
