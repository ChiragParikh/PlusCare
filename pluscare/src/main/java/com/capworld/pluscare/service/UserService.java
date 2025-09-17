package com.capworld.pluscare.service;

import com.capworld.pluscare.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService
{
    @Autowired
    DoctorService doctorService;
    @Autowired
    AdminService adminService;
    @Autowired
    AssistantService assistantService;
    @Autowired
    PatientService patientService;

    public ResponseEntity<?> verifyUser(User user)
    {
        if(Objects.equals(user.getUserType(),"admin"))
        {
            Admin admin = adminService.getAdminByEmail(user.getEmail());
            if(Objects.equals(user.getEmail(), admin.getEmail()) && Objects.equals(user.getPassword(), admin.getPassword()))
            {
                return ResponseEntity.ok(admin);
            }
        }
        else if(Objects.equals(user.getUserType(), "doctor"))
        {
            Doctor doctor = doctorService.getDoctorByEmail(user.getEmail());
            if (Objects.equals(user.getPassword(), doctor.getPassword())) {
                return ResponseEntity.ok(doctor);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Email or Password");
            }
        }
        else if(Objects.equals(user.getUserType(),"assistant"))
        {
            Assistant assistant = assistantService.getAssistantByEmail(user.getEmail());
            if (Objects.equals(user.getPassword(), assistant.getPassword())) {
                return ResponseEntity.ok(assistant);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Email or Password");
            }
        }
        else if(Objects.equals(user.getUserType(),"patient"))
        {
            Patient patient = patientService.getPatientByEmail(user.getEmail());
            if (Objects.equals(user.getPassword(), patient.getPassword())) {
                return ResponseEntity.ok(patient);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Email or Password");
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Fail");
    }
}
