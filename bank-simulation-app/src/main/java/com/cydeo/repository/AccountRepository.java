package com.cydeo.repository;

import com.cydeo.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

    // class will be representing db
    public static List<Account> accountList = new ArrayList<>();

    public Account save(Account account) {
        accountList.add(account);
        return account;
    }
    public List<Account> findAll(){
        return findAll();
    }
}
