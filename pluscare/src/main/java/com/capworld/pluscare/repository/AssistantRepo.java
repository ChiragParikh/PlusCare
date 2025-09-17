package com.capworld.pluscare.repository;

import com.capworld.pluscare.model.Assistant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssistantRepo extends JpaRepository<Assistant,Integer>
{
    public Assistant findByEmail(String email);
    public List<Assistant> getAllAssistantsByDoctorId(Integer doctor_id);
}
