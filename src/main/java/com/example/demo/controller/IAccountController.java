package com.example.demo.controller;

import com.example.demo.model.AccountEntity;
import com.example.demo.model.UserAccountEntity;

import java.util.List;

public interface IAccountController {
    List<AccountEntity> getAccount(String uuid);

    List<UserAccountEntity> getUserAccount(String id);

}
