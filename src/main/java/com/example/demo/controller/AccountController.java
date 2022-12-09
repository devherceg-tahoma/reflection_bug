package com.example.demo.controller;

import com.example.demo.model.AccountEntity;
import com.example.demo.model.UserAccountEntity;
import com.example.demo.service.AccountService;
import com.example.demo.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/V1/account")
public class AccountController implements IAccountController {

    private final AccountService accountService;
    private final UserAccountService userAccountService;

    @Override
    public List<AccountEntity> getAccount(String id) {
        return accountService.findUser(id);
    }

    @Override
    public List<UserAccountEntity> getUserAccount(String id) {
        return userAccountService.findIDMUser(id);
    }

}
