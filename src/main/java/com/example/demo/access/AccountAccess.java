package com.example.demo.access;

import com.example.demo.Utils;
import com.example.demo.model.AccountEntity;
import com.example.demo.model.UserAccountEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AccountAccess implements IAccountAccess {

    private final AccountRepository accountRepository;

    @Override
    public List<AccountEntity> findAccount(Map<String, Object> searchCriteria) {
        AccountEntity accountEntity = Utils.getInstance(AccountEntity.class, searchCriteria);
        Example<AccountEntity> example = Example.of(accountEntity);
        List<AccountEntity> accountEntities = this.accountRepository.findAll(example);
        return accountEntities;
    }

    @Override
    public List<UserAccountEntity> findUserAccount(Map<String, Object> searchCriteria) {
        UserAccountEntity userAccountEntity = Utils.getInstance(UserAccountEntity.class, searchCriteria);
        Example<UserAccountEntity> example = Example.of(userAccountEntity);
        List<UserAccountEntity> userAccountEntities = this.accountRepository.findAll(example);
        return userAccountEntities;
    }

}
