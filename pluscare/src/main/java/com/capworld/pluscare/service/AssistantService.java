package com.capworld.pluscare.service;

import com.capworld.pluscare.model.Assistant;
import com.capworld.pluscare.repository.AssistantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistantService
{
    @Autowired
    AssistantRepo repo;

    public Assistant getAssistantByEmail(String email)
    {
        return repo.findByEmail(email);
    }

    public Assistant addAssistant(Assistant assistant)
    {
        return repo.save(assistant);
    }

    public List<Assistant> getAllAssistantsByDoctorId(Integer doctor_id)
    {
        return repo.getAllAssistantsByDoctorId(doctor_id);
    }

    public Assistant updateAssistant(Assistant assistant)
    {
        return repo.save(assistant);
    }

    public void deleteAssistantById(int assistantId)
    {
        repo.deleteById(assistantId);
    }
}
