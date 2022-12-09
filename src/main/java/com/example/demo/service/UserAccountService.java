package com.example.demo.service;

import com.example.demo.access.AccountAccess;
import com.example.demo.model.UserAccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserAccountService {

    private final AccountAccess accountAccess;

    public List<UserAccountEntity> findIDMUser(String idmUserId) {
        Map<String, Object> searchCriteria = new HashMap<>();
        searchCriteria.put("idmUserId", idmUserId);
        return accountAccess.findUserAccount(searchCriteria);
    }

}
