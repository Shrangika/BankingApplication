package com.springboot.bankingapp.service;

import com.springboot.bankingapp.dto.AccountDto;
import com.springboot.bankingapp.dto.TransactionDto;
import com.springboot.bankingapp.dto.TransferFundDto;
import com.springboot.bankingapp.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountBYId(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id,double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long accountId);
}
