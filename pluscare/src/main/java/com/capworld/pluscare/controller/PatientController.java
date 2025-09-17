package com.capworld.pluscare.controller;

import com.capworld.pluscare.model.Assistant;
import com.capworld.pluscare.model.Patient;
import com.capworld.pluscare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PatientController
{
    @Autowired
    PatientService service;

    @GetMapping("/getpatient/{email}")
    public Patient getPatientByEmail(@PathVariable String email)
    {
        return service.getPatientByEmail(email);
    }

    @PostMapping("/addpatient")
    public Patient addPatient(@RequestBody Patient patient)
    {
        patient.setUserType("patient");
        return service.addPatient(patient);
    }

    @GetMapping("/getAllPatient/{id}")
    public List<Patient> getAllPatientByDoctor(@PathVariable Integer id)
    {
        return service.getAllPatientsByDoctorId(id);
    }

    @PutMapping("/updatepatient")
    public Patient updatePatient(@RequestBody Patient patient)
    {
        return service.updatePatient(patient);
    }

    @DeleteMapping("/deletpatient/{id}")
    public void deletePatient(@PathVariable int id)
    {
        service.deletePatientById(id);
    }
}
