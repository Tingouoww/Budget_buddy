package com.ting.dao;

import com.ting.model.Transaction;

import java.util.List;

// 定義交易資料庫操作方法
// interface : 只定義 [有哪些方法]，不會實作內容
// Data Access Object
public interface TransactionDAO {
    void addTransaction(Transaction transaction); //新增
    List<Transaction> getAllTransaction(); //取得所有交易列表
    Transaction getTransactionById(int id); //取得單一交易資料
    void updateTransaction(Transaction transaction); //更新交易
    void deleteTransaction(int id); //刪除交易
}

