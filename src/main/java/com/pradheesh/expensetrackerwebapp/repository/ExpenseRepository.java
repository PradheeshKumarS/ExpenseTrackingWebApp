package com.pradheesh.expensetrackerwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradheesh.expensetrackerwebapp.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
