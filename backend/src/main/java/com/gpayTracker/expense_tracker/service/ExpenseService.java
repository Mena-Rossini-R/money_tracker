package com.gpayTracker.expense_tracker.service;

import com.gpayTracker.expense_tracker.dto.ExpenseDTO;
import com.gpayTracker.expense_tracker.entity.Expense;
import com.gpayTracker.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//handles business logic like filtering, adding,updating

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repo;

    public Expense saveExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repo.findAll();
    }
}
