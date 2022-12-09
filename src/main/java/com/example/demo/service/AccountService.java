package com.example.demo.service;

import com.example.demo.access.AccountAccess;
import com.example.demo.model.AccountEntity;
import com.example.demo.model.UserAccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountAccess accountAccess;

    public List<AccountEntity> findUser(String Id) {
        Map<String, Object> searchCriteria = new HashMap<>();
        searchCriteria.put("Id", Id);
        return accountAccess.findAccount(searchCriteria);
    }

}
