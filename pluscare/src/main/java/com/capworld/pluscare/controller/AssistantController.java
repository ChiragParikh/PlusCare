package com.capworld.pluscare.controller;

import com.capworld.pluscare.model.Assistant;
import com.capworld.pluscare.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AssistantController
{
    @Autowired
    AssistantService service;

    @GetMapping("/getassistant/{email}")
    public Assistant getAssistantByEmail(@PathVariable String email)
    {
        return service.getAssistantByEmail(email);
    }

    @PostMapping("/addassistant")
    public Assistant addAssistant(@RequestBody Assistant assistant)
    {
        assistant.setUserType("assistant");
        return service.addAssistant(assistant);
    }

    @GetMapping("/getAllAssistant/{id}")
    public List<Assistant> getAllAssistantsByDoctor(@PathVariable Integer id)
    {
        return service.getAllAssistantsByDoctorId(id);
    }

    @PutMapping("/updateassistant")
    public Assistant updateAssistant(@RequestBody Assistant assistant)
    {
        return service.updateAssistant(assistant);
    }

    @DeleteMapping("/deleteassistant/{id}")
    public void deleteAssistant(@PathVariable int id)
    {
        service.deleteAssistantById(id);
    }
}
