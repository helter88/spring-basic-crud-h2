package com.srt.accounts.repository;

import com.srt.accounts.entity.Accounts;
import com.srt.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts>findByCustomerId(Long customerId);

    @Transactional
    @Modifying
    void deleteByCustomerId (Long customerId);
}
