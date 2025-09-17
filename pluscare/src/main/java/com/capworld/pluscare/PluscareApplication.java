package com.capworld.pluscare;

import com.capworld.pluscare.model.Admin;
import com.capworld.pluscare.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PluscareApplication
{
	@Autowired
    static AdminService adminService;
	public static void main(String[] args)
	{
		SpringApplication.run(PluscareApplication.class, args);
	}
}
