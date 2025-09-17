package com.capworld.pluscare.controller;

import com.capworld.pluscare.model.Doctor;
import com.capworld.pluscare.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorController
{
    @Autowired
    DoctorService service;

    @GetMapping("/getdoctor/{email}")
    public Doctor getDoctorByEmail(@PathVariable String email)
    {
        return service.getDoctorByEmail(email);
    }

    @PostMapping("/adddoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        doctor.setUserType("doctor");
        return service.addDoctor(doctor);
    }

    @PutMapping("/updatedoctor")
    public Doctor updateDoctor(@RequestBody Doctor doctor)
    {
        return service.updateDoctor(doctor);
    }

    @GetMapping("/getalldoctors")
    public List<Doctor> getAllDoctors()
    {
        return service.getAllDoctors();
    }

    @DeleteMapping("/deletedoctor/{id}")
    public void deleteDoctor(@PathVariable int id)
    {
        service.deleteDoctorById(id);
    }
}
