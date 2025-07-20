package com.gpayTracker.expense_tracker.controller;

import com.gpayTracker.expense_tracker.entity.Expense;
import com.gpayTracker.expense_tracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//HANLED API END POINTS

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*") // Enable later if you connect frontend
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.saveExpense(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }
}
