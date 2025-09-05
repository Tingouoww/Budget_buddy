package com.ting.dao;

import com.ting.model.Transaction;
import com.ting.dao.TransactionDAO;

import java.util.ArrayList;
import java.util.List;


public class TransactionDAOImpl implements TransactionDAO{
    @Override
    public void addTransaction(Transaction transaction) {
        System.out.println("TransactionDAOImpl.addTransaction");
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return new ArrayList<>();
    }

    @Override
    public Transaction getTransactionById(int id) {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        return;
    }

    @Override
    public void deleteTransaction(int id) {
        return;
    }
}