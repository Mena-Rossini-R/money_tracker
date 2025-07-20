package com.gpayTracker.expense_tracker.entity;

// To map the database table
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private double amount;
    private String description;
    private LocalDate date;

    // Getters and Setters
}



































