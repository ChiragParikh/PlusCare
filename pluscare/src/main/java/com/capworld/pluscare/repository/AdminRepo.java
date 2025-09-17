package com.capworld.pluscare.repository;

import com.capworld.pluscare.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>
{
    public Admin findByEmail(String email);
    public Boolean existsByEmail(String email);
}
