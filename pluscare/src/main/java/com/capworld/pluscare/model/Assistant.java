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
public class Assistant extends User
{
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
