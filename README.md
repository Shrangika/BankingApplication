# BankingApplication
Welcome to the Banking Application repository!This application provides a set of APIs to perform CRUD operations on transactions, as well as functionalities to read the history of transactions. It serves as a backend system for managing financial transactions efficiently.

# Technologies Used
# Java: 
Core programming language for backend development.

# Spring Boot: 
Framework for building robust and scalable Java applications.
Port Number-8080

# Spring Security: 
Provides authentication and authorization functionalities.

# Hibernate:
Object-relational mapping library for data persistence.

# MySQL:
Relational database management system for storing account information and transaction records.
Port Number:3306

# Maven:
Dependency management tool for Springboot projects.

# API Endpoints
# PostMapping(/api/accounts): 
To create new account
# GetMapping(/api/accounts/{id})
To get account with the given accountId
# PutMapping(/api/accounts/{id}/deposit)
To deposit the amount in the given accountId
# PutMapping(/api/accounts/{id}/withdraw)
To withdraw account from the given accountId
# GetMapping(/api/accounts)
To get all accounts present in database
# DeleteMapping(/api/accounts/{id})
To delete the account with given accountId
# PostMapping(/api/accounts/transfer)
To transfer money from account1 to account2
# GetMapping(/api/accounts/{id}/transactions)
To retrieve transaction history for the given account
