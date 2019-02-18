package com.example.exceptions.basics;

public class TransactionException extends RuntimeException {
    private Transaction tr;
    public TransactionException(Transaction tr) {
        this.tr = tr;
    }

    public TransactionException(String message, Transaction tr) {
        super(message);
        this.tr = tr;
    }
}
