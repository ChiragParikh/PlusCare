package com.capworld.pluscare.config;

import com.capworld.pluscare.model.Admin;
import com.capworld.pluscare.repository.AdminRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements CommandLineRunner
{
    private final AdminRepo adminRepo;

    public AdminInitializer(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @Override
    public void run(String... args) throws Exception
    {
        if (!adminRepo.existsByEmail("admin"))
        {
            Admin admin = new Admin();
            admin.setUserType("admin");
            admin.setFirstName("Admin");
            admin.setLastName("Admin");
            admin.setContact("123");
            admin.setEmail("admin");
            admin.setPassword("admin");
            adminRepo.save(admin);
            System.out.println("Default admin user created.");
        }
    }
}
