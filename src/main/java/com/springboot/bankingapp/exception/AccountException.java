package com.springboot.bankingapp.exception;

public class AccountException extends RuntimeException{
    public AccountException(String message)
    {
        super(message);
    }
}
