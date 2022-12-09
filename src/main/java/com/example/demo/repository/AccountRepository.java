package com.example.demo.repository;

import com.example.demo.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> findById(Long id);

    Optional<AccountEntity> findByUuid(String uuid);

    void deleteByUuid(String uuid);
}
