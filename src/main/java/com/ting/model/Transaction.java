package com.ting.model;

import java.time.LocalDate;

// 每筆交易資料類別
public class Transaction{

    private int id;
    private LocalDate date;
    private double amount; // 金額
    private String category; // 類別
    private String description; //備註

    public Transaction(int id, LocalDate date, double amount, String category, String description){
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    // getter & setter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // 方便印出
    @ Override
    public String toString(){
        return String.format("Transaction{id = %d, date = %s, amount = %.2f, category = '%s', description = '%s'}",
                id, date, amount, category, description);
    }
}
