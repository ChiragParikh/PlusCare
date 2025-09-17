package com.capworld.pluscare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient extends User
{
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    private String bloodGroup;
    private double weight;
    private double height;
    private String disease;
    private String currentMedication;
    private String reactiveTo;
}
