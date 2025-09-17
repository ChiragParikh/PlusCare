package com.capworld.pluscare.service;

import com.capworld.pluscare.model.Doctor;
import com.capworld.pluscare.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService
{
    @Autowired
    DoctorRepo repo;

    public Doctor getDoctorByEmail(String email)
    {
        return repo.findByEmail(email);
    }

    public Doctor addDoctor(Doctor doctor)
    {
        return repo.save(doctor);
    }

    public List<Doctor> getAllDoctors()
    {
        return repo.findAll();
    }

    public Doctor updateDoctor(Doctor doctor)
    {
        return repo.save(doctor);
    }

    public void deleteDoctorById(int doctorId) {
        repo.deleteById(doctorId);
    }
}
