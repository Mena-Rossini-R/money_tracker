package com.gpayTracker.expense_tracker.repository;


import com.gpayTracker.expense_tracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

//handles db interaction
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Custom queries if needed later
}
