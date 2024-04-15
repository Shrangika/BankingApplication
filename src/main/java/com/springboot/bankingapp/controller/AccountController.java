package com.springboot.bankingapp.controller;

import com.springboot.bankingapp.dto.AccountDto;
import com.springboot.bankingapp.dto.TransactionDto;
import com.springboot.bankingapp.dto.TransferFundDto;
import com.springboot.bankingapp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //Add Account REST API
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto)
    {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    // Get Account By id REST API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable Long id)
    {
        return new ResponseEntity<>(accountService.getAccountBYId(id),HttpStatus.OK);
    }


    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String ,Double> request){
        Double amount =request.get("amount");
        AccountDto accountDto = accountService.deposit(id, amount);
        return ResponseEntity.ok(accountDto);
    }

    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
                                              @RequestBody Map<String ,Double> request){
        Double amount =request.get("amount");
        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
      accountService.deleteAccount(id);
        return ResponseEntity.ok("Account is deleted successfully");
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transferFund(@RequestBody TransferFundDto transferFundDto)
    {
     accountService.transferFunds(transferFundDto);
     return ResponseEntity.ok("Transfer Successfull");
    }

    @GetMapping("/{id}/transactions")
    public ResponseEntity<List<TransactionDto>> fetchAccountTransactions(@PathVariable("id") Long accountId)
    {
        List<TransactionDto> transactionDtos = accountService.getAccountTransactions(accountId);
        return ResponseEntity.ok(transactionDtos);
    }
}
