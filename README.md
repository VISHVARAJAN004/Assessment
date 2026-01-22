# Exercise 3 – Bank Account Simulation  

(Exception Handling + OOP + Collections)

---

## Problem Statement  

Simulate basic bank account operations using Java concepts such as Object-Oriented Programming, custom exceptions, collections, and streams.

---

## Requirements  

### Account Class  

Create an `Account` class with the following fields:

- accountNo  
- holderName  
- balance  

---

### Custom Exception  

Create a custom exception:

- InsufficientBalanceException  

This exception should be thrown when the withdrawal amount is greater than the available balance.

---

### Data Storage  

Store all accounts using the following collection:

- HashMap<Integer, Account>  

---

### Operations  

Implement the following operations:

- Deposit amount  
- Withdraw amount  
  - Throw `InsufficientBalanceException` if balance is insufficient  
- Display all accounts  
- Find accounts with balance greater than 50,000 using Java 8 Streams  

---

## Concepts Used  

- Custom Exception  
- Object-Oriented Programming (OOP)  
- Collections (Map, HashMap)  
- Java 8 Streams  

---
