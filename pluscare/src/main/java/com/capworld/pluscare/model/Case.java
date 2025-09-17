package com.capworld.pluscare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medical_case")
public class Case
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long caseNo;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    private String symptoms;
    private String diagnosis;
    private String advice;
    private BigDecimal fees;
}
