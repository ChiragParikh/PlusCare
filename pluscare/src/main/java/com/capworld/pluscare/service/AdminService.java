package com.capworld.pluscare.service;

import com.capworld.pluscare.model.Admin;
import com.capworld.pluscare.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService
{
    @Autowired
    AdminRepo repo;

    public Admin getAdminByEmail(String email)
    {
        return repo.findByEmail(email);
    }

}
