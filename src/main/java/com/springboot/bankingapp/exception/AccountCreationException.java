package com.springboot.bankingapp.exception;

public class AccountCreationException extends RuntimeException{
    public AccountCreationException(String message)
    {
        super(message);
    }
}
