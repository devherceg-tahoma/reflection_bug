package com.example.demo.access;

import com.example.demo.model.AccountEntity;
import com.example.demo.model.UserAccountEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IAccountAccess {

    List<AccountEntity> findAccount(Map<String, Object> searchCriteria);

    List<UserAccountEntity> findUserAccount(Map<String, Object> searchCriteria);

}
